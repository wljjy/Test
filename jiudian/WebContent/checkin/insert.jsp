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
	<h3>添加入住信息</h3>
	${errorcheckin}
	${errorCustomername}
	<form action="../insertCheckin" method="post">
		姓名：<input type="text" name="name"/><br/>
		性别：<input type="text" name="sex"/><br/>
		房号：<input type="text" name="roomNumber"/><br/>
		入住时间：<input type="date" name="intime" value="{{ member.birthday | date:'Y-m-d' }}" placeholder="入住日期"><br/>
		应退房时间：<input type="date" name="outtime" value="{{ member.birthday | date:'Y-m-d' }}" placeholder="入住日期"><br/>
		入住天数：<input type="text" name="liveDay"/><br/>
		入住状态：<input type="text" name="livetype"/><br/>
		<input type="submit" value="添加"/><input type="reset" value="重置"/><a href="/hotel/selectAllCheckin">取消</a>
	</form>
</body>
</html>