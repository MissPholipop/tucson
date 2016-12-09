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
        <title>用户首页</title>  
        
        <link rel="stylesheet" href="assets/css/amazeui.min.css">
  		<link rel="stylesheet" href="assets/css/app.css">
        
    </head>  
    <body>    
    
    <ol class="am-breadcrumb">
	  <li><a href="#">首页</a></li>
	  <li><a href="#">分类</a></li>
	  <li class="am-active">内容</li>
	</ol>
       
    <h1>测试成功</h1>
    <h2>用户名：<%=admin.getAdminName() %></h2>
    
    <table class="am-table am-table-bordered am-table-striped am-table-hover">
	    <thead>
	        <tr>
	            <th>网站名称</th>
	            <th>网址</th>
	            <th>创建时间</th>
	        </tr>
	    </thead>
	    <tbody>
	       
	        <tr class="am-active">
	            <td>Amaze UI(Active)</td>
	            <td>http://amazeui.org</td>
	            <td>2012-10-01</td>
	        </tr>
	      
	    </tbody>
	</table>
    
    
    <ul class="am-pagination am-pagination-right">
	  <li class="am-disabled"><a href="#">&laquo;</a></li>
	  <li class="am-active"><a href="#">1</a></li>
	  <li><a href="#">2</a></li>
	  <li><a href="#">3</a></li>
	  <li><a href="#">4</a></li>
	  <li><a href="#">5</a></li>
	  <li><a href="#">&raquo;</a></li>
	</ul>
    
    <script src="assets/js/jquery-1.8.2.min.js"></script>
	<!--<![endif]-->
	<script src="assets/js/amazeui.min.js"></script>
            
    </body>       
</html>