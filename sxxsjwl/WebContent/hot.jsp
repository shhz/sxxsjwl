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
</head>

<body>
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
						<li class="l_distance active"></li>
					</a>
					<a href="servlet/showNews.do">
						<li></li>
					</a>
					<a href="about.html">
						<li></li>
					</a>
				</ul>
				<div class="menu_bj">
					<a href="servlet/showMessage.do" type="post">首页</a> 
					<a href="#">新手攻略</a>
					<a href="guarantee.html">风控保障</a> 
					<a href="servlet/showHot.do" class="l_distance colorange">热门活动</a> 
					<a href="servlet/showNews.do">企业公告</a>
					<a href="about.html">关于我们</a>
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
				<img src="images/hot_banner.jpg">
			</div>
		</div>
	</div>

	<!--hot_cont-->
	<div class="hot guara_cont">
		<div class="hot_title">
			<h4>精彩活动</h4>
			<span>会花钱更要会赚钱，狐小狸理财让您赚钱更安心</span>
		</div>
		<div class="hot_list">
			<div class="hot_pic">

				<c:forEach items="${hotact_list }" var="hot">
					<ul>
						<li><a href="${hot.h_url }"><img src="${hot.h_photo }"></a></li>
						<li><a href="${hot.h_url }"><span>${hot.h_title }</span></a></li>
						<li><p>
								<i class="area_icon clock_icon"></i>时间：${hot.h_start_date } 至
								${hot.h_over_date }
							</p></li>
					</ul>
				</c:forEach>
			</div>
			<!-- <div class="pve">
				<a href="#">上一页</a> <a href="#">1</a> <a href="#">2</a> <a href="#">3</a>
				<a href="#">4</a> <a href="#">下一页</a>
			</div> -->

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