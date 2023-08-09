package service

import (
	"errors"
	"sync"
	"topic_page/repository"
)

type PageInfo struct {
	Topic    *repository.Topic
	PostList []*repository.Post
}

type QueryPageInfoFlow struct {
	topicId  int64
	pageInfo *PageInfo
	topic    *repository.Topic
	posts    []*repository.Post
}

func (f *QueryPageInfoFlow) Do() (*PageInfo, error) {
	if err := f.checkParam(); err != nil {
		return nil, err
	}
	if err := f.prepareInfo(); err != nil {
		return nil, err
	}
	if err := f.packPageInfo(); err != nil {
		return nil, err
	}
	return f.pageInfo, nil
}

func (f *QueryPageInfoFlow) checkParam() error {
	if f.topicId < 0 {
		return errors.New("topic id must be larger than 0")
	}
	return nil
}

func (f *QueryPageInfoFlow) prepareInfo() error {
	var wg sync.WaitGroup

	wg.Add(2)
	go func() {}()
	go func() {}()
	wg.Wait()

	return nil
}

func (f *QueryPageInfoFlow) packPageInfo() error {
	return nil
}
