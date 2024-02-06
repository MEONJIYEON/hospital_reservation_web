<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/resForm.css">
<script src="https://kit.fontawesome.com/524197c221.js"></script>
</head>
<body>
<header>
	<%@ include file ="header.jsp" %>
</header>
<hr>
<form action="resProc.do" method="post">
<div class="container3">
	<section>
	<div class="top">
		<h2 class="reservation">예약하기</h2>
	</div>
		<div class="item1">
			<div class="_design">
				<h3>예약 정보</h3>
				<ul>
					<li>예약날짜</li>
					<li><input id="input" type="text" name="date"></li>
				</ul>
				<ul>
					<li>예약시간</li>
					<li><input id="input" type="text" name="time"></li>
				</ul>
				<ul>
					<li>진료예약<br>사유</li>
					<li><input id="input" type="text" name="sym"></li>
				</ul>
			</div>
		</div>
		<div class="item2">
			<div class="_design1">
				<h3>예약자 정보</h3>
				<ul>
					<li>이름</li>
					<li><input id="input" type="text" name="name"></li>
				</ul>
				<ul>
					<li>주민등록<br>번호</li> 
					<li><input id="input" type="text" name="registerNum"></li>
				</ul>
				<ul>
					<li>핸드폰번호</li>
					<li><input id="input" type="text" name="num"></li>
				</ul>
				<ul>
					<li>이메일</li>
					<li><input id="input" type="text" name="email"></li>
				</ul>
			</div>
		</div>
		<div class="submit">
			<input type="submit" value="예약하기" id="submit">
		</div>
	</div>
	</section>
</div>
</form>
</body>
</html>