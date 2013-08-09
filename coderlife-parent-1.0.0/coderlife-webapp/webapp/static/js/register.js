nameSpace.ns("BT.register");
BT.register = {
	init:function(){
		this.initEvent();
		this.parent = $("#register_area");
	},
	initEvent:function(){
		var that = this,
			loginDom = $("#login_info"),
			registerDom = $("#register"),
			registerAreaDom = $("#register_area"),
			identifyCodeImgDom = registerAreaDom.find("img[name='identify_code_img']"),
			reLoadImgBtn = registerAreaDom.find(".refresh_btn"),
			loginLink = registerAreaDom.find(".desc_area_login_link a");
		
		//验证码图片单击事件
		identifyCodeImgDom.bind('click',function(){
			that.reLoadImageCode(this);
		});
		
		//刷新按钮单击事件
		reLoadImgBtn.bind("click",function(){
			that.reLoadImageCode($(".identify_code_img img"));
		});
		
		loginLink.bind('click',function(){
			registerDom.hide();
			loginDom.fadeIn("slow");
		});
		
	},
	reLoadImageCode:function(obj){
		var timeStampStr = (new Date()).getTime();
		$(obj).attr("src",BT.common.getSystemURL("ImageCode")+"?t=_"+timeStampStr);
	}
		
};