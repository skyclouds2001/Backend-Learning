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
