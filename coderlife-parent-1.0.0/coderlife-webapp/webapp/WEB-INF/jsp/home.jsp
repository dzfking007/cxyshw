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
						<div class="register_btn"><a href="${RESOUCE_SYSTEM_URL}/register">注册</a></div>
						<div class="nav_user hidden">
							<div class="photo hidden">
								<img src="${RESOUCE_STATIC_URL}/images/photo.png"/>
							</div>
							<div class="nav_user_set hidden">
								<div class="group seprate">
									<div class="setting">设置</div>
								</div>
								<div class="group">
									<div class="logout">注销</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		    <div id="content">
				<div class="photo_wall"></div>
				<%@ include file="/inc/page_common_login.jsp" %>
			</div>
		    <div id="footer" style="display: none;">foot</div>
	   	</div>
	</body>
</html>