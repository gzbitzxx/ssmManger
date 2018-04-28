<%@ page language="java" import="java.util.*" pageEncoding="Utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link href="resource/css/bootstrap.min.css" rel="stylesheet" />
<link rel="stylesheet"
	href="resource/plugins/grid_manager/GridManager.min.css">
<script src="resource/js/jquery.min.js"></script>
<script src="resource/js/bootstrap.min.js"></script>
<script src="resource/js/common.js"></script>
<script type="text/javascript"
	src="resource/plugins/grid_manager/GridManager.min.js"></script>
<script type="text/javascript">
	$(function() {
		init();
	})

	function init() {
		var table = document
				.querySelector('table[grid-manager="demo-ajaxPageCode"]');
		table.GM({
			ajax_url : 'drecord/list',
			ajax_type : 'POST',
			query : {
				pluginId : 1,
				'keyword' : '123'
			},
			supportAjaxPage : true,
			supportCheckbox : false,
			columnData : [ {
				key : 'vnumber',
				text : '车辆编号'
			}, {
				key : 'driverid',
				text : '驾驶员编号'
			}, {
				key : 'startmileage',
				text : '起始公里数'
			}, {
				key : 'endmileage',
				text : '结束公里数'
			}, {
				key : 'origin',
				text : '出发地'
			}, {
				key : 'destination',
				text : '目的地'
			}, {
				key : 'starttime',
				text : '出发时间'
			}, {
				key : 'endtime',
				text : '结束时间'
			},{
			    key: 'action',
			    remind: 'the action',
			    width: '100px',
			    text: '操作',
			    template: function(action, rowObject){
				    return '<a style="color:#337ab7;" href="javascript:;" onclick="deleteInfo(\''+rowObject.id+'\')">编辑</a>';
			    }
	        }]
	        
		});
	}
</script>
</head>
<body style="margin: 20px">
	<div class="row">
		<div class="col-md-10">
			<h3>行车记录列表</h3>
		</div>
		<div class="col-md-1">
			<div class="form-group">
				<button type="button" data-toggle="modal" data-target="#myModal"
					class="btn">
					<span class="glyphicon glyphicon-plus" aria-hidden="true"></span>添加
				</button>
			</div>
		</div>
	</div>
	<div class="row col-md-11">
		<div class="input-group">
			<input type="text" id="key" class="form-control"> <span
				class="input-group-btn">
				<button type="button" id="serach" class="btn btn-primary">
					<span class="glyphicon glyphicon-search" aria-hidden="true"></span>搜索
				</button>
			</span>
		</div>
	</div>
	<div style="clear: both;"></div>
	<table grid-manager="demo-ajaxPageCode"></table>
	<!-- 添加、修改框 -->
	<div class="modal fade" tabindex="-1" role="dialog" id="myModal">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title">添加行车记录</h4>
				</div>
				<form id="data">
					<div class="modal-body">
						<div class="row">
							<div class="col-lg-12">
								<div class="form-group" lang="vnumber">
									<label for="vnumber">车辆编号：</label> <input type="text"
										class="form-control" name="vnumber" id="vnumber"
										placeholder="车辆编号">
								</div>
							</div>
							<div class="col-lg-12">
								<div class="form-group" lang="driverid">
									<label for="driverid">驾驶员编号：</label> <input type="text"
										class="form-control" name="driverid" id="driverid"
										placeholder="驾驶员编号">
								</div>
							</div>
							<div class="col-lg-12">
								<div class="form-group" lang="startmileage">
									<label for=startmileage>起始公里数：</label> <input type="text"
										class="form-control" name="startmileage" id="startmileage"
										placeholder="起始公里数">
								</div>
							</div>
							<div class="col-lg-12">
								<div class="form-group" lang="endmileage">
									<label for="endmileage">结束公里数：</label> <input type="text"
										class="form-control" name="endmileage" id="endmileage"
										placeholder="结束公里数">
								</div>
							</div>
							<div class="col-lg-12">
								<div class="form-group" lang="color">
									<label for="color">车色：</label> <input type="text"
										class="form-control" name="color" id="color"
										placeholder="车色">
								</div>
							</div>
							<div class="col-lg-12">
								<div class="form-group" lang="engoriginine">
									<label for="origin">出发地：</label> <input type="text"
										class="form-control" name="origin" id="origin"
										placeholder="出发地">
								</div>
							</div>
							<div class="col-lg-12">
								<div class="form-group" lang="destination">
									<label for="destination">目的地：</label> <input
										type="text" class="form-control" name="destination"
										id="destination" placeholder="目的地">
								</div>
							</div>
							<div class="col-lg-12">
								<div class="form-group" lang="starttime">
									<label for="starttime">出发时间：</label> <input
										type="text" class="form-control" name="starttime" id="starttime"
										placeholder="出发时间">
								</div>
						  <div class="col-lg-12">
							<div class="form-group" lang="endtime">
								<label for="endtime">结束时间：</label> <input
									type="text" class="form-control" name="endtime" id="endtime"
									placeholder="结束时间">
								</div>  
			               <div class="modal-footer">
								<button type="button" class="btn btn-default"
									data-dismiss="modal">关闭</button>
								<button type="button" class="btn btn-primary" id="add">保存</button>
							</div>
				</form>
			</div>
			<!-- /.modal-content -->
		</div>
	</div>
	<script type="text/javascript">
		$("#add").click(function() {
			$.ajax({
				url : "drecord/regist",
				type : "POST",
				data : $("#data").serialize(),
				success : function(data) {
					console.log(data);
				}
			});
		});
		
		function deleteInfo(ob){
			layer.confirm("确认要删除吗，删除后不能恢复", { title: "删除确认" }, function (index) {  
                layer.close(index);  
                $.post("/admin/customer/DeleteCustomer", { gid: $(e.currentTarget).data("gid") }, function (data) {  
                    layer.alert(data, {  
                        title: "删除操作",  
                        btn: ['确定']  
                    },  
                        function (index, item) {  
                            //layer.close(index);  
                            location.reload();  
                        });  
                });  
            });   
			$.ajax({
				url:"drecord/detele",
				type:"POST",
				data:{'id':ob},
				success:function(data){
					console.log(data);
					if(data=='ok'){
						
					}
				}
			});
		}
		
	</script>
</body>
</html>