<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>left</title>
<style type="text/css">
        *{
            margin: 0;
            padding: 0;
        }
        #maindiv{
            height: 627px;
            width:185;
            background-color:blanchedalmond;
        }
        #div1{
            background: url(/hotel/images/btnbg1.png);
            height: 36px;
            width: 100%;
        }
        #leftlogo{
            position: relative;
            top: 10px;
            left: 10px;
        }
        #text{
            position: relative;
            top: 4px;
            left: 19px;
        }
        #name1,#name2,#name3,#name4,#name5,#name6{
            background: url(/hotel/images/leftmenubg.gif);
            width: 185px;
            height: 35px;
            text-align: center;
        }
        div ul li{
            position: relative;
            left: 0px;
            top: 5px;
            color: black;
        }
    </style>
</head>
<body>
	<div id="maindiv">
        <div id="div1"><img src="/hotel/images/leftico.png" id="leftlogo"/><span id="text">系统功能</span></div>
            <div id="name1">
                <ul>
                    <li><a href="/hotel/selroom" target="frameright">客房管理</a></li>
                </ul>
            </div>
            <div id="name2">
                <ul>
                    <li><a href="/hotel/selectcustomer" target="frameright">客户信息管理</a></li>
                </ul>
            </div>
            <div id="name3">
                <ul>
                    <li><a href="/hotel/selectAllCheckin" target="frameright">入住管理</a></li>
                </ul>
            </div>
            <div id="name4">
                <ul>
                    <li><a href="/hotel/selectCheckOutAll" target="frameright">退房</a></li>
                </ul>
            </div>
            <div id="name5">
                <ul>
                    <li><a href="/hotel/allbill" target="frameright">所有账单</a></li>
                </ul>
            </div>
            <div id="name6">
                <ul>
                    <li><a href="/hotel/changeAdmin/change.jsp" target="frameright">设置</a></li>
                </ul>
            </div>
    </div>
</body>
</html>