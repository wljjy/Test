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
            <li>&nbsp;入住管理</li>
            <li></li>
        </ul>
    </div>
	<table border="1px solid" width="100%" cellspacing="0">
		<tr>
			<th>姓名</th>
			<th>性别</th>
			<th>房号</th>
			<th>入住时间</th>
			<th>应退房时间</th>
			<th>入住天数</th>
			<th>客房状态</th>
			<th>消费金额</th>
			<th colspan="2">操作</th>
		</tr>
		<c:forEach items="${checkinAll}" var="check">
			<tr>
				<td>${check.name}</td>
				<td>${check.sex}</td>
				<td>${check.roomNumber}</td>
				<td>${check.intime }</td>
				<td>${check.outtime }</td>
				<td>${check.liveDay }</td>
				<td>${check.livetype }</td>
				<td>${check.allprice }</td>
				<td><a href="onecheckin?id=${check.id}">修改</a></td>
				<td><a href="deleteCheckin?id=${check.id}">删除</a></td>
			</tr>
		</c:forEach>
	</table>
	<a href="checkin/insert.jsp">办理入住</a>
</body>
</html>