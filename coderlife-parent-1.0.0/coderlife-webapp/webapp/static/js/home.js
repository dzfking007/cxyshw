nameSpace.ns("BT.home");
BT.home = {
	init:function(){
		BT.login.init();
		BT.register.init();
	}
};



/*dom树渲染完，加载静态资源**/
$(document).ready(function(){
	BT.home.init();
});
