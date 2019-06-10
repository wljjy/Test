<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>添加退房信息</h3>
	<form action="/hotel/insertCheckOut" method="post">
	姓名：<select name="name">
		<c:forEach items="${selectAll}" var="all">
			<tr>
			<option value="${all.name}">${all.name}</option>
			</tr>
		</c:forEach>
		</select><br/>
	房号：<select name="roomNumber">
		<c:forEach items="${selectByType}" var="all">
			<tr>
			<option value="${all.roomNumber}">${all.roomNumber}</option>
			</tr>
		</c:forEach>
		</select><br/>
		退房时间：<input type="date" name="outtime" value="{{ member.birthday | date:'Y-m-d' }}" placeholder="退房日期"><br/>
		<input type="submit" value="添加"/><input type="reset" value="重置"/><a href="/hotel/selectCheckOutAll">取消</a>
	</form>
</body>
</html>