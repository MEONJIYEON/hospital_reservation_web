<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/resSearch.css" >
<script src="https://kit.fontawesome.com/524197c221.js">
</script>
</head>
<body>
<header>
	<%@ include file ="header.jsp" %>
</header>
<hr>
<form action="resSearchList.do" method="post">
<div class="container3">
	<section>
	<div class="top">
		<h2 class="reservation">예약 검색하기</h2>
	</div>
	</section>

	<div class="bottom">
		<div class="search">
			<select name="searchCon">
				<option value="name"> 이름 </option>
				<option value="date"> 예약날짜 </option>
			</select>
			<input type="text" name="searchKey" id="searchKey">
		</div>
	</div>
	<div class="submit">
		<input type="submit" value="예약 검색하기" id="submit" >
	</div>
</div>
</form>
</body>
</html>