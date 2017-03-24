<%@ page language="java" contentType="text/html; charset=UTF-8"   pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/pages/include.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>success</title>
<script src="scripts/knockout.bootstraptable.js"></script>
<script src="scripts/Department.js" ></script>
</head>
<body>
		<div class="logout" style="float:right;padding:0 20px;"><a href="logout">退出</a></div>

		 <div id="toolbar" class="btn-group">
            <button id="btn_add" type="button" class="btn btn-default">
                <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>新增
            </button>
            <button id="btn_edit" type="button" class="btn btn-default">
                <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>修改
            </button>
            <button id="btn_delete" type="button" class="btn btn-default">
                <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>删除
            </button>
        </div>
	    <table id="tb_dept" data-bind="myBootstrapTable:$root">
            <thead>
                <tr>
                    <th data-checkbox="true"></th>
                    <th data-field="name">部门名称</th>
                    <th data-field="level">部门级别</th>
                    <th data-field="des">描述</th>
                    <th data-field="createTime">创建时间</th>
                </tr>
            </thead>
        </table>
      
		<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                        <h4 class="modal-title" id="myModalLabel">操作</h4>
                    </div>
                    <div class="modal-body">

                        <div class="form-group">
                            <label for="txt_departmentname">部门名称</label>
                            <input type="text" name="txt_departmentname" data-bind="value:name" class="form-control" id="txt_departmentname" placeholder="部门名称">
                        </div>
                        <div class="form-group">
                            <label for="txt_departmentlevel">部门级别</label>
                            <input type="text" name="txt_departmentlevel" data-bind="value:level" class="form-control" id="txt_departmentlevel" placeholder="部门级别">
                        </div>
                        <div class="form-group">
                            <label for="txt_des">描述</label>
                            <input type="text" name="txt_des" data-bind="value:des" class="form-control" id="txt_des" placeholder="描述">
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span>关闭</button>
                        <button type="button" id="btn_submit" class="btn btn-primary" data-dismiss="modal"><span class="glyphicon glyphicon-floppy-disk" aria-hidden="true"></span>保存</button>
                    </div>
                </div>
            </div>
        </div>        
        <script type="text/javascript">
      //初始化
        $(function () {
            //1、初始化表格
            tableInit.Init();
            //2、注册增删改事件
            operate.operateInit();
        });

        //初始化表格
        var tableInit = {
            Init: function () {
                //绑定table的viewmodel
                this.myViewModel = new ko.bootstrapTableViewModel({
                    url: 'Department/GetDepartment',         //请求后台的URL（*）
                    method: 'get',                      //请求方式（*）
                    toolbar: '#toolbar',                //工具按钮用哪个容器
                    queryParams: function (param) {
                        return { limit: param.limit, offset: param.offset };
                    },//传递参数（*）
                    pagination: true,                   //是否显示分页（*）
                    sidePagination: "server",           //分页方式：client客户端分页，server服务端分页（*）
                    pageNumber: 1,                      //初始化加载第一页，默认第一页
                    pageSize: 10,                       //每页的记录行数（*）
                    pageList: [10, 25, 50, 100],        //可供选择的每页的行数（*）
                    onLoadSuccess: function(){  //加载成功时执行  
                        console.info("加载成功");  
                    },
                });
               
                ko.applyBindings(this.myViewModel, document.getElementById("tb_dept"));
            }
        };       
        </script>
</body>
</html>