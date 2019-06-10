<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
 <style type="text/css">
        *{
            margin: 0px;
            padding: 0px;
        }
        body{
            background-image: url(/hotel/images/1.jpg);
        }
        #div1{
            width:500px;
            height: 300px;
        	margin:auto;
            position: relative;
            margin-top:120px;
            text-align: center;
            color: white;
            border: 1px solid;
        }
        #uname{
        	width: 230px;
        	height:30px;
        	margin-top: 10px;
        }
         #pwd{
        	width: 230px;
        	height:30px;
        	margin-top: 10px;
        }
        input[type=submit]{
        	margin-top:20px;
        	width:70px;
        	height:30px;
        }
 </style>
 <script type="text/javascript">
 function check() {
	var uname=document.getElementById("uname").value;
	var namespan=document.getElementById("namespan");
	if(uname==""||uname==null)
		namespan.innerHTML="用户名不能为空";
		namespan.style.color="red";
		return false;
}
 function checkpwd() {
	var pwd=document.getElementById("pwd").value;
	var pwdspan=document.getElementById("pwdspan");
	if(pwd==""||pwd==null){
		pwdspan.innerHTML="密码不能为空";
		pwdspan.style.color="red";
		return false;
	}
}
 if(window!=top)
	 top.location.href=location.href;
 </script>
</head>
<body>
	<div id="div1">
	<br/>
	<br/>	${login}
            <h1 align="center">WELCOME</h1>
            <table>
	            <form action="login" method="post">
	            <span id="namespan"></span><br/>
	            <input type="text" name="name" id="uname" value="" onblur="check()"/><br/>
	            <span id="pwdspan"></span><br/>
	            <input type="password" name="password" id="pwd" value="" onblur="checkpwd()"/><br/>
	            <input type="submit" value="登录"/><br/>
            	</form>
            </table>
     </div>
</body>
</html>