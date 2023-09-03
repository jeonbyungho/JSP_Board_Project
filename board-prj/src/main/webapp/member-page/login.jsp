<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>로그인</title>
</head>

<body>

	<div>
		<h2>로그인</h2>
	</div>
	
	<form action="${pageContext.request.contextPath}/member/login" method="post">
		<div>
			<label for="userid">
				<strong>아이디</strong>
			</label>
			<input type="text" name="userid" id="userid"/>
			<button>중복 확인</button>
		</div>
		
		<div>
			<label for="password">
				<strong>비밀번호</strong>
			</label>
			<input type="password" name="password" id="password"/>
		</div>
		
		<div>
			<button type="submit">로그인</button>
		</div>
	</form>
	
	<div>
		<a href="${pageContext.request.contextPath}/member/join">회원가입</a>
	</div>
</body>

</html>