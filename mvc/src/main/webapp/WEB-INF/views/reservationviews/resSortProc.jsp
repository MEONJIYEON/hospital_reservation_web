<%@page import="java.util.Collections"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/resSortProc.css" >
<script src="https://kit.fontawesome.com/524197c221.js"> 
</script>
</head>
<body>
<header>
	<%@ include file ="header.jsp" %>
</header>
<hr>
<form action="resList.do" method="post">
<div class="container3">
	<section>
	<div class="top">
		<h2 class="reservation">예약목록</h2>
		<div class="btn_group">
			<button type="button" class="button1" onclick="location.href='resSortDescProc.do'">내림차순으로 정렬</button>
		</div>
	</div>
	<table class="res_table" id="res_table">
  		<thead>
  		<tr>
		    <th scope="cols">예약날짜</th>
		    <th scope="cols">예약시간</th>
		    <th scope="cols">진료예약 사유</th>
		    <th scope="cols">이름</th>
		    <th scope="cols">주민등록 번호</th>
		    <th scope="cols">핸드폰번호</th>
		    <th scope="cols">이메일</th>
		</tr>
		</thead>
		<tbody>
		<c:forEach var="book" items="${bList}">
		  	<tr>
		    	<td>${book.date }</th>
			    <td>${book.time }</th>
			    <td>${book.sym }</th>
			    <td>${book.name }</th>
			    <td>${book.registerNum }</th>
			    <td>${book.num }</th>
			    <td>${book.email }</th>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="submit">
			<input type="submit" value="예약목록으로" id="submit" >
	</div>
	</section>
</div>
</form>
</body>
</html>