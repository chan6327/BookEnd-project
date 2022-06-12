<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Book Search</title>
</head>
<body>
	<h1>유저 상품 Search Page</h1>
	검색했을때 불러오는 Page
	세부 카테고리, 검색 list 등등...<br>
	<input type='text' name='findStr' value='${param.findStr}' size='10px'/>
	
</body>
</html>