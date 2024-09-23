<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css"/>
</head>
<body>
	<div class="header">
		<a href="/">영화 목록</a>
		<a href="/add">영화 정보 추가</a>
	</div>
	
	<h1>영화 정보 추가</h1>
	<form action="/add" method="post">
		<!-- back단에 보내려면 반드시 필요한 속성: name -->
		<input type="text" name="title" id="title" placeholder="영화 제목 입력" required>
		<input type="text" name="genre" id="genre" placeholder="영화 장르 입력" required>
		<input type="text" name="actor" id="actor" placeholder="영화 배우들 입력" required>
		<input type="submit" value="영화 추가" class="addMovieBtn">
	</form>
</body>
</html>