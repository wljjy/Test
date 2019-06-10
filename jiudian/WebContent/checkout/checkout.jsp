<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
        *{
            margin: 0px;
            padding: 0px;
        }
        #main{
            background: url(/hotel/images/leftmenubg.gif);
            width: 100%;
            height: 36px;
        }
        #main ul li{
            list-style-type: none;
            float: left;
            position: relative;
            top: 5px;
            font-size: 15px;
        }
        img{
            position: relative;
            top: 3px;
        }
    </style>
</head>
<body>
<div id="main">
        <ul>
            <li style="color:red">位置：</li>
            <li><a href="main.jsp" target="_top">首页</a>&nbsp;<img src="/hotel/images/next.gif"/></li>
            <li>&nbsp;退房</li>
            <li></li>
        </ul>
    </div>
	<table border="1px solid" width="100%" cellspacing="0">
		<tr>
			<th>姓名</th>
			<th>房号</th>
			<th>退房时间</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${selectCheckOutAll}" var="checkOut">
			<tr>
				<td>${checkOut.name}</td>
				<td>${checkOut.roomNumber}</td>
				<td>${checkOut.outtime}</td>
				<td><a href="deleteCheckOut?id=${checkOut.id}">删除</a></td>
			</tr>
		</c:forEach>
	</table>
	<a href="/hotel/checkout">退房</a>
</body>
</html>