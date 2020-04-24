<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 2020/4/20
  Time: 20:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>入门成功啦</h2>
<form action="/param/userParam" method="post">
    姓名: <input type="text" name="username"><br>
    密码：<input type="text" name="password"><br>

    User年龄：<input type="text" name="user.age"><br>
    User金额：<input type="text" name="user.money"><br>

    List年龄：<input type="text" name="list[0].age"><br>
    List金额：<input type="text" name="list[0].money"><br>

    Map年龄：<input type="text" name="map['key'].age"><br>
    Map金额：<input type="text" name="map['key'].money"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
