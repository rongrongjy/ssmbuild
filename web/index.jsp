<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 2021/6/15
  Time: 12:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
  <title>首页</title>

  <style type="text/css">/*设置标签的风格*/
  a{
    text-decoration: none;/*去掉下划线*/
    color: black;/*字体颜色*/
    font-size: 18px;/*调节字体的大小*/

  }
  h3{/*h3标签*/
    width: 180px;
    height: 38px;
    text-align: center;/*文本居中*/
    margin: 100px auto;
    line-height: 38px;/*上下居中*/

    background: blanchedalmond;
    border-radius: 5px;/*圆角边框*/
  }
  </style>
</head>
<body>
<h3>
  <a href="${pageContext.request.contextPath}/book/allBook">点击进入书籍页面</a>
</h3>
</body>
</html>