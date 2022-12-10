# SpringMVC

Web层开发技术

表现层（SpringMVC、servlet）-业务层-数据层（MyBatis、MyBatis Plus）

基于Java实现MVC模型的轻量级Web框架

## 入门案例

`@RequestMapping` 设置控制器方法访问路径
`@ResponseBody` 设置请求方法返回内容即为当前返回值

```
@Configuration
@ComponentScan("org.example.controller")
```

工作流程

* 服务器启动，执行ServletContainersInitConfig类，初始化web容器
* 执行createServletApplicationContext方法，创建了WebApplicationContext对象
* 加载SpringMvcConfig
* 执行@ComponentScan加载对应的bean
* 加载UserController，每个@RequestMapping的名称对应一个具体的方法
* 执行getServletMappings方法，定义所有的请求都通过SpringMVC
