<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
    <head>
		<script src="https://code.jquery.com/jquery-3.4.1.min.js" integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo=" crossorigin="anonymous"></script>
	    <meta charset="UTF-8">
	    <title>실습실 수정</title>
    </head>
    
    <body>
        <span class="top-menu"><a href="/lab">실습실</a>  |  <a href="/computer">컴퓨터 </a>  |  <a href="/sw">SW</a>  |  <a href="/swlicense">SW 라이선스</a>  |  <a href="/account">사용자</a></span>
		<span class="top-account"><c:out value="${sessionScope.isLogin}"></c:out> 님
		<button type="button" onclick="location.href='/logout'">로그아웃</button>
		</span>
		<br/>
		<br/>
		<h2>실습실 수정</h2>
		<hr/>
		<br/>
		<br/>
            <div align="center">
                <form action="/lab/${lab.no}" method="post" id="lab_id">
                	<input type="hidden" name="_method" value="delete"/>실습실 번호 : ${lab.no}<br>
                    <input type="hidden" name="no" value="${lab.no}" />관리부서 명 :
                    <input type="text" name="managementDeptName" value="${lab.managementDeptName}" /><br>사용부서 명 :
                    <input type="text" name="useDeptName" value="${lab.useDeptName}" /><br>용도 :
                    <input type="text" name="usage" value="${lab.usage}" /><br>컴퓨터 수량 :
                    <input type="text" name="equipmentCount" value="${lab.equipmentCount}" /><br><br><br>
                    <button type="button" id="edit_btn">수정</button>
                    <button type="button" id="delete_btn">삭제</button>
                    <button type="button" id="list_btn">목록</button>
                </form>
            </div>
    </body>
    <script>
		$(document).ready(function(){
		       $("#edit_btn").click(function() {
		           $('#lab_id').attr("action", "/lab");
		           $('input[name=_method]').val('put');
		           $('#lab_id').submit();
		       });
		       
		       $("#delete_btn").click(function() {
		           $('input[name=_method]').val('delete');
		           $('#lab_id').submit();
		       });
		    });
    </script>
</html>


