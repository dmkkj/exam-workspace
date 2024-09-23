<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
	
	<h1>영화 목록</h1>
	<div>
	<table>
		<tr>
			<th>제목</th>
			<th>장르</th>
			<th>영화배우</th>
			<th>삭제</th>
		</tr>
		<c:forEach var="Movie" items="${list}">
			<tr>
				<td>${Movie.title}</td>
				<td>${Movie.genre}</td>
				<td>${Movie.actor}</td>
				<td>
					<a href="/delete?id=${Movie.id}">삭제</a>
				</td>
				<!-- Post 방식
				<td>
					<form action="/delete" method="post" class="deleteBtn">
						<input type="hidden" name="id" value="${Movie.id}">
						<input type="submit" value="삭제">
					</form>
				</td>
				-->
			</tr>
		</c:forEach>
	</table>
	</div>
</body>
</html>
