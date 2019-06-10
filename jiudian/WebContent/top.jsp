<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>top</title>
<style type="text/css">
    *{
        margin: 0;
        padding: 0;
    }
    #bigdiv{
        height: 88px;
        background: url(/hotel/images/topbg.gif) repeat-x;
    }
    #logodiv{
        background-image: url(/hotel/images/topleft.jpg);
        height: 88px;
        width: 289px;
        float: left;
    }
    #lablediv ul li{
        list-style-type: none;
        float: left;
        position: relative;
        top: 9px;
        margin-left: 45px;
        font-style: "宋体";
        color: white;
    }
    #rightdiv{
        background-image: url(/hotel/images/topright.jpg);
        height: 88px;
        width: 167px;
        float: left;
        position: relative;
        left: 315px;
    }
    #rightdiv ul li{
        list-style-type: none;
        float: left;
        position: relative;
        top: 10px;
        left: 15px;
        margin-right:10px;
        color: white;
    }
    #img{
        position: relative;
        top: 13px;
        left: 12px;
    }
    #helplogo{
        position: relative;
        top: 3px;
    }
    #span{
        position: relative;
        top: 25px;
    }
    input[type=text]{
        height: 20px;
        width: 140px;
        position: relative;
        left: 23px;
    }
    input[type=button]{
        font-size: 15px;
    }
    </style>
</head>
<body>
	<div id="bigdiv">
        <div id="logodiv"><img src="/hotel/images/loginlogo.png" id="img"/></div>
        <div id="lablediv">
            <ul>
                <li><img src="/hotel/images/icon01.png"/><h5>工作台</h5></li>
                <li><img src="/hotel/images/icon02.png"/><h5>模型管理</h5></li>
                <li><img src="/hotel/images/icon03.png"/><h5>模块设计</h5></li>
                <li><img src="/hotel/images/icon04.png"/><h5>常用工具</h5></li>
                <li><img src="/hotel/images/icon05.png"/><h5>文件管理</h5></li>
                <li><img src="/hotel/images/icon06.png"/><h5>系统设置</h5></li>
            </ul>
        </div>
        <div id="rightdiv">
            <ul>
                <li><img src="/hotel/images/help.png" id="helplogo"/>帮助</li>
                <li>|&nbsp;关于</li>
                <li>|&nbsp;<a href="/hotel/login.jsp" target="_top"><input type="button" value="退出"/></a></li>
            </ul>
            <input type="text" name="admin" value="admin" id="span"/>
        </div>
    </div>
</body>
</html>