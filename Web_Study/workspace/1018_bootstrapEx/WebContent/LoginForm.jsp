<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 폼</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
	.navbar-default { background-color:#fece10; }
	.navbar-default .navbar-nav>.active>a { background-color:orange; }
	.right {
		text-align: right;
	}
	#formWrapper {
		width: 326px;
		margin: 0 auto;
		margin-top: 50px;
	}
	#formWrapper .input-group {
	    margin-top: 18px;
	}
	#formWrapper .btn-default {
		margin: 10px;
		margin-left: 258px;
	}
	#formWrapper .input-group-addon {
		background-color: #fece10;
	}
	.btn-default {
		background-color: #fece10;
		color: #777;
	}
	
	.btn-default:hover {
		background-color:orange;
		
	}
	
</style>
</head>
<body>
	<nav class="navbar navbar-default">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">(주)휴먼소프트</a>
				<button type="button" class="navbar-toggle" data-toggle="collapse"
				        data-target="#myNavbar">
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
			</div>
			
			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav">
					<li class="active"><a href="#">Home</a></li>
					<li class="dropdown">
						<a class="dropdown-toggle" data-toggle="dropdown"
						   href="#">회사소개<span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="#">CEO 인사말</a></li>
							<li><a href="#">설립 목적</a></li>
							<li><a href="#">경영 이념</a></li>
							<li><a href="#">회사 연혁</a></li>
							<li class="divider"></li>
							<li><a href="#">찾아오는길</a></li>
						</ul>
					</li>	
					
					<li class="dropdown">
						<a class="dropdown-toggle" data-toggle="dropdown"
						   href="#">연구개발<span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="#">자연어 처리 시스템</a></li>
							<li><a href="#">RPA(로봇프로세스자동화)</a></li>
							<li><a href="#">사이버네틱스</a></li>
							<li><a href="#">감성정보처리</a></li>
						</ul>
					</li>
					
					<li class="dropdown">
						<a class="dropdown-toggle" data-toggle="dropdown"
						   href="#">고객지원<span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="#">공지게시판</a></li>
							<li><a href="#">문의게시판</a></li>
							<li><a href="#">자료실</a></li>
						</ul>
					</li>		
	
					<li class="dropdown">
						<a class="dropdown-toggle" data-toggle="dropdown"
						   href="#">개인정보취급방침<span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="#">개인정보의 수집목적 및 이용목적</a></li>
							<li><a href="#">개인정보 보유 및 이용 기간</a></li>
							<li><a href="#">개인정보의 파기 절차 및 방법</a></li>
							<li><a href="#">개인정보의 공유와 제공</a></li>
							<li><a href="#">이용자 권리와 그 행사 방법</a></li>
							<li><a href="#">개인정보 자동 수집 장치의 설치/운영 및 거부에 대한 사항</a></li>
						</ul>
					</li>																
				</ul>
				
				<ul class="nav navbar-nav navbar-right">
					<li><a href="LoginForm.jsp"><span class="glyphicon glyphicon-log-in"></span>로그인</a></li>
					<li><a href="MemberForm.jsp"><span class="glyphicon glyphicon-user"></span>회원가입</a></li>
				</ul>
			</div>
		</div>
	</nav>
	<div id="formWrapper">
		<form action="#" method="post">
			<div class="input-group input-group-lg">
			    <span class="input-group-addon" id="sizing-addon1">I D </span>
			    <input type="text" class="form-control" placeholder="Username" aria-describedby="sizing-addon1">
			</div>		
			<div class="input-group input-group-lg">
			    <span class="input-group-addon" id="sizing-addon1">PW</span>
			    <input type="password" class="form-control" placeholder="Password" aria-describedby="sizing-addon1">
			</div>						
			<button type="submit" class="btn btn-default">로그인</button>
		</form>	
	</div>
</body>
</html>