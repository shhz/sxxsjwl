<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
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
<script src="js/jquery-1.8.3.min.js" language="javascript"
	type="text/javascript"></script>
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
						<li class="l_distance"></li>
					</a>
					<a href="servlet/showNews.do">
						<li class="ative"></li>
					</a>
					<a href="about.html">
						<li></li>
					</a>
				</ul>
				<div class="menu_bj">
					<a href="servlet/showMessage.do">首页</a> <a href="#">新手攻略</a> <a
						href="guarantee.html">风控保障</a> <a href="servlet/showHot.do"
						class="l_distance">热门活动</a> <a href="servlet/showNews.do"
						class="colorange">企业公告</a> <a href="about.html">关于我们</a>
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

	<!--about_cont-->
	<div class="about notice_ab">
		<div class="about_nav">
			<ul>
				<li class="select">媒体报道</li>
				<li>企业公告</li>
			</ul>
		</div>
	</div>
	<!--hot_cont-->
	<div class="notice guara_cont guara_cont_ab">
		<div class="w show">
			<div class="notice_dynamic">
				<div class="not_title">
					<h4>媒体报道</h4>
				</div>
				<div class="notice_list">
					<c:forEach items="${news_list }" var="news">
						<dl>
							<dt>
								<a href="#"><img src="${news.n_photo_1 }"></a>
							</dt>
							<dd>
								<p>
									<a href="#">${news.n_title }</a><em>${news.n_date }</em>
								</p>
							</dd>
							<dd>
								<span>${news.n_cont } </span><a href="#" class="font_a">[全文]</a>
							</dd>
						</dl>
					</c:forEach>

				</div>

			</div>
			<div class="pve">
				<a href="#">上一页</a> <a href="#">1</a> <a href="#">2</a> <a href="#">3</a>
				<a href="#">4</a> <a href="#">下一页</a>
			</div>
		</div>
		<div class="w">
			<div class="notice_video">
				<div class="not_title">
					<h4>企业公告</h4>
				</div>
				<div class="notice_about_nr">
					<ul>
						<c:forEach items="${message_list }" var="msg">
							<li><a href="#">${msg.m_context }</a><span>${msg.m_date }</span></li>
						</c:forEach>

					</ul>

				</div>
				<!--<div class="video_cont">
                    <video autoplay="autoplay" controls="controls" width="851" height="418"  >
                    <source src="">
                        <object classid="clsid:d27cdb6e-ae6d-11cf-96b8-444553540000" codebase="http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=9,0,0,0" width="850" height="480" align="middle">
                         <param name="allowScriptAccess" value="sameDomain">
                         <param name="allowFullScreen" value="false">
                         <param name="movie" value="https://img.fengjr.com/upload/mp4/4542644-102-009-1849.swf">
                         <param name="loop" value="false">
                         <param name="quality" value="high">
                         <param name="wmode" value="transparent">
                         <embed src="" wmode="transparent" loop="false" quality="high" width="442" height="480" name="post5" align="middle" allowscriptaccess="sameDomain" allowfullscreen="false" type="application/x-shockwave-flash" pluginspage="http://www.macromedia.com/go/getflashplayer">

                    </object>

                    </video>
                </div>-->
			</div>
			<div class="pve">
				<a href="#">上一页</a> <a href="#">1</a> <a href="#">2</a> <a href="#">3</a>
				<a href="#">4</a> <a href="#">下一页</a>
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
	<script language="javascript">
		$(".about_nav ul li").click(function() {
			var i = $(this).index();
			$(this).addClass('select').siblings().removeClass('select');
			$(".guara_cont .w").eq(i).show().siblings().hide();
		})
	</script>
</body>

</html>