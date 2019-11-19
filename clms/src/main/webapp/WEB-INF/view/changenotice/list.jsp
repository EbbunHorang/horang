<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>변동 알림 목록</title>
	</head>
	
	<body>
		<span class="top-menu"><a href="/lab">실습실</a>  |  <a href="/computer">컴퓨터 </a>  |  <a href="/sw">SW</a>  |  <a href="/swlicense">SW 라이선스</a>  |  <a href="/account">사용자</a></span>
		<span class="top-account"><c:out value="${sessionScope.isLogin}"></c:out> 님
		<button type="button" onclick="location.href='/logout'">로그아웃</button>
		</span>
		<br/>
		<br/>
		<h2>변동 알림 목록</h2>
		<hr/>
		<br/>
		<br/>
		<div align="center">
				구분 : <select name="division">
				<option selected="selected" value="A">All</option>
			    <option value="C">Computer</option>
			    <option value="L">Software License</option>
			 	</select><br><br>
			 	
				<table border="1">
					<tr>
						<td>알림 종류</td>
						<td>등록 일자</td>
						<td>대상 이름</td>
						<td>확인 여부</td>
					</tr>
				<c:forEach items="${changenotices}" var="changenotice">
					<tr>
						<td><c:if test="${changenotice.division eq 'C'}">Computer</c:if>
							<c:if test="${changenotice.division eq 'L'}">Software License</c:if></td>
						<td>${changenotice.registeredDate}</td>
						<td><a href="/changenotice/${changenotice.no}/form">${changenotice.targetNo}</a></td>
						<td><c:if test="${changenotice.checked eq 'Y'}">확인</c:if>
							<c:if test="${changenotice.checked eq 'N'}">미확인</c:if></td>
					</tr>
				</c:forEach>
				</table><br>
		    </div>
	</body>
</html>