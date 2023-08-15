<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: binh1
  Date: 8/15/2023
  Time: 10:05 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Title</title>
</head>
<body>
<a href="/add">ADD</a>
<table border="10" cellspacing="10" cellpadding="10">
	<thead>
	<tr>
		<th>STT</th>
		<th>NAME</th>
		<th>ADDRESS</th>
		<th>STATUS</th>
		<th colspan="2">ACTIONS</th>
	</tr>
	</thead>
	<tbody>
	<c:forEach items="${data}" var="s">
		<tr>
			<td>${s.id}</td>
			<td>${s.name}</td>
			<td>${s.address}</td>
			<td>${s.status ? "Hoàn Thành" : "Chưa Hoàn Thành"}</td>
			<td><a href="/edit/${s.id}">EDIT</a></td>
			<td><a href="/delete/${s.id}">DELETE</a></td>
		</tr>
	</c:forEach>
	</tbody>
</table>
</body>
</html>
