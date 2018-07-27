<%@page import="board.model.BoardVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="/js/jquery-1.12.4.js"></script>
<link href="/bootstrap/css/bootstrap.css" rel="stylesheet">
<!-- Bootstrap core CSS -->
<script src="/bootstrap/js/bootstrap.js"></script>
<!-- Custom styles for this template -->
<link href="/css/dashboard.css" rel="stylesheet">
<link href="/css/blog.css" rel="stylesheet">
<link href="/css/common.css" rel="stylesheet">
<script>

</script>
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

						<div class="blog-post">
							<form action="/insertBoard">
								<h3>게시판 이름  <input type="text" name="boardName" id="boardName">
								<select name="createSel">
									<option value="y">사용</option>
									<option value="n">미사용</option>
								</select>
								<button id="createBtn" type="submit">생성</button>
								</h3>
							</form>
							<c:forEach items="${boardList}" var="boardVo">
								<form action="/updateBoard">
									<h3>게시판 이름  <input type="text" value="${boardVo.brd_name}">
									<input id="val${boardVo.brd_num}" type="hidden" value="${boardVo.brd_num}" name="brd_num">
									<select name="sel">
										<option value="y" ${boardVo.brd_yn eq "n" ? "selected" : ""}>사용</option>
										<option value="n" ${boardVo.brd_yn eq "n" ? "selected" : ""}>미사용</option>
									</select>
									<button id="updateBtn${boardVo.brd_num}" type="submit">수정</button>
									</h3>
								</form>
							</c:forEach>
							
							<hr>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>