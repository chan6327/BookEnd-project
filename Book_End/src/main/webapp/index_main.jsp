<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book& MainPage</title>
<link rel = 'stylesheet' type = 'text/css' href = './css/index_main.css'>
<script src='./lib/jquery-3.6.0.min.js'></script>
<script src='./js/index_main.js'></script>
</head>
<body>
	<!-- Click시 Page가 변환? or inc로 웹정보를 load? -->
	<form name='frm_index_login' id='frm_index_login' method='post'>
		<input type='text' id='testID' size='15px' /><br>
		<button type='button' onclick='index.login(this.form)' >로그인</button>
		<button type='button' onclick='index.cart(this.form)' >장바구니</button>
	</form>
	<hr><hr>
	<form name='frm_index_search' id='frm_index_search' method='post'>
		<input type='search' id='findStr' size='15px' value='${param.findStr }' /><br>
		<button type='button' onclick='index.findStr(this.form)'>검색</button>
	</form>
	<hr>
	<div id ='top'>
		<label>카테고리</label>
		<form name='frm_index_category' id='frm_index_category' method='post'>
			<nav id='nav'>
				<ul>
					<li><a href='#' onclick='index.category()'>메뉴1</a></li>
					<li><a href='#' onclick='index.category()'>메뉴2</a></li>
					<li><a href='#' onclick='index.category()'>메뉴3</a></li>
					<li><a href='#' onclick='index.category()'>메뉴4</a></li>
					<li><a href='#' onclick='index.category()'>메뉴5</a></li>
				</ul>
			</nav>
		</form>
	</div>
	<hr>
	<div id='mid'>
		<textarea id='textBox'></textarea>
	</div>
	<hr>
	<footer id='footer'>
		서울 봉천 노랑달걀 7층</br>
		tel : 02-1111-2222</br>
		fax : 02-3333-4444
	</footer>
	
</body>
</html>