/**
 * 
 */
let index = {};

index.cart = function(frm) {
	//로그인 확인
	let loginState = "";
	var testId = document.getElementById('testID');
	if(testId.value == "test"){
		loginState = null;
	}
	
	if(loginState != null){
		//해당 user의 마이페이지 - 장바구니 Page로 이동
		frm.action='userBook.do?job=cart';
		frm.submit();
	}
	else{
		//로그인 필요알람
		alert("로그인이 필요한 페이지입니다.");
		//login main Page로 이동
		frm.action='userBook.do?job=login';
		frm.submit();
	}
}

index.login = function(frm){
	frm.action='userBook.do?job=login';
	frm.submit();
}

index.findStr = function(frm){
	var str = frm.findStr.value;
	//let param = $(frm.findStr).value;
	//console.log(param);
	//$.post("userBook.do?job=search", param);
	
	console.log("findStr : " + str);
	frm.action='userBook.do?job=search';
	frm.submit();
}

index.category = function(){
	let frm = document.getElementById('frm_index_category');
	frm.action='userBook.do?job=category';
	frm.submit();
}


