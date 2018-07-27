<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

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
		<%@ include file="/common/left.jsp" %>
			<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">

				<div class="row">

					<div class="col-sm-10 blog-main">

						<div class="blog-post">
						<form action="/createPost" method="post" id="frm22">
							<input type="hidden" name="brdNum" value="${brd_num }"/>
							<pre>제목     <input type="text" style="width:500px " placeholder="제목 입니다" name="title"/></pre><br>
							글내용 <textarea name="smarteditor" id="smarteditor" rows="10" cols="100" style="width:766px; height:412px;"></textarea>
							<pre>첨부파일 <input multiple="multiple" type="file" name="upLoadFile"/>
							<input type="button" id="createBtn" value="저장" />
						</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
