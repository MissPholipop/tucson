<%@ page language="java" contentType="text/html; charset=UTF-8"       
    pageEncoding="UTF-8"%> 
    <%@ page import="com.piano.entity.Admin" %>      
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> 
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%> 
<%
	Admin admin = (Admin)session.getAttribute("admin");
%>     
<html>       
    <head>       
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>test verify code</title>  
    </head>  
    <body>       
    <h1>测试成功</h1>
    <h2>用户名：<%=admin.getAdminName() %></h2>
            
    </body>       
</html>