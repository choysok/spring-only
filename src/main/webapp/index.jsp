<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>


<a href="/hello">入门程序</a>

<form action="/dateChange" method="post">
    生日： <input type="text" name="birthday">

    <input type="submit" value="提交">
</form>



<a href="/servletapi">Servlet原生API</a><br>

<a href="/annot/testAnnotParam?username=张三是也！">RequestParam测试</a><br>

<br>
<form action="/annot/testRequestBody" method="post">
    RequestBody： <input type="text" name="birthday">
    Age： <input type="text" name="age">
    <input type="submit" value="提交">
</form>


<br>

<a href="/annot/testPathVariable">testPathVariable测试</a><br>
<br>
<a href="/annot/testPathVariable/10">testPathVariable测试</a><br>

<br>
<a href="/annot/testRequestHeader">testRequestHeader测试</a><br>

<br>
<a href="/annot/testCookieValue">testCookieValue测试</a><br>

<br>

<form action="/annot/testModelAttribute" method="post">
    Age： <input type="text" name="age">
    <input type="submit" value="提交">
</form>

<br>
<a href="/annot/testSessionAttribute">testSessionAttribute测试</a><br>

<br>

<a href="/annot/GetSessionAttribute">GetSessionAttribute测试</a><br>

<br>

<a href="/annot/DelSessionAttribute">GetSessionAttribute测试</a><br>
</body>
</html>
