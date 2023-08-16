<%--
  Created by IntelliJ IDEA.
  User: binh1
  Date: 8/16/2023
  Time: 8:02 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Title</title>
</head>
<body>
<form action="/done" method="post">
	<h1>Buy SandWich Condiments</h1>
	<input type="checkbox" name="condiments" id="lettuce" value="lettuce">
	<label for=lettuce>Lettuce</label>
	<input type="checkbox" name="condiments" id="tomato" value="tomato">
	<label for=tomato>Tomato</label>
	<input type="checkbox" name="condiments" id="mustard" value="mustard">
	<label for=mustard>Mustard</label>
	<input type="checkbox" name="condiments" id="sprouts" value="sprouts">
	<label for=sprouts>Sprouts</label>
	<br>
	<button>Save</button>
</form>
</body>
</html>
