<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>진료코드</td>
			<td>${Treat.goTreatCode}</td>			
		</tr>
		<tr>
			<td>병원명</td>
			<td>${Treat.goHospitalName}</td>
		</tr>
		<tr>
			<td>병원주소</td>
			<td>${Treat.goHospitalAddress}</td>
		</tr>
		<tr>
			<td>국민이름</td>
			<td>${Treat.goCitizenName}</td>
		</tr>
		<tr>
			<td>의사명</td>
			<td>${Treat.goDoctorName}</td>
		</tr>
		<tr>
			<td>진료과목</td>
			<td>${Treat.goTreatSubjectName}</td>
		</tr>
		<tr>
			<td>차트코드</td>
			<td>${Treat.goChartCode}</td>
		</tr>
		<tr>
			<td>질병명</td>
			<td>${Treat.goDiseaseKor}</td>
		</tr>
		<tr>
			<td>차트순번</td>
			<td>${Treat.goChartSeq}</td>
		</tr>
		<tr>
			<td>진료내용</td>
			<td>${Treat.goTreatContents}</td>
		</tr>
		<tr>
			<td>진료등록일</td>
			<td>${Treat.goTreatRegistrationDate}</td>
		</tr>
	</table>

</body>
</html>