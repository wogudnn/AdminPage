<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	강의 등록 페이지
	<form method="post" action="<c:url value="/doRegistLecture"/>">
		
		<label for="lectureName">강의명 </label>
		<input type="text" id="lectureName" name="lectureName" placeholder="개설 할 강의명을 입력하세요"/><br/>
		
		<input type="submit" value="등록" />
	
	</form>
</body>
</html>