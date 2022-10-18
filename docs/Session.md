# Session

* HttpSession
  * setAttribute(*key*, *value*)
  * getAttribute(*key*)

---

Session 基于 Cookie 实现的机制

实质包括 set-cookie 和 cookie

服务器正常关闭后自动保存 session 数据，再启动后自动加载 session 数据

保证保持请求的对象的状态
