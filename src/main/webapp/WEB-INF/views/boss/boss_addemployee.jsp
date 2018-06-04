<!DOCTYPE html>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>连锁超市物流配送管理系统</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/bootstrap.css">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/font-awesome/css/font-awesome.min.css">
    <!-- Ionicons -->
    <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/dist/css/adminlte.min.css">
    <!-- bootstrap wysihtml5 - text editor -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">
    <!-- Google Font: Source Sans Pro -->
    <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700" rel="stylesheet">
</head>
<body class="hold-transition sidebar-mini" ng-controller="ctrl">



<!---Modal-->
<div class="modal fade" id="empAddModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h4 class="modal-title" id="myModalLabel">更新信息</h4>
            </div>

            <div class="modal-body">
                <form class="form-horizontal" action="${pageContext.request.contextPath}/employee/addemployee" method="post" enctype="multipart/form-data">
                    <div class="form-group">
                        <label class="col-sm-2 control-label">
                            姓名
                        </label>
                        <div class="col-sm-10">
                            <input type=text name="name" class="form-control"
                                   id="empName_add_input" placeholder="empName"> <span
                                class="help-block"> </span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">性别</label>
                        <div class="col-sm-10">
                            <label class="radio-inline"> <input type="radio"
                                                                name="gender" id="gender1_add_input" value="1" checked="true">
                                男
                            </label> <label class="radio-inline"> <input type="radio"
                                                                         name="gender" id="gender2_add_input" value="2"> 女
                        </label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-4 control-label">
                            电话
                        </label>
                        <div class="col-sm-8">
                            <input type="text" name="phone" class="form-control" id="phone_add_input"
                                   placeholder="电话">
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-4 control-label">
                            部门
                        </label>
                        <div class="col-sm-8">
                            <select class="form-control" name="dId">

                            </select>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-2 control-label">
                            照片
                        </label>
                        <div class="col-sm-10">
                            <input name="img" id="img" type="file"/>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                        <button type="submit" class="btn btn-primary" id="emp_save_btn">保存</button>
                    </div>
                </form>
            </div>

        </div>
    </div>
</div>


<div class="wrapper">

    <!-- Navbar -->
    <nav class="main-header navbar navbar-expand bg-white navbar-light border-bottom">
        <!-- Left navbar links -->
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link" data-widget="pushmenu" href="#"><i class="fa fa-bars"></i></a>
            </li>
            <li class="nav-item d-none d-sm-inline-block">
                <a href="#" class="nav-link">Home</a>
            </li>
            <li class="nav-item d-none d-sm-inline-block">
                <a href="#" class="nav-link">Contact</a>
            </li>
        </ul>
    </nav>
    <!-- /.navbar -->

    <!-- Main Sidebar Container -->
    <aside class="main-sidebar sidebar-dark-primary elevation-4">
        <!-- Brand Logo -->
        <a href="#" class="brand-link">
            <img src="${pageContext.request.contextPath}/dist/img/Logo.png" alt="AdminLTE Logo" class="brand-image img-circle elevation-3"
                 style="opacity: .8">
            <span class="brand-text font-weight-light">超市物流管理</span>
        </a>

        <!-- Sidebar -->
        <div class="sidebar">
            <!-- Sidebar user panel (optional) -->
            <div class="user-panel mt-3 pb-3 mb-3 d-flex">
                <div class="image">
                    <img src="data:image/png;base64,${img}" class="img-circle elevation-2" alt="User Image">
                </div>
                <div class="info">
                    <a href="#" class="d-block">${employee.name}</a>
                </div>
            </div>

            <!-- Sidebar Menu -->
            <nav class="mt-2">
                <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu"
                    data-accordion="false">
                    <li class="nav-item has-treeview">
                        <a href="#" class="nav-link">
                            <i class="fa fa-address-book"></i>
                            <p>
                                个人信息
                                <i class="right fa fa-angle-left"></i>
                            </p>
                        </a>
                        <ul class="nav nav-treeview">
                            <li class="nav-item">
                                <a class="nav-link">
                                    <a href="${pageContext.request.contextPath}/employee/costardetailinfo1?id=${employee.id}" class="nav-link">
                                        <i class="fa fa-circle-o nav-icon"></i>
                                        <p>查看个人信息</p>
                                    </a>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a href="#" class="nav-link">
                                    <i class="fa fa-circle-o nav-icon"></i>
                                    <p>修改个人信息</p>
                                </a>
                            </li>
                        </ul>
                    </li>


                    <li class="nav-item has-treeview">
                        <a href="#" class="nav-link">
                            <i class="fa fa-tasks"></i>
                            <p>
                                员工信息
                                <i class="right fa fa-angle-left"></i>
                            </p>
                        </a>
                        <ul class="nav nav-treeview">
                            <li class="nav-item">
                                <a href="${pageContext.request.contextPath}/employee/getallemployees" class="nav-link">
                                    <i class="fa fa-circle-o nav-icon"></i>
                                    <p>增加员工</p>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a href="${pageContext.request.contextPath}/employee/getallemployees" class="nav-link">
                                    <i class="fa fa-circle-o nav-icon"></i>
                                    <p>开除员工</p>
                                </a>
                            </li>
                        </ul>
                    </li>
                </ul>
            </nav>
            <!-- /.sidebar-menu -->
        </div>
        <!-- /.sidebar -->
    </aside>


    <!-- Content Wrapper. Contains page content -->
    <div class="content-wrapper">
        <section class="content">


            <!-- 搭建显示页面 -->
            <div class="container">
                <!-- 标题行 -->
                <div class="row">
                    <div class="col-md-12">
                        <h1>员工操作</h1>
                    </div>
                </div>
                <!-- 按钮 -->
                <div class="row">
                    <div class="col-md-4 col-md-offset-8">
                        <button class="btn btn-primary" id="emp_add_modal_btn">新增</button>
                    </div>
                </div>
                <!-- 显示表格数据 -->
                <div class="row">
                    <div class="col-md-12">
                        <table class="table table-hover" id="emps_table">
                            <thead>
                            <tr>
                                <th>#</th>
                                <th>姓名</th>
                                <th>性别</th>
                                <th>电话</th>
                                <th>部门</th>
                                <th>操作</th>
                                <th></th>
                            </tr>
                            <thead>
                            <tbody>

                            </tbody>
                        </table>
                    </div>
                </div>
                <!-- 显示分页信息 -->
                <div class="row">
                    <!-- 分页文字信息 -->
                    <div class="col-md-6" id="page_info_area"></div>
                    <!-- 分页条信息 -->
                    <div class="col-md-6" id="page_nav_area"></div>
                </div>
            </div>

        </section>
    </div>


    <!-- /.content-wrapper -->
    <footer class="main-footer">
        <strong>Copyright &copy; 2014-2018 <a href="http://adminlte.io">dongwengao</a>.</strong>
        All rights reserved.
        <div class="float-right d-none d-sm-inline-block">
            <b>Version</b> 3.0.0-alpha
        </div>
    </footer>

    <!-- Control Sidebar -->
    <aside class="control-sidebar control-sidebar-dark">
        <!-- Control sidebar content goes here -->
    </aside>
    <!-- /.control-sidebar -->
