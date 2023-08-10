package repository

import (
	"bufio"
	"encoding/json"
	"os"
	"sync"
)

var (
	postIndexMap map[int64][]*Post
)

type Post struct {
	Id         int64  `json:"id"`
	ParentId   int64  `json:"parent_id"`
	Content    string `json:"content"`
	CreateTime int64  `json:"create_time"`
}

type PostDao struct{}

var (
	postDao  *PostDao
	postOnce sync.Once
)

func NewPostDaoInstance() *PostDao {
	postOnce.Do(
		func() {
			postDao = &PostDao{}
		})
	return postDao
}

func (*PostDao) QueryPostByParentId(id int64) []*Post {
	return postIndexMap[id]
}

func InitPostIndexMap(filePath string) error {
	open, err := os.Open(filePath + "post")
	if err != nil {
		return err
	}

	scanner := bufio.NewScanner(open)
	postTmpMap := make(map[int64][]*Post)

	for scanner.Scan() {
		text := scanner.Text()
		var post Post
		if err := json.Unmarshal([]byte(text), &post); err != nil {
			return err
		}

		posts, ok := postTmpMap[post.ParentId]
		if !ok {
			posts = make([]*Post, 0)
		}
		posts = append(posts, &post)
		postTmpMap[post.ParentId] = posts
	}

	postIndexMap = postTmpMap

	return nil
}
