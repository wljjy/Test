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
            <li>&nbsp;客户信息管理</li>
            <li></li>
        </ul>
    </div>
    <table width="100%" border="1px solid" cellspacing="0">
    	<tr>
    		<th>姓名</th>
    		<th>年龄</th>
    		<th>性别</th>
    		<th>电话</th>
    		<th>身份证号</th>
    		<th>住址</th>
    		<th>操作</th>
    	</tr>
    	<c:forEach items="${selectlist}" var="list">
    		<tr>
    			<td>${list.cname}</td>
    			<td>${list.cage}</td>
    			<td>${list.sex}</td>
    			<td>${list.phone}</td>
    			<td>${list.idNumber}</td>
    			<td>${list.address}</td>
    			<td><a href="delete?id=${list.id}">删除</a></td>
    		</tr>
    	</c:forEach>
    </table>
    <a href="customer/insert.jsp">添加客户信息</a>
</body>
</html>