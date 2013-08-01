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
			that.submitLoginForm();
			that.hideLoginForm();
		});
	},
	clearLoginData:function(){
		var inputDom = $(this.loginDom).find("input");
		$.each(inputDom,function(i,item){
			$(item).val("");
		});
	},
	hideLoginForm:function(){
		this.clearLoginData();
		this.loginDom.fadeOut("slow");
	},
	showLoginForm:function(){
		this.loginDom.fadeIn("slow");
	},
	hideNavigatorLoginOrRegisterBtn:function(){
		$(this.userNavigater).find(".login_btn,.register_btn").hide();
	},
	showNavigatorLoginOrRegisterBtn:function(){
		$(this.userNavigater).find(".login_btn,.register_btn").show();
	},
	submitLoginForm:function(){
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
					that.hideNavigatorLoginOrRegisterBtn();
					$("#content").find(".photo_wall").append("<div style='color:red;font-weight:bold;font-size:25px;text-align:center;'>hello!"+userName+"</div>");
				}else{
					alert(t.description);
				}
			},
		'json');
		
	}

}