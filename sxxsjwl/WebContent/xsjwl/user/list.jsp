<%@page import="com.sxxsjwl.pojo.User"%>
<%@page import="java.util.List"%>
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
		<table>
			<tr>
				<td width="100px" align="center">id</td>
				<td width="100px" align="center">name</td>
				<td width="100px" align="center">pwd</td>
				<td width="100px" align="center">power</td>
				<td width="100px" align="center">操作</td>
			</tr>
			<%
				List<User> list = (List) session.getAttribute("user_list");
				User u;
				if (!list.isEmpty() && list.size() > 0) {
					for (int i = 0; i < list.size(); i++) {
						u = list.get(i);
			%>
			<tr>
				<td width="100px" align="center"><%=u.getU_id()%></td>
				<td width="100px" align="center"><%=u.getU_name()%></td>
				<td width="100px" align="center"><%=u.getU_pwd()%></td>
				<td width="100px" align="center"><%=u.getU_power()%></td>
				<td width="100px" align="center"><a href="#">修改</a>/<a href="#">删除</a></td>
			</tr>
			<%
				}
				}
			%>
		</table>
	</center>
</body>
</html>