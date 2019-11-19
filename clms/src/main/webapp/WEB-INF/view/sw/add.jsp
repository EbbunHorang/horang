<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SW 등록</title>
</head>
<meta charset="UTF-8">
<title>SW 등록</title>
</head>
<body>
	<span class="top-menu"><a href="/lab">실습실</a>  |  <a href="/computer">컴퓨터 </a>  |  <a href="/sw">SW</a>  |  <a href="/swlicense">SW 라이선스</a>  |  <a href="/account">사용자</a></span>
	<span class="top-account"><c:out value="${sessionScope.isLogin}"></c:out> 님
	<button type="button" onclick="location.href='/logout'">로그아웃</button>
	</span>
	<br/>
	<br/>
	<h2>SW 등록</h2>
	<hr/>
	<br/>
	<br/>
	<div class="from-group" align="center">
		<form action="/sw" method="post">
			SW 이름 : <input type="text" name="name" ><br/>
			구분 : <select name="division">
					<option>선택
					<option value="F" >무료
					<option value="P" >유료
				 </select><br/>
			SW 사용 부서 명 : <input type="text" name="useDept" ><br/>
			SW 용도 : <input type="text" name="usage" ><br/>
			SW 시리얼 넘버 : <input type="text" name="serialNumber" ><br/>

			<br/>
			<div align="right">
		        <input type="submit" value="등록" />
		        <button type="button" onclick="location.href='/sw'">목록</button>
		    </div>
		</form><br/>
	</div>
</body>
</html>