<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
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
</head>

<body style="background: #f7f6f6;">
	<!--logo-->
	<div class="in_head">
		<div class="bai_box">
			<div class="logo"></div>
			<div class="menu">
				<ul>
					<a href="servlet/showMessage.do">
						<li></li>
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
						<li class="ative"></li>
					</a>
				</ul>
				<div class="menu_bj">
					<a href="servlet/showMessage.do">首页</a> <a href="#">新手攻略</a> <a
						href="guarantee.html">风控保障</a> <a href="servlet/showHot.do"
						class="l_distance">热门活动</a> <a href="servlet/showNews.do">企业公告</a>
					<a href="about.html" class="colorange">关于我们</a>
				</div>
			</div>
		</div>
		<div class="app">
			<span class="app_color">狐小狸理财</span> <span>APP客户端</span>
		</div>
	</div>

	<!--banner-->
	<div class="guara_banner gd">
		<div class="guara_tiao">
			<img src="images/nav_shadow.png">
		</div>
		<div class="guara_ad">
			<div class="guara_img">
				<img src="images/notice_banner.jpg">
			</div>
		</div>
	</div>

	<!--hot_cont-->
	<div class="notice guara_cont">
		<div class="porsition">
			<a href="#">企业公告</a> > <a href="#">公司新闻</a>
		</div>
		<div class="notice_cont">
			<div class="notice_cont_title">
				<h4>${message.m_title }</h4>
				<div class="timea">
					<span>${message.m_date }</span><i>狐小狸理财</i>
				</div>
			</div>
			<div class="notice_show">
				<p>${message.m_context }</p>
				<!-- 
					<div class="page">
						<p>上一篇：<a href="">【平台公告】标题标题标题标题1</a></p>
						<p>下一篇：<a href="">【平台公告】标题标题标题标题2</a></p>
					</div> -->
				<div class="warning">
					在此我们感谢所有用户的理解、信任及支持。我们将用最全面的服务，最优质的资产，最严格的风控，用精益求精的态度来回报广大投资人。</div>
			</div>
		</div>
	</div>

	<!--copy-->
	<div class="in_foot">
		<div class="copy">
			<p>Copyright © 2016 陕西新时基网络信息服务有限责任公司, ALL Right Reseved
				备案号：陕ICP备16005274号-1</p>
		</div>
	</div>
</body>
</html>
