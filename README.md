# 信息管理系统Demo

基于Java，Tomcat，jsp的web信息管理系统，已实现分页展示，模糊查询，增删查改用户信息等功能。

- *本项目仅为个人学习Java Web制作，前端来自网络*

- *Author：Wilson*

  

## 工程环境

- [JDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) 1.8

- [MySQL](https://www.mysql.com/downloads/) 5.7.29

- Tomcat 8.5.57

- Bootstrap 3

  

## 运行说明

1. 本程序使用JDK 1.8编写，需配置Tomcat 8.5.57环境。
2. 本程序使用MySQL数据库，使用前请导入[user.sql](resource/user.sql)（带有测试数据的数据库文件）进MySQL，并设置如下：
   - 数据库端口：3306
   - 数据库名：test
   - 数据库用户名：root
   - 数据库密码：root

3. 所需的jar包和前端页面在resource/web目录中，需导入