# MyBatis

一款持久层框架
用于简化 JDBC 开发

配置文件 & 自动完成操作

## 操作步骤

1. 导入模块
2. 创建模块，导入坐标
3. 编写核心配置文件
4. 编写 SQL 映射文件
5. 编写代码
    * 定义核心配置类
    * 加载核心配置文件，获取 SQLSessionFactory 对象
    * 获取 SQLSession 对象，执行 SQL 语句
    * 释放资源

## 一些细节

* 参数占位符
  * #{} 参数传递
  * ${} 表名或列名不固定
* 参数类型
  * parameterType
  * 可以忽略
* 多参数
  * 使用 @Param 注解
  * 使用实体类
  * 使用 Map 集合
* 动态参数
  * <if test="{放入判断条件}">{表达式}</if>
  * 解决 and 问题
    * 表达式均添加and和添加冗余恒等条件
    * <where>替换where关键字
* 单条件
  * <where><choose><when test="{放入判断条件}">{表达式}</when><otherwise></otherwise></choose></where>
