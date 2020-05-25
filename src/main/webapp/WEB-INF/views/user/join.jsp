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
				<div class="col-lg-4">
					<div class="jumbotron">
						<form action="joinAction" method="post"> <!-- form class="form-inline" : one line in row -->
							<h2 style="text-align: center">회원가입</h2>
							<div class="form-group">
								<label for="userId">ID :</label>
								<input type="text" class="form-control" name="userId" id="userId" placeholder="ID">
								<!-- form-control : text or select -->					
							</div>
							<div class="form-group">
								<label for="userPw">PW :</label>
								<input type="password" class="form-control" name="userPassword" id="userPw" placeholder="Password">					
							</div>
							<div class="form-group">
								<label for="userPw">Name :</label>
								<input type="text" class="form-control" name="userName" id="userName" placeholder="이름">					
							</div>
							<div class="form-group">
								<label for="userGender">Gender :</label>
								<div class="custom-control custom-radio" id="userGender">
									<input type="radio" class="custom-control-input" name="userGender" id="male" value="male" checked="true">
									<label class="custom-control-label" for="male">남자</label>
									<input type="radio" class="custom-control-input" name="userGender" id="female" value="female"
										style="margin-left: 10px">
									<label for="female">여자</label>
								</div>	
							</div>
							<div class="form-group">
								<label for="userEmail">Name :</label>
								<input type="email" class="form-control" name="userEmail" id="userEmail" placeholder="example@xxx.com">					
							</div>
							<input type="submit" class="btn btn-primary form-control" value="회원가입">
						</form>
					</div>
				</div>
			<div class="col-lg-4"></div>
		</div>
		
		<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
		<script src="../resources/js/bootstrap.js"></script>
	</body>
</html>