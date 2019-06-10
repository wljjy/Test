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
        #div1{
        	width:360px;
        	height:300px;
        	text-align: center;
        }
        #pwd1{
        	width: 180px;
        	height:20px;
        	margin-top: 9px;
        }
        #pwd2{
        	width: 180px;
        	height:20px;
        	margin-top: 9px;
        }
        #pwd3{
        	width: 180px;
        	height:20px;
        	margin-top: 9px;
        }
        input[type=submit]{
        	width: 45px;
        	height:20px;
        	margin-top: 9px;
        	font-size: 13px;
        }
        input[type=reset]{
        	width: 45px;
        	height:20px;
        	margin-top: 9px;
        	font-size: 13px;
        }
        #ta{
        	font-size: 20px;
        }
    </style>
   <script type="text/javascript">
    	function changepwd(){
    		var pwd2=document.getElementById("pwd2").value;
    		var pwd3=document.getElementById("pwd3").value;
    		var span2=document.getElementById("span2");
    		var span3=document.getElementById("span3");
    		if(pwd2!=pwd3){
   			span2.innerHTML="×";
   			span2.style.color="red";
   			span3.innerHTML="密码不一致";
   			span3.style.color="red";
   			return false;
    	}
    }
    	    function check(){
    		var pwd1=document.getElementById("pwd1").value;
    		var pwd2=document.getElementById("pwd2").value;
    		var pwd3=document.getElementById("pwd3").value;
    		var span1=document.getElementById("span1");
    		var span2=document.getElementById("span2");
    		var span3=document.getElementById("span3");
    		if(pwd1==null||pwd1==""){
    			span1.innerHTML="不能为空";
    			span1.style.color="red";
    			return false;
    		}
    	}
    </script>
</head>
<body>
	<div id="main">
        <ul>
            <li style="color:red">位置：</li>
            <li><a href="/hotel/main.jsp" target="_top">首页</a>&nbsp;<img src="/hotel/images/next.gif"/></li>
            <li>&nbsp;设置</li>
            <li></li>
        </ul>
    </div>
    <div id="div1">
    	<h3>修改密码</h3>
    	<table id="ta">
    		${change}
    		${pwderror}
    		${error}<br/>
    		<form action="../change" method="post">
	    		&nbsp;&nbsp;&nbsp;原密码:<input type="password" name="pwdOld" id="pwd1" value="" onblur="check()"/><span id="span1"></span><br/>
	    		&nbsp;&nbsp;&nbsp;新密码:<input type="password" name="pwdNew" id="pwd2" value="" /><span id="span2"></span><br/>
	    		确认密码:<input type="password" name="pwdNewq" id="pwd3" value="" onblur="changepwd()"/><span id="span3"></span><br/>
	    		<input type="submit" value="确认"/><input type="reset" value="重置"/>
    		</form>
    	</table>
    </div>
</body>
</html>