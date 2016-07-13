# 一个简单的web demo


## Goal

通过一个简单的项目，把Spring, Spring MVC, MyBatis, MySQL,restful使用起来，现在的应用通常都是移动端发出http请求，服务端返回json格式的数据。

## Step

* 数据库见表 ， 看schema.sql，插入一些数据
* mvn clean package构建
* 部署到tomcat中
* 访问 http://localhost:8080/app/spitter/json/test,返回一个json格式的结果

## Reference

之前阅读的[《Spring In Action》](https://github.com/vonzhou/SpringInAction3)