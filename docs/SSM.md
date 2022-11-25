# SSM

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
配置 spring 类 `@Component` `@Component("productDao")`
