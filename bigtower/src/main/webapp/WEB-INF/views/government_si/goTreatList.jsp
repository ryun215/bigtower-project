<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
</head>
<body>
	
	<table>
		<thead>
			<tr>
				<td>기간 :</td> 
				<td><input class="date" type= "date" name="firstDay" id="firstDay">~</td>			
				<td><input class="date" type= "date" name="secondDay" id="secondDay"></td>
			</tr>
			<tr>
				<td>진료과목 :</td> 
				<td colspan="2"><input id="subjectSearch" type="text" name="subjectSearch"></td>
			</tr>
			<tr>
				<td>병원 :</td> 
				<td colspan="2"><input id="hospitalSearch" type="text" name="hospitalSearch"></td>
			</tr>
			<tr>
				<td>질병명:</td> 
				<td colspan="2"><input id="diseaseSearch" type="text" name="diseaseSearch"></td>
			</tr>
			<tr>
				<td>의사명:</td> 
				<td colspan="2"><input id="doctorSearch" type="text" name="doctorSearch"></td>
			</tr>
		</thead>
	</table>
	<br>
	<input type="button" id="btn" value="검색">
	
	<br><br>
	
	<table border="1">
		<thead>
			<tr>
				<td>진료코드</td>
				<td>이름</td>
				<td>병원명</td>
				<td>의사명</td>
				<td>진료과목</td>
				<td>질병명</td>
				<td>진료등록일</td>
			</tr>
		</thead>
		<!-- 진료테이블에 있는 데이터를 목록으로 출력한다. -->
		<tbody>
		</tbody>
	</table>
	<script>
		$(document).ready(function(){			
			//버튼 클릭시 검색조건과 내용에 부합하는 목록 출력하기
			$("#btn").bind("click",function(){		
				
				$.ajax({
					url : "/government/treatSearch",
					type : "GET",
					data : {'firstDay' : $('#firstDay').val(),
							'secondDay' : $('#secondDay').val(),
							'subjectSearch' : $('#subjectSearch').val(),
							'hospitalSearch' : $('#hospitalSearch').val(),
							'diseaseSearch' : $('#diseaseSearch').val(),
							'doctorSearch' : $('#doctorSearch').val()},
					//함수가 성공하면
					success : function(data){
						console.log('성공');
						$('tbody').empty();
						var count = data.length;
						console.log('count:'+count);
						alert(count + '건이 검색되었습니다.');
						//반복문을 통해 검색조건에 맞는 목록을 출력한다
						$.each(data, function(key, item) {  
							console.log('goCitizenName:'+item.goCitizenName);
						 	var diseaseKor = '';
						 	//질병목록 가져오는 반복문
						 	$.each(item.diagnosisList, function(key, value) {
								console.log('test');
								console.log('value'+value);
								console.log('value.goDiseaseKor'+value.goDiseaseKor);
								diseaseKor += value.goDiseaseKor+',';
							});
							var table = '<tr>'
											+'<td><a href="<c:url value="/government/treatView?goTreatCode='+item.goTreatCode+'" />">'+item.goTreatCode+'</a></td>'
											+'<td>'+item.goCitizenName+'</td>'
											+'<td>'+item.goHospitalName+'</td>'
											+'<td>'+item.goDoctorName+'</td>'
											+'<td>'+item.goTreatSubjectName+'</td>'
											+'<td>'
											+diseaseKor+'</td>'
											+'<td>'+item.goTreatRegistrationDate+'</td>'
										+'</tr>';
										console.log(table);
							$('tbody').append(table);								
						})

					}
				});
			}); //click functin 종료
		});
	</script>
</body>
</html>