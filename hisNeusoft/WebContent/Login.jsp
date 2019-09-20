<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>东软医疗系统</title>
	<script type="text/javascript" src="/javascripts/jquery.1.12.4.min.js"></script>
    <style>
        *all{
            margin: 0;
            padding: 0;
        }
        div.inner,table{
            position:absolute;
        }
		body{
			background-image:url('mount_kailash-001.jpg');
			background-size:100%;
		}
        .outer{
            height: 100%;    
        }
        .inner{
			border: 5px solid rgba(255,255,255,1);
		    border-radius: 20px;
		    width: 370px;
		    height: 340px;
		    top: 40%;
		    left: 76%;
		    transform: translate(-50%,-50%);
			box-shadow:11px 11px 11px rgba(50,50,50,1);	///边框阴影
        }
        .table{
            top: 7%;
		    left: 12%;
			//border: solid;
			width: 260px;
			height: 190px;
			border-spacing:7px;
		}
        .under{
            position: fixed; 
            left: 0px; 
            bottom: 30px; 
            width: 100%; 
            text-align:center;
            font-size: 15px;
        }
		.Time{
			top: 65%;
			left: 62%;
            position: fixed; 
			width: 400px;
			text-align:right;
		}
		.TEXT{
			height:72%;
			width: 200px;
		}
		a {text-decoration: none}	//去超链接下划线
    </style>
</head>
<body>
	<form action = "loginServlet" method = "post">
	<div class="outer">
		<div class="inner">
			<table class="table">
				<caption> <h1>医疗管理系统</h1> </caption>
				<tr height="30px">
					<td><big><b>账&nbsp;&nbsp;号</b></big></td>
					<td><input type="text" name="uName" class="TEXT"/> </td>
				</tr>
				<tr height="30px">
					<td><big><b>密&nbsp;&nbsp;码</b></big></td>
					<td><input class="TEXT"type="password" name="passWord"/> </td>
				</tr>
				<tr height="30px">
					<td colspan="2" align="right">
						<input class="TEXT"type='submit' value="            登录系统              "/>
					</td>
				</tr>
				<tr height="20px"><td colspan="2" style="text-align:center;font-size:small"><a href = "">联系我们</a> | <a href = "">帮助中心</a> | <a href = "">其他</a></td></tr>
			 </table>
		</div>
	</div>
	</form>
</body>