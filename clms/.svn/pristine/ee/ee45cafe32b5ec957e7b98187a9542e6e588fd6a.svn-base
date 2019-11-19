<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="kr.ac.sunmoon.clms.lab.Lab" %>
<%@ page import="java.util.ArrayList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<script src="https://code.jquery.com/jquery-3.4.1.min.js" integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo=" crossorigin="anonymous"></script>
		<meta charset="UTF-8">
		<title>실습실 목록</title>
	</head>
	
	<body>
		<span class="top-menu"><a href="/lab">실습실</a>  |  <a href="/computer">컴퓨터 </a>  |  <a href="/sw">SW</a>  |  <a href="/swlicense">SW 라이선스</a>  |  <a href="/account">사용자</a></span>
		<span class="top-account"><c:out value="${sessionScope.isLogin}"></c:out> 님
		<button type="button" onclick="location.href='/logout'">로그아웃</button>
		</span>
		<br/>
		<br/>
		<h2>실습실 목록</h2>
		<hr/>
		<br/>
		<br/>
			<div align="center">
				<table border="1">
					<tr>
						<td>실습실 번호</td>
						<td>관리부서 명</td>
						<td>사용부서 명</td>
						<td>컴퓨터 수량</td>
					</tr>
				<c:forEach items="${labs}" var="lab" >
					<tr>
						<td><a href="/lab/${lab.no}/form">${lab.no}</a></td>
						<td>${lab.managementDeptName}</td>
						<td>${lab.useDeptName}</td>
						<td>${lab.equipmentCount}</td>
					</tr>
				</c:forEach>
				</table><br>
		     	<div align="right"><button type="button" onclick="location.href='/lab/form'">등록</button></div>
    		</div>
	</body>
</html>