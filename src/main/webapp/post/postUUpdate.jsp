<%@page import="student.service.StudentService"%>
<%@page import="student.service.StudentServiceInf"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="../../favicon.ico">

<title>Jsp</title>

<script src="/js/jquery-1.12.4.js"></script>
<link href="/bootstrap/css/bootstrap.css" rel="stylesheet">
<!-- Bootstrap core CSS -->
<script src="/bootstrap/js/bootstrap.js"></script>
<!-- Custom styles for this template -->
<link href="/css/dashboard.css" rel="stylesheet">
<link href="/css/blog.css" rel="stylesheet">
</head>

<body>

	<!-- top.jsp -->
	<%@ include file="/common/top.jsp"%>
	<div class="container-fluid">
		<div class="row">

		<!-- left.jsp -->
		<%@ include file="/common/left.jsp" %> %>
			<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">

				<div class="row">

					<div class="col-sm-8 blog-main">
						
						<%
							StudentVo studentVo = (StudentVo)session.getAttribute("studentVo");
						%>					
		
						<div class="blog-post">
							<pre>제목       :    <input type="text" value="<%=request.getParameter("pt_title") %>" name="pt_title"/></pre>
							글내용<textarea name="smarteditor" id="smarteditor" rows="10" cols="100" style="width:766px; height:412px;"><%=request.getParameter("pt_content") %></textarea>
<%-- 							<pre>글내용     :    <input type="text" value="${postVo.pt_content }" name="pt_content"/></pre> --%>
							<pre>첨부파일   : </pre>
						
						<form action="/postDetail">
							<input type="submit" value="저장"/>
						</form>
						
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
