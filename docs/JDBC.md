# JDBC

即 Java DataBase Connectivity

## DriverManager

注册驱动&获取数据库连接

`url=jdbc:mysql://localhost:3306/<DB>?<key>=<value>`

useSSL: boolean 启用或禁用 SSL 连接方式

## Connection

获取执行SQL对象&管理事务

开启 BEGIN `setAutoCommit(boolean)`

提交 COMMIT `commit()`

回滚 ROLLBACK `rollback()`

## Statement

执行SQL语句

DQL `executeQuery(String)` 查
DDL&DML `executeUpdate(String)` 增删改

## ResultSet

封装 DQL 查询语句结果

`boolean next()` 移动光标&判断当前行有效性

`XXX getXXX()` 获取不同数据类型的数据

## PreparedStatement

预编译 SQL 语句，避免 SQL 注入问题

## 数据库连接池

复用数据库连接
可以资源重用与提升系统响应速度

Connection

Druid