</div>
<!-- ./wrapper -->

<!-- jQuery -->
<script src="${pageContext.request.contextPath}/plugins/jquery/jquery.min.js"></script>
<!-- jQuery UI 1.11.4 -->
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.min.js"></script>
<!-- Bootstrap 4 -->
<script src="${pageContext.request.contextPath}/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- Bootstrap WYSIHTML5 -->
<script src="${pageContext.request.contextPath}/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
<!-- AdminLTE App -->
<script src="${pageContext.request.contextPath}/dist/js/adminlte.js"></script>

<script>

    var totalRecord;
    $(function () {
        to_page(1);
    });

    function to_page(pn) {
        $.ajax({
            url: "${pageContext.request.contextPath}/employee/emps",
            data: "pn=" + pn,
            type: "get",
            success: function (result) {
                build_emps_table(result);
            }
        });
    }

    function build_emps_table(result) {
        //清空table表格
        $("#emps_table tbody").empty();
        var emps = result.extend.pageInfo.list;
        $.each(emps, function (index, item) {
            var empIdTd = $("<td></td>").append(item.id);
            var empNameTd = $("<td></td>").append(item.name);
            var genderTd = $("<td></td>").append(
                item.gender == '1' ? '男' : '女');
            var phoneTd=$("<td></td>").append(item.phone);
            var deptNameTd = $("<td></td>")
                .append(item.dePartment.name);
            var delBtn = $("<button></button>").addClass(
                "btn btn-danger btn-sm delete_btn").append(
                $("<span></span>").addClass(
                    "glyphicon glyphicon-remove")).append("删除");
            var btnTd=$("<td></td>").append(delBtn);
            $("<tr></tr>").append(empIdTd).append(empNameTd).append(
                genderTd).append(phoneTd).append(deptNameTd).append(
                btnTd).appendTo("#emps_table tbody");
        });
    }

    $('#emp_add_modal_btn').click(function () {
        $.ajax({
            url:"${pageContext.request.contextPath}/department/list",
            method:"GET",
            success:function (result) {
                $.each(result.extend.list,function(){
                    var optionEle=$("<option></option>").append(this.name).attr("value",this.id);
                    optionEle.appendTo("#empAddModal select");
                });
            }
        });
        $('#empAddModal').modal();
    });

    $(document).on('click',".delete_btn",function(){
        var delName=$(this).parent("td").parent("tr").find("td:eq(1)").text();
        var id=$(this).parent("td").parent("tr").find("td:eq(0)").text();
        if(confirm("确认删除"+delName+"?")){
            $.ajax({
                url:"${pageContext.request.contextPath}/employee/delemployee",
                data:"id="+id,
                method:"POST",
                success:function (result) {
                    alert("删除成功");
                    to_page(1);
                }
            });
        }
    });



</script>


</body>
</html>
