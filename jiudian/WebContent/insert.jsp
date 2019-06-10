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
	<h3>添加客房信息</h3>
	 ${error}
	<form action="insert" method="post">
		房号：<input type="text" name="roomNumber"/><br/>
		客房大小：<input type="text" name="daxiao"/><br/>
		客房类型：<input type="text" name="leixing"/><br/>
		价格：<input type="text" name="price"/><br/>
		备注：<input type="text" name="beizhu"/><br/>
		<input type="submit" value="添加"/><input type="reset" value="重置"/><a href="/hotel/selroom">取消</a>
	</form>
</body>
</html>