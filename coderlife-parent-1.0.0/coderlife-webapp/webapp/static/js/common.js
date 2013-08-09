nameSpace.ns("BT.common");
BT.common = {
	getSystemURL:function(url){
		if(url != ""){
			return BT.page.systemURL+"/"+url;
		}else{
			return BT.page.systemURL;
		}
	},
	getStaticURL:function(url){
		if(url != ""){
			return BT.page.staticURL+"/"+url;
		}else{
			return BT.page.staticURL;
		}
	}
};