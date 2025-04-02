<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>이 페이지는 보여 지지 않습니다.</h1>
		<%
		String city = request.getParameter("city");
		// reqest, response 전달(공유)
		// 브라우저오 상관없이 서버내부에서 ex01_seoul.jsp 또는 ex01_busan.jsp 페이지 포워딩
		// 결과는 ex01_seoul.jsp 또는 ex01_busan.jsp의 결과로 브라우저로 응답 전달함
		// ex01_city.jsp 페이와 포워딩 ex01_seoul.jsp | ex01_busan.jsp
		// 페이지는 같은 request 영역에 속한 페이지
		pageContext.forward("ex01_" + city + ".jsp");
		%>
	</body>
</html>