package topic_page

import (
	"github.com/gin-gonic/gin"
	"os"
	"topic_page/controller"
	"topic_page/repository"
)

func init() {
	err := repository.Init()
	if err != nil {
		os.Exit(-1)
	}
}

func main() {
	r := gin.Default()

	r.Use(gin.Logger())

	r.GET("/community/page/:id", func(c *gin.Context) {
		topicId := c.Param("id")
		data := controller.QueryPageInfo(topicId)
		c.JSON(200, data)
	})

	err := r.Run()
	if err != nil {
		return
	}
}
