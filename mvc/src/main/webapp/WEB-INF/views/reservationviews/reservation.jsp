<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/reservation.css">
<script src="https://kit.fontawesome.com/524197c221.js"></script>
</head>
<body>
<header>
	<%@ include file ="header.jsp" %>
</header>
<hr>
<div class="container">
	<section id="content">
			<div class="item">
				<div class="img">
					<a href="review.jsp"><img src="${pageContext.request.contextPath}/resources/img/hos1.jpeg" class="hos1"></a>	
				</div>
				<div class="info">
					<h3 class="fn-font" onclick="location.href='selProduct.jsp'" style="cursor:pointer">성수아침이비인후과의원</h3>
					<div class="fn-font1">
						성수동 | 
					</div>
					<div class="fn-font2">
						#이비인후과 #내과 #소아청소년과 #영상의학과
					</div>
					<div class="fn-font3"></div>
					<div class="fn-font4"></div>
					<div class="button-row">
						<button class="btn fn-font btn-sm" onclick="location.href='resForm.do'">예약하기</button>
					</div>
				</div>
			</div>
			<div class="item">			
				<div class="img">
					<a href="review.jsp"><img src="${pageContext.request.contextPath}/resources/img/hos2.jpeg" class="hos2"></a>
				</div>
				<div class="info">
					<h3 class="fn-font">하나이비인후과의원</h3>
					<div class="fn-font1">
						신천동 | 
					</div>
					<div class="fn-font2">
						#이비인후과 #알레르기 #어지러움 #신속항원검사
					</div>
					<div class="fn-font3">
					
					</div>
					<div class="fn-font4">
					
					</div>
					<div class="button-row">
						<button class="btn fn-font btn-sm" onclick="location.href='resForm.do'">예약하기</button>
					</div>
				</div>
			</div>
			<div class="item">
				<div class="img">
					<a href="review.jsp"><img src="${pageContext.request.contextPath}/resources/img/hos3.jpeg" class="hos3"></a>
				</div>
				<div class="info">
					<h3 class="fn-font">365류마고내과의원</h3>
					<div class="fn-font1">
						구의동 | 
					</div>
					<div class="fn-font2">	
						#내과 #정형외과 #소아청소년과 #이비인후과 
					</div>
					<div class="fn-font3">
					</div>
					<div class="fn-font4">
					</div>
					<div class="button-row">
						<button class="btn fn-font btn-sm" onclick="location.href='resForm.do'">예약하기</button>
					</div>
				</div>
			</div>
	</section>
<br>
</div>
<footer>
	<%@ include file="footer.jsp" %>
</footer>
</body>
</html>