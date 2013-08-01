<link rel="stylesheet" type="text/css" href="${RESOUCE_STATIC_URL}/css/src/reset.css"/>
<link rel="stylesheet" type="text/css" href="${RESOUCE_STATIC_URL}/css/basic.css"/>
<script type="text/javascript" src="${RESOUCE_STATIC_URL}/js/src/jquery-1.8.0.min.js"></script>
<script type="text/javascript" src="${RESOUCE_STATIC_URL}/js/src/jquery.json-2.4.min.js"></script>
<script type="text/javascript" src="${RESOUCE_STATIC_URL}/js/src/nameSpace-min.js"></script>
<script type="text/javascript" src="${RESOUCE_STATIC_URL}/js/home.js"></script>
<script type="text/javascript" src="${RESOUCE_STATIC_URL}/js/common.js"></script>
<script type="text/javascript" src="${RESOUCE_STATIC_URL}/js/login.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		BT.home.init();
	});
	BT.page = {
		systemURL:"${RESOUCE_SYSTEM_URL}",
		staticURL:"${RESOUCE_STATIC_URL}",
		timeStamp:new Date()
	};
</script>