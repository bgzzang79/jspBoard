<%@page import="post.model.PostVo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
<link href="/css/common.css" rel="stylesheet">

<script>
	$(function(){
		$("table tbody tr").on("click",function(){
			//tr태그의 data-id 속성 값을 읽어서 input태그의 id값으로 설정
			//form 태그를 submit
			$("#id").val($(this).data("id"));
			$("#frm").submit();
		});
	});
</script>

</head>

<body>

	<!-- top.jsp -->
	<%@ include file="/common/top.jsp"%>
	<form id="frm" action="/postDetail" method="get">
		<input type="hidden" name="id" id="id">
	</form>
	
	<div class="container-fluid">
		<div class="row">

		<!-- left.jsp -->
		<%@ include file="/common/left.jsp" %>
			<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
				<div class="row">
					<div class="col-sm-8 blog-main">
					<h2 class="sub_header">${brd_name}</h2>
						<div class="table_responsive">
<!-- 						<form action="/createPost"> -->
								<table class="table table-striped">
								<thead>
									<tr align="center">
										<td>게시글<br>번호</td>
										<td>제목</td>
										<td>작성자<br>아이디</td>
										<td>작성일시</td>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${postList}" var="postVo">
										<tr data-id="${postVo.pt_num }">
											<td align="center">${postVo.pt_num}</td>
											<td>${postVo.pt_title}</td>
											<td align="center">${postVo.pt_writer}</td>
											<td align="center"><fmt:formatDate value="${postVo.pt_date}" pattern="yyyy-MM-dd"/></td>
										</tr>
									</c:forEach>
								</tbody>
								</table>
<!-- 							<input type="submit" value="새글등록"> -->
<!-- 						</form> -->
						</div>
						<a class="btn btn-default pull-rigth" href="/post/createPost.jsp">새글등록</a>
						
						<div class="text-center">
							<ul class="pagination">
							<%
								List<PostVo> postList = (List<PostVo>)session.getAttribute("postList");	
							
								int size = postList.size();
								int pageNum = Integer.parseInt(request.getParameter("page"));
								int pageSize = Integer.parseInt(request.getParameter("pagesize"));
								
								if(size%pageSize==0){
									size = size/pageSize;
								}else{
									size = size/pageSize+1;
								}
								
								int prevPage = pageNum ==1 ? 1: pageNum -1;
								int nextPage = pageNum == size ? pageNum : pageNum+1;
							%>
								<li>
									  <a href="/postList?page=<%=prevPage %>&pagesize=<%=pageSize%>" aria-label="Previous">
									    <span aria-hidden="true">&laquo;</span>
									  </a>
								</li>
								<%
									for(int i=1; i<=size; i++){ 
										String activeClass = "";
								%>
									<%if(i==pageNum){
										activeClass="class=\"active\"";
									}%>
										<li <%=activeClass %>><a href="/postList?page=<%=i%>&pagesize=<%=pageSize%>"><%=i %></a></li>
									
									<%-- <%=request.getAttribute("pageNavi") %> --%>
								<% }%>
								<li>
								   <a href="/postList?page=<%=nextPage%>&pagesize=<%=pageSize %>" aria-label="Next">
								     <span aria-hidden="true">&raquo;</span>
								   </a>
								</li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
