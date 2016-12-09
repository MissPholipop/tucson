<%@page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>jQuery搜索框自动补全关键字插件DEMO演示</title>

<link rel="stylesheet" href="dist/autocomplete.css">
<link rel="stylesheet" href="dist/style.css">

<script src="dist/jquery.js"></script>
<script src="dist/autocomplete.js"></script>
<script>
var proposals = ['html5tricks', 'jquery', 'css3', 'chief', 'dog', 'drink', 'elephant', 'fruit', 'grave','hotel', 'illness', 'London', 'motorbike','html5资源教程','jQuery插件','html5动画','html5应用'];

$(document).ready(function(){
	$('#search-form').autocomplete({
		hints: proposals,
		width: 300,
		height: 30,
		onSubmit: function(text){
			$('#message').html('Selected: <b>' + text + '</b>');			
		}
	});
});
</script>

</head>

<body>
<div id="demo">
	<div class="wrapper">
		<h3>试试输入"html5"</h3>
		<div id="search-form"></div>
		<div id="message"></div>
	</div>
</div>

<div style="text-align:center;clear:both;margin-top:250px">
<script src="/gg_bd_ad_720x90.js" type="text/javascript"></script>
<script src="/follow.js" type="text/javascript"></script>
</div>
</body>
</html>
