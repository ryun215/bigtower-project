<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>예방접종 요청</title>
</head>
<body>

		<form action="<c:url value='/government/vaccination'/>" method="post">
		
		<input type="date" name="firstDate">-<input type="date" name="secondDate">
		기간입력
		<input type="submit" value="검색"/>
	</form>
</body>
</html>