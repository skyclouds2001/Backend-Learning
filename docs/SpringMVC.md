# SpringMVC

Web层开发技术

表现层（SpringMVC、servlet）-业务层-数据层（MyBatis、MyBatis Plus）

基于Java实现MVC模型的轻量级Web框架

## 入门案例

`@RequestMapping` 设置控制器方法访问路径
`@ResponseBody` 设置请求方法返回内容即为当前返回值

```
配置SpringMVC容器
@Configuration
@ComponentScan("org.example.controller")
```

```
配置servlet
extends AbstractDispatcherServletInitializer {
createServletApplicationContext() 加载SpringMVC配置
getServletMappings() 设置处理的HTTP路径范围
createRootApplicationContext() 加载Spring容器配置
}
```

工作流程

初始化服务器过程

* 服务器启动，执行ServletContainersInitConfig类，初始化web容器
* 执行createServletApplicationContext方法，创建了WebApplicationContext对象
* 加载SpringMvcConfig
* 执行@ComponentScan加载对应的bean
* 加载UserController，每个@RequestMapping的名称对应一个具体的方法
* 执行getServletMappings方法，定义所有的请求都通过SpringMVC

执行单次请求过程

* 发送请求localhost/save
* web容器发现所有请求都经过SpringMVC，将请求交给SpringMVC处理
* 解析请求路径/save3
* 由/save匹配执行对应的方法save()
* 执行save()
* 检测到有@ResponseBody直接将save()方法的返回值作为响应求体返回给请求方

## 加载控制

controller加载控制与业务bean加载控制

SpringMVC controller包
Spring 单独指定 或 全部指定同时排除controller包 或 直接一并加载

```
@ComponentScan(value = "org.example", excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class}))
```

## 请求及响应

### 请求路径设置

建议按`/路径/操作`的形式

为简洁起见，可直接在模块类上使用`@RequestMapping`指定请求路径

### 请求方法设置

使用指定请求方法的Mapping

`@GetMapping`
`@PostMapping`
`@PutMapping`
`@DeleteMapping`

### 请求参数配置

乱码问题设置过滤器解决 `getServletFilters()`

普通参数  直接在方法中声明参数
参数识别别名  `@RequestParam`
POJO参数  方法参数指定为数据模型对象
Array、List（多个请求参数且参数名相同）  同上

JSON参数 Mvc配置类添加`@EnableWebMvc`注解 对应方法添加`@RequestBody`注解即指定请求参数位于请求体中

日期参数 使用`@DateTimeFormat(pattern=)`指定转换模式

### 响应配置

JSP页面 直接返回JSP文件路径
普通文本、JSON等等 注解`@ResponseBody`
