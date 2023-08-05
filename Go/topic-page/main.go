package topic_page

import (
	"github.com/gin-gonic/gin"
)

func main() {
	r := gin.Default()

	err := r.Run()
	if err != nil {
		return
	}
}
