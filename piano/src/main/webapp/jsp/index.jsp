<%@ page language="java" contentType="text/html; charset=UTF-8"       
    pageEncoding="UTF-8"%>       
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> 
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>      
<html>       
    <head>       
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>test verify code</title>  
    </head>  
    <body>       
        <input id="veryCode" name="veryCode" type="text"/>       
        <img id="imgObj"  alt="" src="xuan/verifyCode"/>       
        <a href="#" onclick="changeImg()">换一张</a>       
        <input type="button" value="验证" onclick="isRightCode()"/>       
        <div id="info"></div>   
        
       <div class="container">
		<h1>用户注册</h1>
		<form class="form" action ="front/confirm" method = "post">
			<input type="text" placeholder="用户名" id ="adminNick" name= "adminName" onblur="confirmUser()">
			<span id="adminError"  style="color:red; display:none" >输入错误</span>
			<input type="password" placeholder="密码" name= "adminPswd" id="pswd">
			<button type="submit" id="login-button">登录</button>
		</form>
	</div>
	
	
	
            
    </body>       
</html>
<script type="text/javascript" src="<%=basePath%>js/jquery-2.1.1.min.js"></script>
<script type="text/javascript">
 function changeImg(){     
    var imgSrc = $("#imgObj");     
    var src = imgSrc.attr("src");     
    imgSrc.attr("src",chgUrl(src));     
}     
//时间戳     
//为了使每次生成图片不一致，即不让浏览器读缓存，所以需要加上时间戳     
function chgUrl(url){     
    var timestamp = (new Date()).valueOf();     
    urlurl = url.substring(0,17);     
    if((url.indexOf("&")>=0)){     
        urlurl = url + "×tamp=" + timestamp;     
    }else{     
        urlurl = url + "?timestamp=" + timestamp;     
    }     
    return urlurl;     
}     
function isRightCode(){     
    var code = $("#veryCode").val();     
    code = "c=" + code;     
    $.ajax({     
        type:"POST",     
        url:"resultServlet/validateCode",     
        data:code,     
        success:callback     
    });     
}     
function callback(data){     
    $("#info").html(data);
    changeImg();     
}  
</script>  