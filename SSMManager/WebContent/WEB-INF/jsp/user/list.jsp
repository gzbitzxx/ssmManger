<%@ page language="java" import="java.util.*" pageEncoding="Utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'list.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	  <link href="resource/css/bootstrap.min.css" rel="stylesheet" />
	  <link rel="stylesheet" href="resource/plugins/grid_manager/GridManager.min.css">
    <script src="resource/js/jquery.min.js"></script>
    <script src="resource/js/bootstrap.min.js"></script>
    <script src="resource/js/common.js"></script>
    <script type="text/javascript" src="resource/plugins/grid_manager/GridManager.min.js"></script>
    <script type="text/javascript">
    $(function() {
		init();
	})
    function init() {
    	var table = document
    			.querySelector('table[grid-manager="demo-ajaxPageCode"]');
    	table
    			.GM({
    				ajax_url : 'http://www.lovejavascript.com/learnLinkManager/getLearnLinkList',
    				ajax_type : 'POST',
    				query : {
    					pluginId : 1,
    					'keyword' : '123'
    				},
    				supportAjaxPage : true,
    				supportCheckbox : false,
    				columnData : [
    						{
    							key : 'name',
    							text : '商品名称'
    						}]
    			});
    }
    </script>
</head>
<body style="margin:20px">
    <div class="row">
        <div class="col-md-10">
            <h3>用户列表</h3>
        </div>
        <div class="col-md-1">
            <div class="form-group">
                <button type="button" data-toggle="modal" data-target="#myModal" class="btn">
                    <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>添加
                </button>
            </div>
        </div>
    </div>
    <div class="row col-md-11">
        <div class="input-group">
            <input type="text" id="key" class="form-control"> <span class="input-group-btn">
                <button type="button" id="serach" class="btn btn-primary">
                    <span class="glyphicon glyphicon-search" aria-hidden="true"></span>搜索
                </button>
            </span>
        </div>
    </div>
    <div style="clear: both;"></div>
    <table grid-manager="demo-ajaxPageCode"></table>
</body>
</html>