<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="col-sm-3 col-md-2 sidebar">
	<ul class="nav nav-sidebar">
		<li><a href="/boardServlet">게시판 생성<span class="sr-only">(current)</span></a></li><br>
			<c:forEach items="${boardYList}" var="boardVo">
				<li class="active"><a href="/postList?brd_num=${boardVo.brd_num}&page=1&pagesize=10&brd_name=${boardVo.brd_name}">${boardVo.brd_name}</a></li>
			</c:forEach>
	</ul>
</div>