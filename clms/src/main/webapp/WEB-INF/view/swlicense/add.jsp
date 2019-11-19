<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CLMS</title>
</head>
<body>
	<form action="/swlicense" method="post">
		SW 이름 : <input type="text" name="swName"/>
		실습실 선택 : <select title="uselab" name="useLabNo" onchange="this.value;">
						<option value="301">301
						<option value="302">302
						<option value="303">303
		 				<option value="304">304
						<option value="315">315
						<option value="316">316
						<option value="321">321
						<option value="333">333
						<option value="334">334
						<option value="335">335
						<option value="503">503
						<option value="504">504
						<option value="505">505
						<option value="516">516
						<option value="517">517
						<option value="601">601
				 </select><br/>
		실습실 : <input type="text" name="useLab" title="uselab"/><br/>
		SW 계약 일자 : <input type="text" id="constractDay"/>
		SW 만료 일자 : <input type="text" id="expiryDay"/><br/>
		SW 인증 코드 : <input type="text" name="authenticationCode"/><br/>
		카피수 : <input type="text" name="copies"/><br/>
		계약 담당 부서 명 : <input type="text" name="contractDept"/><br/>
		계약 담당자 명 : <input type="text" name="contractName"/>
		계약 담당자 전화번호 : <input type="text" name="contractPhone"/><br/>
		공급 업체 명 : <input type="text" name="supplierName"/><br/>
		공급 업체 담당자 명 : <input type="text" name="supplierContactName"/> 
		공급 업체 담당자 전화번호 : <input type="text" name="supplierPhone"/><br/>
		비고 : <input type="text" name="note"/>
		<br/>
		<br/>
		<div align="right">
	        <input type="submit" value="등록" />
	        <button type="button" onclick="location.href='/swlicense'">목록</button>
		</div>
	</form>
</body>

<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/js/bootstrap-datepicker.min.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.4.1/css/bootstrap-datepicker3.css"/>
<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="http://code.jquery.com/ui/1.11.0/jquery-ui.js"></script>
<link rel="stylesheet" href="http://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">

<script>
	$(function() {
	    $( "#constractDay" ).datepicker({
	    	showOn: "focus",
	    	changeMonth: true,
	    	changeYear: true,
	    	nextText: '다음 달',
	    	prevText: '이전 달',
 	    	showButtonPannel: true,
	    	currentText: '오늘 날짜',
	    	dateFormat: 'yy-mm-dd', 
	    	changeMonth: true, 
	        dayNamesMin: ['월', '화', '수', '목', '금', '토', '일'], 
	        monthNames: ['1월','2월','3월','4월','5월','6월','7월','8월','9월','10월','11월','12월'],
	    });
	    
	    $( "#expiryDay" ).datepicker({
	    	showOn: "focus",
	    	changeMonth: true,
	    	changeYear: true,
	    	nextText: '다음 달',
	    	prevText: '이전 달',
 	    	showButtonPannel: true,
	    	currentText: '오늘 날짜',
	    	dateFormat: 'yy-mm-dd', 
	    	changeMonth: true, 
	        dayNamesMin: ['월', '화', '수', '목', '금', '토', '일'], 
	        monthNames: ['1월','2월','3월','4월','5월','6월','7월','8월','9월','10월','11월','12월'],
	    });
	    
	    $(function() {
	        $('#constractDay').datepicker({dateFormat: 'yy-mm-dd'})
	        $('#expiryDay').datepicker({dateFormat: 'yy-mm-dd'})
	    });
	});
</script>

</html>