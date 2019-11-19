<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CLMS</title>
</head>
<body>
	<span class="top-menu"><a href="/lab">실습실</a>  |  <a href="/computer">컴퓨터 </a>  |  <a href="/sw">SW</a>  |  <a href="/swlicense">SW 라이선스</a>  |  <a href="/account">사용자</a></span>
	<span class="top-account"><c:out value="${sessionScope.isLogin}"></c:out> 님
	<button type="button" onclick="location.href='/logout'">로그아웃</button>
	</span>
	<br/>
	<br/>
	<h2>SW 라이선스  정보 조회</h2>
	<hr/>
	<table border=1>
		<tr>
			<th>SW 이름</th>
			<td>${swLicense.swNo}</td>
			<th>실습실</th>
			<td>${swLicense.useLabNo}</td>
		</tr>
		<tr>
			<th>SW 계약 일자</th>
			<td>${swLicense.contractDate}</td>
			<th>SW 만료 일자</th>
			<td>${swLicense.expiryDate}</td>
		</tr>
		<tr>
			<th>SW 인증 코드</th>
			<td colspan="3">${swLicense.authenticationCode}</td>
		</tr>
		<tr>
			<th>카피수</th>
			<td colspan="3">${swLicense.copies}</td>	
		</tr>
		<tr>
			<th>계약 담당 부서 명</th>
			<td colspan="3">${swLicense.contractDept}</td>	
		</tr>
		<tr>
			<th>계약 담당자 명</th>
			<td>${swLicense.contractName}</td>
			<th>계약 담당자 전화번호</th>
			<td>${swLicense.contractPhone}</td>
		</tr>
		<tr>
			<th>공급 업체 명</th>
			<td colspan="3">${swLicense.supplierContactName}</td>
		</tr>
		<tr>
			<th>공급 업체 담당자 명</th>
			<td>${swLicense.supplierContactName}</td>
			<th>공급 업체 담당자 전화번호</th>
			<td>${swLicense.supplierPhone}</td>
		</tr>
		<tr>
			<th >비고</th>
			<td colspan="3">${swLicense.note}</td>
		</tr>
	</table>
	<div align="right">
		<button type="button" onclick="location.href='/swlicense/{no}/form'">수정</button>
		<button type="button" onclick="location.href='url'">삭제</button>
		<button type="button" onclick="location.href='/swlicense'">목록</button>
	</div>
</body>
</html>