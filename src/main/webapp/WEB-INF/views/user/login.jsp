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
			<div class="col-lg-4"></div>
				<div class="col-lg-4"> <!-- col-lg-* : sum(*)=12 -->
					<div class="jumbotron">
						<form action="loginAction" method="post">
							<h2 style="text-align: center">로그인 화면</h2>
							<div class="form-group">
								<label for="userId">ID :</label>
								<input type="text" class="form-control" name="userId" id="userId" placeholder="ID" required="true">					
							</div>
							<div class="form-group">
								<label for="userPw">PW :</label>
								<input type="password" class="form-control" name="userPw" id="userPw" placeholder="Password">					
							</div>
							<input type="submit" class="btn btn-primary form-control" value="로그인">
						</form>
					</div>
				</div>
			<div class="col-lg-4"></div>
		</div>
		
		<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
		<script src="/resources/js/bootstrap.js"></script>
	</body>
</html>