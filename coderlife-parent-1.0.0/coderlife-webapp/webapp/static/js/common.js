nameSpace.ns("BT.common");
BT.common = {
	getSystemURL:function(url){
		return BT.page.systemURL+"/"+url;
	},
	getStaticURL:function(url){
		return BT.page.systemURL+"/"+url;
	}
};