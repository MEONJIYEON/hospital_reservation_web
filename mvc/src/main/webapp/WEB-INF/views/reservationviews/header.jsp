<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/header.css">
<script src="https://kit.fontawesome.com/524197c221.js"></script>
</head>
<body>
<div class="container">
	<header>
		<div class="img">
			<a href="#" onclick="location.href='index.do'"><img src="${pageContext.request.contextPath}/resources/img/icon.png" width="70px" height="70px"></a>
		</div>
		<nav>
			<ul>
				<li><a href="">Introduce</a></li>
				<li><a href="#" onclick="location.href='reservation.do'">Reservation</a></li>
				<li><a href="">Support</a></li>
				<li class="name">
				<button class="btn1" value="Login">Login</button>
				</li>
			</ul>
		</nav>
	</header>
</div>
</body>
</html>
