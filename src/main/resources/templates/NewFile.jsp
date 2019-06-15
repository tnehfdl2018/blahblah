<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	//Connection con = DBCon.getCOnnect~~~~
	//for()~~

	for(String s : new String[]{"봉이 김선달", "김피카츄"}){
%>
	<p><%= s %></p>
<%		
	}
%>
</body>
</html>