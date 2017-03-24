<%@ page language="java" contentType="text/html; charset=utf-8"	pageEncoding="utf-8"%>
<%@ include file="/WEB-INF/pages/include.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>shiro web</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="keywords"
	content="Flat Dark Web Login Form Responsive Templates, Iphone Widget Template, Smartphone login forms,Login form, Widget Template, Responsive Templates, a Ipad 404 Templates, Flat Responsive Templates" />

<script type="application/x-javascript">
	 addEventListener("load", function() { 
		 setTimeout(hideURLbar, 0); 
		 }, false); 
	 function hideURLbar(){ 
		 window.scrollTo(0,1); 
	 } 
</script>
<script>$(document).ready(function(c) {
	$('.close').on('click', function(c){
		$('.login-form').fadeOut('slow', function(c){
	  		$('.login-form').remove();
		});
	});	  
});
</script>
<!--webfonts-->
<!-- <link
	href='http://fonts.useso.com/css?family=PT+Sans:400,700,400italic,700italic|Oswald:400,300,700'
	rel='stylesheet' type='text/css'>
<link href='http://fonts.useso.com/css?family=Exo+2' rel='stylesheet' type='text/css'> -->

</head>
<body class="img">

	<h1>.LOGIN.</h1>
	<div class="login-form">
		<div class="close"> </div>
			<div class="head-info">
				<label class="lbl-1"> </label>
				<label class="lbl-2"> </label>
				<label class="lbl-3"> </label>
			</div>
			<div class="clear"> </div>
		<div class="avtar">
			<img src="styles/images/avtar.png" />
		</div>
			<form action="login" method="post">
				<input type="text" class="text" name="username" value="Username" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Username';}" >
				<div class="key">
					<input type="password" name="password" value="Password" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Password';}">
				</div>
				<input type="hidden" name="type" value="login-in">
			</form>
		<c:if test="${!empty error}">
			<div style="color:red">${error}</div>
		</c:if>
		<div class="signin">
			<input type="submit" value="Login" id="submitBtn">
		</div>
	</div>
	
	<div class="copy-rights">
		<p>Copyright &copy; 2015.Company name All rights reserved.More Templates</p>
	</div>
</body>

<script>
	$('#submitBtn').click(function(){
		$('form').submit();
	});
</script>
</html>