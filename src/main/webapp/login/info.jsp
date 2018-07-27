<%@page import="student.model.StudentVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		application.setAttribute("std_id", request.getParameter("std_id"));
		application.setAttribute("pass", request.getParameter("pass"));
		
		
		RequestDispatcher rd = request.getRequestDispatcher("/board/main.jsp");
		rd.forward(request, response);
	%>
</body>
</html>