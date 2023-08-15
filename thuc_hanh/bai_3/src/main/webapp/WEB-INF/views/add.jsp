<%--
  Created by IntelliJ IDEA.
  User: binh1
  Date: 8/15/2023
  Time: 10:31 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Title</title>
</head>
<body>
<form action="/add" method="post">
	<input type="text" name="name"> <br>
	<input type="text" name="address"> <br>
	<select name="status">
		<option value="false">Chưa Hoàn Thành</option>
		<option value="true">Hoàn Thành</option>
	</select>
	<button type="submit">UPDATE</button>
</form>
</body>
</html>
