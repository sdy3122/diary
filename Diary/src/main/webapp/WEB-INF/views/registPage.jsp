<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="path" value="${pageContext.request.contextPath}" />
<!DOCTYPE HTML>
<html>
<head>
<title>한잔해</title>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<link rel="stylesheet" href="${path}/resources/login/css/index.css" />
<style>
</style>
</head>
<body class="is-preload">

	<!-- Wrapper -->
	<div id="wrapper">

		<!-- Header -->
		<header id="header">
			<div id="registDivBorder">
				<h2 class="major">회원가입</h2>
				<!-- onsubmit return + 함수() = 클릭시 함수호출 -->
				<form method="post" action="regist" name="registHard"
					onsubmit="return formCheck(this)" accept-charset="UTF-8">
					<div class="fields">
						<div class="field half">
							<label for="ID">아이디</label> <input type="text" id="inputUserId"
								name="userId" required="required" placeholder="아이디 입력"
								maxlength="15" value="">
						</div>
						<div class="field half">
							<label>ID중복체크</label>
							<button type="button" class="primary" id="IdDupCheck">체크</button>
						</div>
						<!-- 중복체크여부확인 -->
						<input type="hidden" id="DupCheck" name="DupCheck" value="UnCheck" />
					</div>
					<div class="myFields" id="IdDupWarning">
						<div class="myField">
							<label class="myLabel" for="IdLabelWarning">IDIDIDIDID</label>
						</div>
					</div>
					<div class="fields">
						<div class="field">
							<label for="irum">이름</label> <input type="text" id="userName"
								maxlength="10" name="userName" placeholder="이름 입력"
								required="required">
						</div>
					</div>

					<div class="fields">
						<div class="field half">
							<label for="PW">비밀번호</label> <input type="password"
								name="registPW" id="registPW" maxlength="15"
								placeholder="비밀번호 입력" onchange="checkPw()" required="required">
						</div>
						<div class="field half">
							<label for="PW">비밀번호확인</label> <input type="password"
								name="userPw" id="checkPW" placeholder="비밀번호 재입력" maxlength="15"
								onchange="checkPw()" required="required">
						</div>
					</div>
					<div class="myFields" id="PwDupWarning">
						<div class="myField">
							<label class="myLabel" for="PwLabelWarning">PWPWPWPWPW</label>
						</div>
					</div>

					<div class="fields">
						<div class="field half">
							<label>주민등록번호 앞자리</label> <input type="text" name="rn1" id="rn1"
								placeholder="주민등록번호 앞자리" maxlength="6" required="required"
								onkeyup="moveNext(this,6,document.registHard.rn2)">
						</div>
						<div class="field half">
							<label>뒷자리</label> <input type="password" name="rn2" id="rn2"
								placeholder="주민등록번호 뒷자리" maxlength="7" required="required"
								onkeyup="moveNext(this,7,document.registHard.sendBtn)">
						</div>
					</div>
					<div class="myFields" id="RnDupWarning">
						<div class="myField">
							<label class="myLabel" for="RnLabelWarning">RNRNRNRN</label>
						</div>
					</div>
					<div class="btnFields">
						<div class="field half">
							<input id="registBtnWidth" type="submit" value="회원가입"
								class="primary" name="sentBtn" />
							<button id="reInputBtn" type="button" onclick="reInput();">ID재입력</button>
						</div>
					</div>
				</form>
			</div>
		</header>
		<!-- 여가 끝남 -->
		<!-- Footer -->
		<footer id="footer">
			<a href="/">메인화면</a>
		</footer>

	</div>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	<!-- Scripts -->
	<script src="${path}/resources/login/js/browser.min.js"></script>
	<script src="${path}/resources/login/js/breakpoints.min.js"></script>
	<script src="${path}/resources/login/js/util.js"></script>
	<script src="${path}/resources/login/js/main.js"></script>

</body>
</html>