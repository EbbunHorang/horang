<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>컴퓨터 정보 목록</title>
	</head>
	<body>
		<span class="top-menu"><a href="/lab">실습실</a>  |  <a href="/computer">컴퓨터 </a>  |  <a href="/sw">SW</a>  |  <a href="/swlicense">SW 라이선스</a>  |  <a href="/account">사용자</a></span>
		<span class="top-account"><c:out value="${sessionScope.isLogin}"></c:out> 님
		<button type="button" onclick="location.href='/logout'">로그아웃</button>
		</span>
		<br/>
		<br/>
		<h2>컴퓨터 정보 목록</h2>
		<hr/>
		<br/>
		<br/>
		<div align="center">
				<table border="1">
					<tr>
						<td>등록 일자</td>
						<td>IP 주소</td>
						<td>이름</td>
					</tr>
				<c:forEach items="${computers}" var="computer" >
					<tr>
						<td>${computer.specRegDate}</td>
						<td>${computer.ipAddress}</td>
						<td><a href="/computer/${computer.no}/form">${computer.name}</a></td>
					</tr>
				</c:forEach>
				</table><br>
		    </div>
		</body>
	</body>
</html>