<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
div {
	border: 1px;
	width: 100px;
	height: 100px;
	text-align: center;
	background-color: gray;
}

input {
	width: inherit;
	height: inherit;
}

.redDiv {
	border: 1px;
	width: 100px;
	height: 100px;
	text-align: center;
	background-color: red;
}
</style>
</head>
<body>
	<center>
		<table>
			<tr>
				<td><div id="1">壹</div></td>
				<td><div id="2">贰</div></td>
				<td><div id="3">叁</div></td>
				<td><div id="4">肆</div></td>
				<td><div id="5">伍</div></td>
			</tr>
		</table>
		<input id="button" type="button" value="抽奖" onclick="random()" />
	</center>

	<script src="js/jquery.min.js"></script>
	<script type="text/javascript">
		var i = 1;
		var j = 0;
		var d;

		var inter

		function random() {
			i = 1;
			j = 0;
			d = null;

			$("button").attr("disabled", true);
			$("div").removeClass("redDiv");

			inter = setInterval("shaLing()", 150);

			$.post("servlet/random.do", function(data) {
				//alert(data);
				d = data;

			});
		}

		function shaLing() {

			//alert("i:" + i + "\nj:" + j + "\nd:" + d);

			if (i == 1) {
				$("#8").removeClass("redDiv");
			} else {
				$("#" + (i - 1)).removeClass("redDiv");
			}
			$("#" + i).addClass("redDiv");
			if (i == 8) {
				i = 1;
				j++;
				clear();
			} else {
				i++;
				clear();
			}

		}

		function clear() {
			if (j >= 2 && i > d) {
				//alert("i:" + i + "\nj:" + j + "\nd:" + d);
				inter = window.clearInterval(inter);
				$("button").attr("disabled", false);
			}
		}
	</script>

</body>
</html>