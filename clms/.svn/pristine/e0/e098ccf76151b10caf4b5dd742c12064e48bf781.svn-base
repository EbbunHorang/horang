<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>실습실 등록</title>
	</head>
	
	<body>
	<script src="https://code.jquery.com/jquery-3.4.1.min.js" integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo=" crossorigin="anonymous"></script>
	<span class="top-menu"><a href="/lab">실습실</a>  |  <a href="/computer">컴퓨터 </a>  |  <a href="/sw">SW</a>  |  <a href="/swlicense">SW 라이선스</a>  |  <a href="/account">사용자</a></span>
	<span class="top-account"><c:out value="${sessionScope.isLogin}"></c:out> 님
	<button type="button" onclick="location.href='/logout'">로그아웃</button>
	</span>
	<br/>
	<br/>
	<h2>실습실 등록</h2>
	<hr/>
		<form action="/lab" method="post">실습실 번호 : 
			<input type="text" id="no" name="no"><br>
				<div class="already" id="already"></div>관리부서 명 : 
			<input type="text" name="managementDeptName"> <br>사용부서 명 : 
			<input type="text" name="useDeptName"><br>용도 : 
			<input type="text" name="usage"><br>컴퓨터 수량 : 
			<input type="text" name="equipmentCount"><br>
			<input type="submit" id="submit" value="등록">
			<a href="/lab"><button type="button">목록</button></a>
		</form>
		
		<script>
		$("#submit").attr("disabled", true);
		$("#no").blur(function() {
			var no = $('#no').val();
			$.ajax({
				url : '${pageContext.request.contextPath}/check?no='+ no,
				type : 'get',
				success : function(data) {
					console.log("1 = 중복o / 0 = 중복x : "+ no);							
					
					if (data == 1) {
							$("#already").text("호실이 이미 있어요 :(");
							$("#already").css("color", "red");
							$("#submit").attr("disabled", true);
						} else {
							$("#already").text("호실을 등록할 수 있어요 :)");
							$("#already").css("color", "red");
							$("#submit").attr("disabled", false);
						}
					}, error : function() {
							console.log("실패");
					}
				});
			});
		</script>
	</body>
</html>