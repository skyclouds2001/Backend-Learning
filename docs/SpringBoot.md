# SpringBoot

## 简介

简化Spring程序的初始搭建及开发过程

## 配置

配置文件（优先级自上而下递减）

* application.properties
* application.yml
* application.yaml

多环境配置

使用`---`分割创建多个环境，并使用`spring.config.activate.on-profile | yml spring.profiles.active | properties`声明不同的环境

分别创建多个环境的配置文件

## 初始化

使用 Spring Initializr

* 勾选 Spring Web - 添加 SpringMvc
* 勾选 MyBatis Framework 及 MySQL Driver - 添加 MyBatis

## SSM 整合

* pom.xml 依赖坐标
* application.xml 参数配置
* Application 主类
* controller 展示层类包
* dao 数据访问层类包
* domain 数据模型类包
* service 业务层类包
