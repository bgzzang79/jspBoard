<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="../../favicon.ico">

<title>Signin Template for Bootstrap</title>

<!-- Bootstrap core CSS -->
<link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="/css/signin.css" rel="stylesheet">
<%@ include file="/common/jquery.jsp"%>

</head>

<body>
	<!-- 
		1. 사용자가 로그인 화면을 접속한다 (localhost:8180/login/login.jsp)
		2. 사용자가 아이디, 비밀번호를 입력후 signin 버튼을 클릭
			-> signin 버튼이 속한 form태그의 action속성에 설정된 url로 요청 
		3. LoginServlet 파라미터(userId, Pw)를 확인 후 고정된 값을 비교
			같을 경우 response객체의 writer객체를 이용하여 화면에 "접속 성공" 틀릴 경우 "접속실패" 메시지 출력
			
	 -->

	<div class="container">		
		<form class="form-signin" action="/loginServlet" method="post">
		<h1>로그인 가즈아~~~</h1>
			<label for="userId" class="sr-only">userId</label> 
			<input type="text" id="std_id" name="std_id" class="form-control" placeholder="userId" value="${param.userId}" required autofocus >
			
			<label for="userPw" class="sr-only">Password</label>
			<input type="password" id="pass" name="pass" class="form-control"
				placeholder="Password" required>
			
			<button class="btn btn-lg btn-primary btn-block" type="submit">Sign	in</button>
		</form>
	</div>
	<!-- /container -->

</body>
</html>
