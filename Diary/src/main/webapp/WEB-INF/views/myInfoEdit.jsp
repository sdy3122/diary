<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="path" value="${pageContext.request.contextPath}" />
<!DOCTYPE HTML>
<html>
<head>
<title>내정보</title>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<link rel="stylesheet" href="${path}/resources/main/css/choiceSul.css" />
<style>
</style>
</head>
<body class="is-preload">
	<div id="page-wrapper">

		<!-- Header -->
		<div id="header">

			<!-- Logo -->
			<h1>
				<a href="/" id="logo"><em>페이지 이름 정해라</em></a>
			</h1>

			<!-- Nav -->
			<nav id="nav">
				<ul>
					<li id="titleLi"><a href="/">메인화면</a></li>
					<li><a href="/boardPage">게시판</a>
						<ul>
							<li><a href="#">소주게시판</a></li>
							<li><a href="#">맥주게시판</a></li>
							<li><a href="#">와인게시판</a></li>
							<li><a href="#">보드카게시판</a></li>
							<li><a href="#">위스키게시판</a></li>
						</ul></li>
					<li class="current"><a href="/myInfoPage">${sessionScope.sessionVo.userName}님</a></li>
				</ul>
			</nav>

		</div>

		<!-- Main -->
		<section class="wrapper style1">
			<div class="container">
				<div id="content">
					<!-- Content -->
					<article id="myInfoEdit">
				<h2 class="major">비밀번호변경</h2>
				<form method="post" accept-charset="UTF-8"
					onsubmit="return changePw()" action="userInfoEdit">
					<div class="fields" id="inputPw">
						<div class="field">
							<label>현재 비밀번호</label> <input type="password" id="nowPw"
								name="inputPw" required="required" placeholder="현재 비밀번호 입력">
						</div>
					</div>
					<div class="fields">
						<div class="field">
							<label>새 비밀번호</label> <input type="password" name="newRegistPw"
								id="newRegistPw" maxlength="15" placeholder="새 비밀번호 입력"
								onchange="checkNewPw()" required="required">
						</div>
						<div class="field">
							<label>비밀번호 확인</label> <input type="password" name="userPw"
								id="newCheckPw" placeholder="새 비밀번호 확인" maxlength="15"
								onchange="checkNewPw()" required="required">
						</div>
					</div>
					<div class="myFields" id="NewPwDupWarning">
						<div class="myField">
							<label class="myLabel" for="NewPwLabelWarning">PWPWPWPWPW</label>
						</div>
					</div>
					<div class="btnFields">
						<div class="field half">
							<button type="submit" class="primary">비밀번호변경</button>
							<button type="button" onclick="location.href='myInfoPage'"
								class="primary" id="pleaseCancel">취소</button>
						</div>
					</div>
				</form>
			</article>

				</div>
			</div>
		</section>

		<!-- Footer -->
		<div id="footer">
			<!-- Copyright -->
			<div class="copyright">
				<p class="copyright">&copy; Design: 서덕영</p>
			</div>
		</div>

	</div>
	<!-- Scripts -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	<script src="${path}/resources/main/js/jquery.dropotron.min.js"></script>
	<script src="${path}/resources/main/js/browser.min.js"></script>
	<script src="${path}/resources/main/js/breakpoints.min.js"></script>
	<script src="${path}/resources/main/js/util.js"></script>
	<script src="${path}/resources/main/js/main.js"></script>

</body>
</html>