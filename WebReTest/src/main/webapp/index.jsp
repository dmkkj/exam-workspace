<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>사원 정보 조회 (사원 번호 검색)</h1>
	<!-- 문제점 1: form에서 action이 없음 -->
	<form action="/search">
		<!-- 문제점 2: 나는 분명 입력했는데 id가 없음. name="id" 추가해줘야 함 -->
		<input type="text" placeholder="사원 번호 입력" name="id">
		<input type="submit" value="조회">
	</form>
</body>
</html>