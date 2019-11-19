<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.4.1.min.js"
	integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="
	crossorigin="anonymous">
 </script>
</head>
<body>
	<span class="top-menu">실습실 | 컴퓨터 | SW | SW 라이선스 | 사용자</span>
	<span class="top-account"><c:out value="${sessionScope.isLogin}"></c:out> 님
		<button type="button" onclick="location.href='/logout'">로그아웃</button>
	</span>

	<br>
	<h4>사용자 수정</h4>
	<hr>
	<form id="form_data" action="/account/${account.id}" method="post">
		<input type="hidden" name="_method" /> 
		<input type="hidden" name="id" value="${account.id}" />
		<div class="form-main" align="center">
			<div class="form-id">
				<div id="check" class="check"></div>
			</div>

			<label>패스워드 : </label><input type="password" name="password" /><br>
			<label>패스워드 확인: </label><input type="password" name="rePassword" /><br>
			<label>이름 : </label><input type="text" name="name"
				value="${account.name}" /><br> <label>내선 번호 : </label><input
				type="text" name="extensionNo" value="${account.extensionNo}" /><br>
			<label>권한 : </label> <select name="authority">
				<c:if test="${account.authority eq 'M'}">
					<option value="M" selected="selected">사용자</option>
					<option value="A">관리자</option>
				</c:if>
				<c:if test="${account.authority eq 'A'}">
					<option value="A" selected="selected">관리자</option>
					<option value="M">사용자</option>
				</c:if>
			</select>
		</div>
		<div class="form-bottom" align="right">
			<input type="submit" id="edit_btn" class="edit" value="수정" /> 
			<input type="submit" id="delete_btn" class="delete" value="삭제" />
			<button type="button" onclick="location.href='/account'">목록</button>
		</div>
	</form>
</body>
<script>
	$(document).ready(function(){
    	$("#edit_btn").click(function() {
    		$('#form_data').attr("action", "/account");
    		$('input[name=_method]').val('put');
    		$('#form_data').submit();
    	});
    	
    	$("#delete_btn").click(function() {
    		$('input[name=_method]').val('delete');
    		$('#form_data').submit();
    	});
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
					$("#submit").attr("disabled", true);
				} else {
					$("#check").text("");
					$("#submit").attr("disabled", false);
				}
				아이디 길이 체크, 사용할 수 없는 문자열 검사 
			}
		});
	}); --%>
</script>
</html>