<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>회원가입 - 환영합니다.</title>
</head>

<body>

	<div>
		<a href="${pageContext.request.contextPath}/member/login">로그인</a>
		<h2>회원가입</h2>
	</div>
	
	<form action="${pageContext.request.contextPath}/member/join" method="post" name="join-form" enctype="multipart/form-data">
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
			<label for="name">
				<strong>이름</strong>
			</label>
			<input type="text" name="name" id="name"/>
		</div>
		
		<div>
			<label for="birthday">
				<strong>생년월일</strong>
			</label>
			<input type="text" name="birthday" id="birthday"/>
		</div>
		
		<div>
			<strong>성별</strong>
			<label for="gender-male">남자</label>
			<input type="radio" name="gender" id="gender-male" value="male"/>
			<label for="gender-female">여자</label>
			<input type="radio" name="gender" id="gender-female" value="female"/>
		</div>
		
		<div>
			<label for="email">
				<strong>이메일</strong>
			</label>
			<input type="email" name="email" id="email"/>
		</div>
		
		<div>
			<label for="photo">
				<strong>프로필</strong>
			</label>
			<input type="file" name="photo" id="photo"/>
		</div>
		
		<div>
			<button type="submit">회원가입</button>
		</div>
	</form>
</body>

</html>