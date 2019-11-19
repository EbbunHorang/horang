<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script
  src="https://code.jquery.com/jquery-3.4.1.min.js"
  integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="
  crossorigin="anonymous">
  </script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>로그인</h3>
	<hr>
	<form action="/login" method="post">
		<div id="form_login" align="center">
			<label>아이디 : </label><input type="text" name="id" placeholder="아이디"/><br>
			<label>비밀번호 : </label><input type="password" name="password" placeholder="비밀번호" /><br>
			<input type="submit" value="로그인" /><br>
		</div>
	</form>
</body>
</html>