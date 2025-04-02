<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>session 객체 예제</title>
	</head>
	<body>
		<%
			// session 유지시간 설정 : 10초. 톰캣의 기본 session 유지시간 : 30분
			// session이 최종 사용된 시간 이후 10초로 설정함
			session.setMaxInactiveInterval(10);
		%>
		<h3>
		session 정보 : 브라우저별로 session이 할당됨.<br/>
		주요기능 : 클라이언트의 정보를 저장
		</h3>
		<%-- 새로운 session 객체 ? --%>
		isNew() : <%= session.isNew() %><br/>
		<%-- session 객체 생성시간 --%>
		생성시간 : <%= session.getCreationTime() %><br/>
		<%-- session 객체가 최종으로 사용된 시간 --%>
		최종접속시간 : <%= session.getLastAccessedTime() %><br/>
		<%-- session의 고유ID 값, session 객체가 다르면 다른 ID값을 가진다. --%>
		session id : <%= session.getId() %><br/>

	</body>
</html>