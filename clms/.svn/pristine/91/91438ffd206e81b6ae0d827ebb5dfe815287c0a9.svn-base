<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
  src="https://code.jquery.com/jquery-3.4.1.min.js"
  integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="
  crossorigin="anonymous"></script>
</head>
<body>
	<span class="top-menu">실습실 | 컴퓨터 | SW | SW 라이선스 | 사용자</span>
	<span class="top-account"><c:out value="${sessionScope.isLogin}"></c:out> 님
		<button type="button" onclick="location.href='/logout'">로그아웃</button>
	</span>

	<br>
	<h4>사용자 등록</h4>
	<hr>
	<form action="/account" method="post">
		<div class="form-main" align="center">
			<div class="form-id">
				<label>아이디 : </label><input type="text" id="input_id" name="id" placeholder="아이디" required="required" />
				<input type="button" id="check_id"  value="중복 확인"/>
			</div>
		
		<label>패스워드 : </label><input type="password" name="password" /><br>
		<label>패스워드 확인: </label><input type="password" name="rePassword" /><br>
		<label>이름 : </label><input type="text" name="name" /><br>
		<label>내선 번호 : </label><input type="text" name="extensionNo"  /><br>
		<label>권한 : </label>
		<select name="authority">
			<option value="M">사용자</option>
			<option value="A">관리자</option>
		</select>
		</div>
		<br>
		<div id="notice_area" align="center"></div>
		
		<div class="form-bottom" align="right">
			<input type="submit" id="submit" class="submit" value="등록"/>
			<button type="button" onclick="location.href='/account'">목록</button>
		</div>
	</form>
</body>
<script>
	$("#check_id").click(function() {
		var user_id = $('#input_id').val();
		if (user_id == null && user_id == '') {
			$('#notice_area').text('중복 확인을 실패했습니다.');
		} else {
			$.ajax({
				url : '${pageContext.request.contextPath}/account/check?id='+ user_id,
				type : 'get',
				success : function(data) {
					if (data.duplication == 'true') {
						$("#notice_area").text("중복 확인을 실패했습니다.");
						$("#noteice_area").css("color", "red");
						<%--$("#submit").attr("disabled", true); --%>
					} else {
						$("#notice_area").text("중복 확인을 성공했습니다.");
						$("#submit").attr("disabled", false);
					}
					<%-- 아이디 길이 체크, 사용할 수 없는 문자열 검사  --%>
				}
			});
		}
	});

	
	<%-- $("#input_id").blur(function() {
		var user_id = $('#input_id').val();
		$.ajax({
			localhost/account/check?id=admin
			url : '${pageContext.request.contextPath}/account/check?id='+ user_id,
			type : 'get',
			success : function(data) {
				if (data == 1) {
					$("#check").text("사용 중인 아이디입니다.");
					$("#check").css("color", "red");
				} else {
					$("#check").text("");
					$("#submit").attr("disabled", false);
				}
				아이디 길이 체크, 사용할 수 없는 문자열 검사 
			}
		});
	}); --%>
	
	$("input[name=submit]").click(function() {
		var id = $("input[name=id]").val();
		var password = $("input[name=password]").val();
		var rePassword = $("input[name=rePassword]").val();
		var name = $("input[name=name]").val();
		var extensionNo = $("input[name=extensionNo]").val();
		var authority = $("select[name=authority]").val();
		
		if (id != null 
				&& password != null 
				&& rePassword != null
				&& name != null
				&& extensionNo != null
				&& authority != null ) {
			
		}
	})
</script>
</html>