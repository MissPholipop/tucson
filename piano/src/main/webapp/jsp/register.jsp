<%@ page language="java" contentType="text/html;  charset=utf-8"
    pageEncoding="utf-8"%>
    
<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>
<html lang="zh">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>CSS3动态背景登录框代码</title>

<link rel="stylesheet" type="text/css" href="<%=basePath%>css/styles.css">

</head>
<body>


<div class="wrapper">

	<div class="container">
		<h1>用户注册</h1>
		<!-- <form class="form" action ="front/confirm" method = "post">
			<input type="text" placeholder="用户名" id ="adminNick" name= "adminName" onblur="confirmUser()">
			<span id="adminError"  style="color:red; display:none" >输入错误</span>
			<input type="password" placeholder="密码" name= "adminPswd" id="pswd">
			<button type="submit" id="login-button">登录</button>
		</form> -->
	</div>
	
	<ul class="bg-bubbles">
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
		<li></li>
	</ul>
	
</div>

<script type="text/javascript" src="<%=basePath%>js/jquery-2.1.1.min.js"></script>
<script type="text/javascript">

function confirmUser(){
	//alert("haha");
	//console.log($("#adminNick").val());
	
	
	$.ajax({

             type: "GET",

             url: "front/user_name_confirm",

             data:{username: $("#adminNick").val()},

             dataType: "json",

             success: function(data){
            	/*  if(data==true){
            		 alert("测试成功");
            	 } */
            	// alert(data);
             	//$("#adminError").css("display","block");
             
             }});
	
	
	
	
	
}

</script>

</body>
</html>