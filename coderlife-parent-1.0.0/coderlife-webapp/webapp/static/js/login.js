nameSpace.ns("BT.login");
BT.login = {
	init:function(){
		this.initEvent();
		this.clearLoginData();
		this.loginDom = $("#login_info");
		this.userNavigater = $("#header").find(".navigator_right");
		this.listNavigator = $("#header").find(".navigator_icon");
	},
	initEvent:function(){
		var that = this;
		var loginDom = $("#login_info");
		var userNavigater = $("#header").find(".navigator_right");
		var listNavigator = $("#header").find(".navigator_icon");
		
		//导航栏登录按钮
		userNavigater.find(".login_btn").bind('click',function(){
			that.showLoginForm();
		});
		
		//登录页面关闭按钮
		loginDom.find(".close_label").bind('click',function(){
			that.hideLoginForm();
		});
		
		//登录页面登录按钮
		loginDom.find(".login_info_btn").bind('click',function(){
			that.login();
			that.hideLoginForm();
		});
		
		//当前用户头像
		userNavigater.find(".nav_user").bind('mouseover',function(){
			if(!$(this).hasClass("hidden")){
				$(this).addClass("photo_hover");
				$(this).find(".nav_user_set").removeClass("hidden");
			}
		}).bind('mouseout',function(){
			$(this).removeClass("photo_hover");
			$(this).find(".nav_user_set").addClass("hidden");
		});
		
		//当前用户头像
		userNavigater.find(".logout").bind('click',function(){
			that.logout();
		});
	},
	
	/**登录*/
	login:function(){
		var that = this;
			loginDom = $(this.loginDom),
			userName = loginDom.find("input[name='username']").val(),
			password = loginDom.find("input[name='password']").val(),
			url = BT.common.getSystemURL("login"),
			params = {userName:userName,password:password};
		$.post(
			url,
			params,
			function(t){
				if(t.success){
					that.hideLoginForm();
					that.afterLogin();
					$("#content").find(".photo_wall").html("<div style='color:red;font-weight:bold;font-size:25px;text-align:center;'>hello!"+userName+"</div>");
				}else{
					alert(t.description);
				}
			},
		'json');
	},
	
	/**注销*/
	logout:function(){
		var that = this;
			url = BT.common.getSystemURL("logout");
		$.post(
			url,
			function(t){
				if(t.success){
					that.beforeLogin();
				}else{
					alert(t.description);
				}
			},
		'json');
	},
	
	/**清除登录信息*/
	clearLoginData:function(){
		var inputDom = $(this.loginDom).find("input");
		$.each(inputDom,function(i,item){
			$(item).val("");
		});
	},
	
	/**隐藏登录页面*/
	hideLoginForm:function(){
		this.clearLoginData();
		this.loginDom.fadeOut("slow");
	},
	
	/**显示登录页面*/
	showLoginForm:function(){
		this.loginDom.fadeIn("slow");
	},
	
	/**登录成功之后的操作*/
	afterLogin:function(){
		//location.href = BT.common.getSystemURL("");
		$(this.userNavigater).find(".login_btn,.register_btn").hide();
		$(this.userNavigater).find(".photo").removeClass("hidden");
		$(this.userNavigater).find(".nav_user").removeClass("photo_hover").removeClass("hidden");
	},
	
	/**注销成功之后的操作*/
	beforeLogin:function(){
		$(this.userNavigater).find(".photo").addClass("hidden");
		$(this.userNavigater).find(".nav_user_set").addClass("hidden");
		$(this.userNavigater).find(".nav_user").removeClass("photo_hover").addClass("hidden");
		$(this.userNavigater).find(".login_btn,.register_btn").show();
	}

}