<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta charset="utf-8" />
<meta http-equiv="x-ua-compatible" content="IE=7,8,9" />
<meta
	content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0"
	name="viewport">
<meta name="format-detection" content="telephone=no" />
<title>无标题文档</title>
<link href="style/index.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="style/poposlides.css">
<script language="javascript" src="js/jquery-1.8.3.min.js"></script>
<script language="javascript" src="js/style.js"></script>


</head>

<body class="in_body">
	<!--logo-->
	<div class="head">
		<div class="bai_box">
			<div class="logo"></div>
			<div class="menu">
				<ul>
					<a href="servlet/showMessage.do">
						<li class="ative"></li>
					</a>
					<a href="#">
						<li></li>
					</a>
					<a href="guarantee.html">
						<li></li>
					</a>

					<a href="servlet/showHot.do">
						<li class="l_distance"></li>
					</a>
					<a href="servlet/showNews.do">
						<li></li>
					</a>
					<a href="about.html">
						<li></li>
					</a>


				</ul>
				<div class="menu_bj">
					<a class="colorange" href="servlet/showMessage.do">首页</a> <a
						href="#">新手攻略</a> <a href="guarantee.html">风控保障</a> <a
						href="servlet/showHot.do" class="l_distance">热门活动</a> <a
						href="servlet/showNews.do">企业公告</a> <a href="about.html">关于我们</a>
				</div>
			</div>
		</div>
		<div class="app">
			<span class="app_color">狐小狸理财</span> <span>APP客户端</span>
		</div>
	</div>
	<!--banner-->
	<div class="banner">
		<div class="slides-box">
			<ul class="slides">
				<li
					style="background: url(images/banner_bj.jpg) no-repeat center top;">
					<span><img src="images/pic_font.png"></span>
				</li>
				<li
					style="background: url(images/banner1.jpg) no-repeat center top;">
					<span><img src="images/pic_font1.png"></span>
				</li>
				<li
					style="background: url(images/banner2.jpg) no-repeat center top;">
					<span><img src="images/pic_font2.png"></span>
				</li>
			</ul>
		</div>

	</div>
	<!--news-->

	<div class="news">
		<div class="news_cont">
			<div class="news_left">
				<img src="images/about_pic.jpg">
			</div>
			<div class="news_right">
				<div class="news_title">
					<h4>最新公告</h4>
					<a href="#">更多<< </a>
				</div>
				<div class="news_list">
					<ul>
						<c:forEach items="${message_list }" var="msg">
							<li><a href="servlet/findMsg.do?id=${msg.m_id }"><i>·</i>${msg.m_title }</a><span>${msg.m_date }</span></li>
						</c:forEach>
					</ul>

				</div>
			</div>
		</div>
	</div>


	<!--copy-->

	<div class="foot">
		<div class="copy">
			<p>Copyright © 2016 陕西新时基网络信息服务有限责任公司, ALL Right Reseved
				备案号：陕ICP备16005274号-1</p>
		</div>
	</div>
	<script src="js/poposlides.js"></script>
	<script>
		$(".slides").poposlides();
	</script>
</body>

</html>