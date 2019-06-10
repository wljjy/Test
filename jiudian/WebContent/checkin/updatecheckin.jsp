<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/hotel/updatecheckin" method="post">
		<input type="hidden" name="id" value="${checkin.id}"/>
	姓名：<input type="text" name="name" value="${checkin.name}"/><br/>
	性别：<input type="text" name="sex" value="${checkin.sex}"/><br/>
	房号：<input type="text" name="roomNumber" value="${checkin.roomNumber}"/><br/>
    入住时间：<input type="date" name="intime" value="${checkin.intime}" placeholder="入住日期"><br/>
应退房时间：<input type="date" name="outtime" value="${checkin.outtime}" placeholder="入住日期"><br/>
    入住天数：<input type="text" name="liveDay" value="${checkin.liveDay}"/><br/>
    入住状态：<input type="text" name="livetype" value="${checkin.livetype}"/><br/>
    消费金额：<input type="text" name="allprice" value="${checkin.allprice}"/><br/>
		<input type="submit" value="修改"/><input type="reset" value="重置"/><a href="/hotel/selectAllCheckin">取消</a>
	</form>
</body>
</html>