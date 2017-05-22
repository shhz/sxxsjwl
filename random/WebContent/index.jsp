<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<form action="servlet/login.do">
		<center>
			<h2>登录</h2>
			<table>
				<tr>
					<td>请输入用户名</td>
				</tr>
				<tr>
					<td><input id="name" name="name" type="text" /></td>
				</tr>
				<tr>
					<td><input value="登录" type="submit" /></td>
				</tr>
			</table>
		</center>
	</form>
</body>
</html>