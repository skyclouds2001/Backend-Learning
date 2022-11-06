# Linux

## Linux简介

操作系统
一种计算机软件
作为用户和计算机硬件之间的桥梁

linux系统内核（调度设备等）
+
系统级应用程序（自带应用程序）
=
linux发行版

虚拟机

笔记
虚拟机 VMware Workstation
Linux 发行 cent OS & Ubuntu

操作系统使用方式 - 图形化 & 命令

## 常用Linux命令

目录结构：树型结构、唯一根目录（/）、使用/表示

命令行：Linux终端Terminal
命令：Linux程序

命令格式：`command [-options] [parameter]`
* command 命令本身
* -options 选项
* parameter 命令参数

路径：
* 相对路径
* 绝对路径
* 特殊路径符号
  * .  当前目录
  * ..  上一级目录
  * ~  HOME目录

常见命令：
* `ls [-a -l -h] [Linux路径]` 列出当前目录（或给定目录）的内容（默认以平铺形式）（默认加载路径为/home/<用户名>）
  * -a 列出全部文件（包括隐藏文件，以.开头的文件）
  * -l 以列表形式展示内容并显示更多信息
  * -h 以易读形式列出文件大小（需与-l配合使用）
* `cd [Linux路径]` 切换工作目录（默认返回用户HOME目录）
* `pwd` 查看当前所在的工作目录
