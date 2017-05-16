<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<form action="servlet/login.do" method="post">
			<table>
				<tr>
					<td>用户名</td>
					<td><input id="name" name="name" /></td>
				</tr>
				<tr>
					<td>密码</td>
					<td><input id="pwd" name="pwd" type="password" /></td>
				</tr>
			</table>
			<input id="sub" type="submit" value="登录" /><input id="res"
				type="reset" value="重置" />
		</form>
	</center>
</body>
</html>