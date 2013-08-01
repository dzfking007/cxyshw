<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/resource.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<%@ include file="/inc/page_common_head.jsp"%>
		<title>首页</title>
	</head>
	<body>
	    <div id="main">
		    <div id="header">
				<div class="wrap">
					<div class="navigator_icon">
						<s class="list_icon"></s>
						<s class="arrow"></s>
					</div>
					<div class="navigator_sub">猿猿们&&媛媛们的那些事~</div>
					<div class="navigator_right">
						<div class="login_btn">登录</div>
						<div class="register_btn">注册</div>
						<div class="nav_user">
							<div class="photo">
								<img src="${RESOUCE_STATIC_URL}/images/photo.jpg"/>
							</div>
						</div>
					</div>
				</div>
			</div>
			<%@ include file="/inc/page_common_login.jsp" %>
		    <div id="content">
				<div class="photo_wall"></div>
			</div>
		    <div id="footer" style="display: none;">foot</div>
	   	</div>
	</body>
</html>