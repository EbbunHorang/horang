<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<script src="https://code.jquery.com/jquery-3.4.1.min.js" integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo=" crossorigin="anonymous"></script>
	<head>
		<meta charset="UTF-8">
		<title>컴퓨터 정보 수정</title>
	</head>
		<body>
			<span class="top-menu"><a href="/lab">실습실</a>  |  <a href="/computer">컴퓨터 </a>  |  <a href="/sw">SW</a>  |  <a href="/swlicense">SW 라이선스</a>  |  <a href="/account">사용자</a></span>
			<span class="top-account"><c:out value="${sessionScope.isLogin}"></c:out> 님
			<button type="button" onclick="location.href='/logout'">로그아웃</button>
			</span>
			<br/>
			<br/>
			<h2>컴퓨터 정보 수정</h2>
			<hr/>
			<br/>
			<br/>
				<div align="center">
					<form action="/computer/${computer.no}" method="post" id="computer_id">
						<input type="hidden" name="_method" value="put" />
						<input type="hidden" name="no" value="${computer.no}" />
						실습실 번호 : <input type="text" name="laboratoryNo" value="${computer.laboratoryNo}"><br>
						이름 : <input type="text" name="name" value="${computer.name}"><br>
						기준 등록 일자 : ${computer.specRegDate}<br>
						CPU : ${computer.cpu}<br>
						VGA : ${computer.vga}<br>
						RAM : ${computer.ram}<br>
						HDD : ${computer.hdd}<br>
						SSD : ${computer.ssd}<br>
							<button type="button" id="edit_btn">수정</button>
							<button type="button" id="delete_btn">삭제</button>
							<a href="/computer"><button type="button" id="list_btn">목록</button></a>
					</form>
				</div>
		</body>
	
	<script>
		$(document).ready(function(){
	       $("#edit_btn").click(function() {
	           $('#computer_id').attr("action", "/computer");
	           $('input[name=_method]').val('put');
	           $('#computer_id').submit();
	       });
	       
	       $("#delete_btn").click(function() {
	           $('input[name=_method]').val('delete');
	           $('#computer_id').submit();
	       });
	    });
	</script>
</html>