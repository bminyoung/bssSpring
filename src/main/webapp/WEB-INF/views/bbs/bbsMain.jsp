<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta name="viewport" content="width=device-width", initial-scale="1"> <!-- mobile -->
		<title>Spring BSS</title>
	</head>
	<body>
		<%@ include file="../include/nav.jsp" %>
		
		<div class="container">
			<table class="table" style="text-align: center; border: 1px solid #dddddd">
				<thead>
					<tr>
						<th style="text-align: center; background-color: #eeeeee">글 번호</th>
						<th style="text-align: center; background-color: #eeeeee">제목</th>
						<th style="text-align: center; background-color: #eeeeee">작성자</th>
						<th style="text-align: center; background-color: #eeeeee">작성일자</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>1</td>
						<td>test입니다</td>
						<td>qo613</td>
						<td>20.05.25</td>
					</tr>
				</tbody>
			</table>
			<a href="bbs/write" class="btn btn-primary pull-right">글쓰기</a>
		</div>
		
		
		<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
		<script src="/resources/js/bootstrap.js"></script>
	</body>
</html>