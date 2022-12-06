## Spring

https://spring.io

EJB->Spring

### Spring Framework系统架构

- Core Container 核心容器
  - Beans
  - Core
  - Context
  - SpEL
- AOP 面向切片编程
- Aspects AOP思想实现
- Data Access/Integration 数据访问/集成
  - JDBC
  - ORM
  - OXM
  - JMS
  - Transactions
- Web Web开发
  - WebSocket
  - Servlet
  - Web
  - Portlet
- Instrumentation
- Messaging
- Test 单元测试与集成测试

### 核心概念

**IOC** 控制反转

对象创建又程序创建转为外部创建

Spring内部提供IoC容器，负责对象创建和初始化，此类对象统称为Bean

**DI** 依赖注入

在容器中建立bean和bean之间依赖关系的整个过程

目标 - **充分解耦**

### 基本操作

添加 spring 核心依赖
配置 spring 配置文件 - beans 配置
主文件获取 beans 管理容器并调取相应的 bean，相应类需提供 set 方法

### 基本配置

* beans 标签
* bean 标签 （默认是单例）
  * id 属性 | bean唯一坐标
  * class 属性 | 对应类
  * name 属性 | bean的别名
* property 标签

### 其他

适合bean处理    表现层对象、业务层对象、数据层对象、工具对象
不适合bean处理    封装实体的域对象

### bean 实例化

默认构造方法
静态工厂-静态方法
实例工厂
FactoryBean

### bean 生命周期

* 初始化
  * 创建对象（内存分配）
  * 执行构造方法
  * 执行属性注入 - set 操作
  * 执行 bean 初始化方法 | 配置 init-method - 实现 InitializingBean 接口
* 使用
  * 执行业务操作
* 关闭
  * 执行 bean 销毁方法 | 配置 destroy-method - 实现 DisposableBean 接口

### 依赖注入方式

setter 注入
构造器注入

一般优先构造器，可选setter
需根据实际情况进行

依赖自动装配 autowire属性
* byName 按名称匹配
* byType 按类型匹配

集合装配
array-value
list-value
map-entry
set-value
props-prop

### 容器

初始化配置文件

顶层接口 BeanFactory
核心接口 ApplicationContext
常用初始化类
ClassPathXmlApplicationContext
FileSystemXmlApplicationContext

id bean id
name bean 别名
class bean 类型，静态工厂类，FactoryBean 类
scope 控制 bean 实例数量
init-method 生命周期初始化方法
destory-method 生命周期销毁方法
autowire 自动装配类型
factory-method bean 工厂方法
facory-bean 实例工厂类
lazy-init 控制是否延迟加载

### 注解开发

配置自动装配 `<context:component-scan base-package="org.example.dao.impl" />`
配置 spring 类 `@Component`

`@Controllor` 控制层（展示层）Bean
`@Service` 业务层Bean
`@Repository` 数据访问层Bean 仅DAO类

以上作用上与 @Component 类似
默认 name 属性是小写开头的类名

可使用class类替代xml配置文件

`@Configuration` 设置为配置类
`@ComponentScan` 设置配置路径
`@PropertySource` 注入配置属性文件

`@Scope` 定义 bean 作用范围

`@PostConstruct` `@PreDestory` 定义 bean 生命周期

`@Autowired` 对应变量 | 注解开发依赖自动注入

`@Qualifier` 选出开发者所需要的bean

`@Value` 简单类型注入

`@Bean` 注释当前方法，说明返回值为一个bean，相当于定义bean

`@Import` 向方法中导入bean

### AOP 简介

面向切面编程【编程范式】

无入侵式 无侵入式

##### 关键概念

* **连接点** 程序执行中的任意位置 （视为方法执行）
* **切入点** 匹配连接点的式子 （可描述一个方法，也可描述多个方法）
* **通知** 在切入点处执行的操作，即共性功能
* **通知类** 定义通知的类
* **切面** 描述通知与切入点的对应关系

##### 示例

```java
@Component
@Aspect
public class Example {
  @Pointcut("execution(void org.example.exapmleDao.save())")
  private void pt() {}

  @Before("pt()")
  public void method() {}
}
```

##### 工作流程

1. Spring 容器启动
2. 读取所有切面配置中的切入点
3. 初始化bean（并判定bean对应类是否匹配到任意切入点，匹配成功的会创建目标对象的代理对象，否则直接创建原对象）
4. 获取bean执行方法

##### 切入点表达式

动作关键字-访问修饰符（可选）-返回值-包名-类接口名-方法名-参数-异常名（可选）

`*`  匹配单个的任意符号

`..` 匹配多个连续的任意符号

`+` 专用于匹配子类类型

##### 通知类型

* 前置通知 @Before
* 后置通知 @After
* 环绕通知 @Around
* 返回后通知 @AfterReturning
* 抛出异常后通知 @AfterThrowing

```java
public Object around(ProceedingJoinPoint pjp) throws Throwable {
  // todo
  Object ret = pjp.proceed();
  // todo
  return ret
}
```

获取数据 JoinPoint  ProceedingJoinPoint
