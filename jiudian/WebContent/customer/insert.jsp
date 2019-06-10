<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>update</title>
</head>
<body>
	<h3>客户信息添加</h3>
	<form action="../insertcustomer" method="post">
		姓名：<input type="text" name="cname"/><br/>
		年龄：<input type="text" name="cage"/><br/>
		性别：<input type="text" name="sex"/><br/>
		电话：<input type="text" name="phone"/><br/>
		身份证号：<input type="text" name="idNumber"/><br/>
		住址：<input type="text" name="address"/><br/>
		<input type="submit" value="添加"/><input type="reset" value="重置"/><a href="/hotel/selectcustomer">取消</a>
	</form>
</body>
</html>