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
			ajax_url : 'driver/list',
			ajax_type : 'POST',
			query : {
				pluginId : 1,
				'keyword' : '123'
			},
			supportAjaxPage : true,
			supportCheckbox : false,
			columnData : [ {
				key : 'number',
				text : '驾驶证编号'
			}, {
				key : 'name',
				text : '用户名'
			}, {
				key : 'phonenumber',
				text : '联系电话'
			}, {
				key : 'denger',
				text : '性别'
			}, {
				key : 'idcard',
				text : '身份证号'
			}, {
				key : 'address',
				text : '家庭地址'
			},{
			    key: 'action',
			    remind: 'the action',
			    width: '100px',
			    text: '操作',
			    template: function(action, rowObject){
				    return "\<a style='color:#337ab7;' href='javascript:;' onclick='deleteInfo("+"'"+rowObject.id+"'"+")' \>删除\</a\>";
			    }
	        }]
	        
		});
	}
</script>
</head>
<body style="margin: 20px">
	<div class="row">
		<div class="col-md-10">
			<h3>驾驶员列表</h3>
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
					<h4 class="modal-title">添加驾驶员</h4>
				</div>
				<form id="data">
					<div class="modal-body">
						<div class="row">
							<div class="col-lg-12">
								<div class="form-group" lang="number">
									<label for="number">驾驶员编号：</label> <input type="text"
										class="form-control" name="number" id="number"
										placeholder="驾驶员编号">
								</div>
							</div>
							<div class="col-lg-12">
								<div class="form-group" lang="name">
									<label for="name">姓名：</label> <input type="text"
										class="form-control" name="name" id="name"
										placeholder="姓名">
								</div>
							</div>
							<div class="col-lg-12">
								<div class="form-group" lang="denger">
									<label for="denger">性别：</label> <input type="text"
										class="form-control" name="denger" id="denger"
										placeholder="性别">
								</div>
							</div>
							<div class="col-lg-12">
								<div class="form-group" lang="age">
									<label for="age">年龄：</label> <input type="text"
										class="form-control" name="age" id="age"
										placeholder="年龄">
								</div>
							</div>
							<div class="col-lg-12">
								<div class="form-group" lang="idcard">
									<label for="idcard">身份证名：</label> <input type="text"
										class="form-control" name="idcard" id="idcard"
										placeholder="身份证名">
								</div>
							</div>
							<div class="col-lg-12">
								<div class="form-group" lang="address">
									<label for="address">地址：</label> <input type="text"
										class="form-control" name="address" id="address"
										placeholder="地址">
								</div>
							</div>
							<div class="col-lg-12">
								<div class="form-group" lang="phonenumber">
									<label for="phonenumber">电话号码：</label> <input type="text"
										class="form-control" name="phonenumber" id="phonenumber"
										placeholder="电话号码">
								</div>
							</div>
							<div class="col-lg-12">
								<div class="form-group" lang="drivercardid">
									<label for="drivercardid">驾驶证编号：</label> <input
										type="text" class="form-control" name="drivercardid"
										id="drivercardid" placeholder="驾驶证编号">
								</div>
							</div>
							<div class="col-lg-12">
								<div class="form-group" lang="driving">
									<label for="driving">驾龄：</label> <input
										type="text" class="form-control" name="driving" id=""driving""
										placeholder="驾龄">
								</div>
							</div>
							<div class="col-lg-12">
								<div class="form-group" lang="starttime">
									<label for="starttime">驾驶证有效开始时间：</label> <input
										type="text" class="form-control" name="starttime" id=""starttime""
										placeholder="驾驶证有效开始时间">
								</div>	
							</div>
							<div class="col-lg-12">
								<div class="form-group" lang="endtime">
									<label for="endtime">驾驶证失效时间：</label> <input
										type="text" class="form-control" name="endtime" id=""endtime""
										placeholder="驾驶证失效时间">
								</div>	
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
				url : "driver/regist",
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
				url:"driver/detele",
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