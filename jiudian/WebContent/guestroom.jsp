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
            <li><a href="/hotel/main.jsp" target="_top">首页</a>&nbsp;<img src="/hotel/images/next.gif"/></li>
            <li>&nbsp;客房管理</li>
            <li></li>
        </ul>
    </div>
    <table border="1px solid" width="100%" cellspacing="0" cellpadding="1" align="center">
	   <tr>
		   <th>房号</th>
		   <th>大小</th>
		   <th>客房类型</th>
		   <th>价格</th>
		   <th>客房状态</th>
		   <th>备注</th>
		   <th colspan="2">操作</th>
	   </tr>
	    <c:forEach items="${selAll}" var="selA">
	    	<tr>
	    	    <td>${selA.roomNumber}</td>
	    		<td>${selA.daxiao}</td>
	    		<td>${selA.leixing}</td>
	    		<td>${selA.price}</td>
	    		<td>${selA.type}</td>
	    		<td>${selA.beizhu}</td>
	    		<td><a href="/hotel/selOne?id=${selA.id}">修改</a></td>
	    		<td><a href="/hotel/deleteone?id=${selA.id}">删除</a></td>
	    	</tr>
	    </c:forEach>
    </table>
	    <a href="/hotel/insert.jsp" target="frameright">添加客房</a>
</body>
</html>