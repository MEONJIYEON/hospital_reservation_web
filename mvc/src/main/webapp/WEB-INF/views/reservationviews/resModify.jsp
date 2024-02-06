<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/resModify.css">
<script src="https://kit.fontawesome.com/524197c221.js"></script>
</head>
<body>
<header>
	<%@ include file ="header.jsp" %>
</header>
<hr>
<form action="resModifyProc.do?seq=${book.seq}" method="post">
<div class="container3">
	<section>
	<div class="top">
		<h2 class="reservation">예약수정</h2>
	</div>
	<div id="content">
		<div class="item1">
			<div class="_design">
				<h3>예약 정보</h3>
				<ul>
					<li>예약날짜</li>
					<li>
					<input id="input" type="text" name="date" value="${book.date}"></li>
				</ul>
				<ul>
					<li>예약시간</li>
					<li><input id="input" type="text" name="time" value="${book.time}"></li>
				</ul>
				<ul>
					<li>진료예약<br>사유</li>
					<li><input id="input" type="text" name="sym" value="${book.sym }"></li>
				</ul>
			</div>
		</div>
		<div class="item2">
			<div class="_design1">
				<h3>예약자 정보</h3>
				<ul>
					<li>이름</li>
					<li><input id="input" type="text" name="name" value="${book.name }"></li>
				</ul>
				<ul>
					<li>주민등록<br>번호</li>
					<li><input id="input" type="text" name="registerNum" value="${book.registerNum }"></li>
				</ul>
				<ul>
					<li>핸드폰번호</li>
					<li><input id="input" type="text" name="num" value="${book.num }"></li>
				</ul>
				<ul>
					<li>이메일</li>
					<li><input id="input" type="text" name="email" value="${book.email }"></li>
				</ul>
			</div>
		</div>
	<div class="submit">
		<input type="hidden" name="seq" value="${book.seq }">
		<input type="submit" value="예약수정하기" id="submit" >
	</div>
	</div>
</section>
</div>
</form>
</body>
</html>