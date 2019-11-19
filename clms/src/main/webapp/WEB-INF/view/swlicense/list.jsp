<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CLMS</title>
</head>
	<span class="top-menu"><a href="/lab">실습실</a>  |  <a href="/computer">컴퓨터 </a>  |  <a href="/sw">SW</a>  |  <a href="/swlicense">SW 라이선스</a>  |  <a href="/account">사용자</a></span>
	<span class="top-account"><c:out value="${sessionScope.isLogin}"></c:out> 님
	<button type="button" onclick="location.href='/logout'">로그아웃</button>
	</span>
	<br/>
	<br/>
	<h2>SW 라이선스 목록</h2>
	<hr/>
	<table border="1">
		<tr>
			<td>번호</td>
			<td>SW 이름</td>
			<td>SW 계약 일자</td>
			<td>SW 만료 일자</td>
		</tr>
			
		<c:forEach items="${swLicenses}" var="swLicense">
			<tr>
				<td>${swLicense.no}</td>
				<td><a href="/swlicense/${swLicense.no}">${swLicense.swNo}</a></td>
				<td>${swLicense.contractDate}</td>
				<td>${swLicense.expiryDate}</td>
			</tr>
		</c:forEach>
	</table>
	
	<div align="right">
		<button type="button" onclick="location.href='/swlicense/form'">등록</button>
		<button type="button" >엑셀 다운로드</button>
	</div>
</body>
</html>