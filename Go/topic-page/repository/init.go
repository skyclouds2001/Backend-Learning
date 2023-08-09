package repository

import "sync"

func Init() error {
	var ch = make(chan error, 2)
	defer close(ch)

	var wg sync.WaitGroup

	wg.Add(2)
	go func() {
		err := InitTopicIndexMap(".")
		ch <- err
	}()
	go func() {
		err := InitPostIndexMap(".")
		ch <- err
	}()
	wg.Wait()

	err1, err2 := <-ch, <-ch
	if err1 != nil {
		return err1
	}
	if err2 != nil {
		return err2
	}

	return nil
}
