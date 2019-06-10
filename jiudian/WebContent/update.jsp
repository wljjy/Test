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
	${error1}
	<form action="update" method="post">
		<input type="hidden" name="id" value="${selOne.id}"/>
		房号：<input type="text" name="roomNumber" value="${selOne.roomNumber}"/><br/>
		大小：<input type="text" name="daxiao" value="${selOne.daxiao}"/><br/>
		客房类型：<input type="text" name="leixing" value="${selOne.leixing}"/><br/>
		价格：<input type="text" name="price" value="${selOne.price}"/><br/>
		客房状态：<input type="text" name="type" value="${selOne.type}"/><br/>
		备注：<input type="text" name="beizhu" value="${selOne.beizhu}"/><br/>
		<input type="submit" value="修改"/><input type="reset" value="重置"/><a href="/hotel/selroom">取消</a>
	</form>
</body>
</html>