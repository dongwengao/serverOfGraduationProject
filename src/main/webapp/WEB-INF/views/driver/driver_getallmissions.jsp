<!DOCTYPE html>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>AdminLTE 3 | Dashboard</title>
    <script src="/static/angular.js"></script>
    <!-- Tell the browser to be responsive to screen width -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="/static/bootstrap.css">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="../../../plugins/font-awesome/css/font-awesome.min.css">
    <!-- Ionicons -->
    <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="../../../dist/css/adminlte.min.css">
    <!-- bootstrap wysihtml5 - text editor -->
    <link rel="stylesheet" href="../../../plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">
    <!-- Google Font: Source Sans Pro -->
    <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700" rel="stylesheet">
</head>
<body class="hold-transition sidebar-mini" ng-app="">

<!---Modal-->
<div class="modal fade" id="empUpdateModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h4 class="modal-title" id="myModalLabel">更新信息</h4>
            </div>

            <div class="modal-body">
                <form class="form-horizontal" action="/updateInfo/updateDriver?id=${employee.id}" method="post"
                      enctype="multipart/form-data">
                    <div class="form-group">
                        <label class="col-sm-2 control-label">
                            姓名
                        </label>
                        <div class="col-sm-10">
                            <input type="text" name="name" class="form-control" id="name_update_input"
                                   placeholder="姓名">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">性别</label>
                        <div class="col-sm-10">
                            <label class="radio-inline">
                                <input type="radio" name="gender" id="gender1_update_input" value="1">
                                男
                            </label>
                            <label class="radio-inline">
                                <input type="radio" name="gender" id="gender2_update_input" value="2">
                                女
                            </label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-4 control-label">
                            电话
                        </label>
                        <div class="col-sm-8">
                            <input type="text" name="phone" class="form-control" id="phone_update_input"
                                   placeholder="电话">
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-2 control-label">
                            照片
                        </label>
                        <div class="col-sm-10">
                            <input name="img" type="file"/>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-4 control-label">
                            工作电话
                        </label>
                        <div class="col-sm-8">
                            <input type="text" name="workphone" class="form-control" id="workphone_update_input"
                                   placeholder="工作电话">
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
            <img src="../../../dist/img/Logo.png" alt="AdminLTE Logo" class="brand-image img-circle elevation-3"
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
                                    <a href="/employee/driverdetailinfo1?id=${employee.id}" class="nav-link">
                                        <i class="fa fa-circle-o nav-icon"></i>
                                        <p>查看个人信息</p>
                                    </a>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a href="#" class="nav-link">
                                    <i class="fa fa-circle-o nav-icon"></i>
                                    <p id="emp_update_p">修改个人信息</p>
                                </a>
                            </li>
                        </ul>
                    </li>


                    <li class="nav-item">
                        <a href="#" class="nav-link">
                            <i class="fa fa-circle-o nav-icon"></i>
                            <p>
                                工作状态
                            </p>
                        </a>
                    </li>

                    <li class="nav-item has-treeview">
                        <a href="#" class="nav-link">
                            <i class="fa fa-tasks"></i>
                            <p>
                                任务信息
                                <i class="right fa fa-angle-left"></i>
                            </p>
                        </a>
                        <ul class="nav nav-treeview">
                            <li class="nav-item">
                                <a href="/driver/getallmissions?id=${employee.id}" class="nav-link">
                                    <i class="fa fa-circle-o nav-icon"></i>
                                    <p>查看历史信息</p>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a href="/driver/manipulatedispatch?id=${employee.id}" class="nav-link">
                                    <i class="fa fa-circle-o nav-icon"></i>
                                    <p>操作任务</p>
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


            <div class="container box-body table-responsive no-padding">
                <!-- Main hero unit for a primary marketing message or call to action -->
                <div class="leaderboard">
                    <h1>所有货物信息</h1>
                </div>
                <!-- Example row of columns -->
                <div class="">
                    <!-- 显示表格数据 -->
                    <div class="row">
                        <div class="col-md-12">
                            <table class="table table-hover" id="mission_table">
                                <thead>
                                <tr>
                                    <th>调度单编号</th>
                                    <th>用车</th>
                                    <th>应该到达时间</th>
                                    <th>实到达时间</th>
                                </tr>
                                <thead>
                                <tbody id="dispatchList">

                                </tbody>

                            </table>
                        </div>
                    </div>
                </div>
            </div>


        </section>
    </div>


    <!-- /.content-wrapper -->
    <footer class="main-footer">
        <strong>Copyright &copy; 2014-2018 <a href="http://adminlte.io">AdminLTE.io</a>.</strong>
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
<script src="../../../plugins/jquery/jquery.min.js"></script>
<!-- jQuery UI 1.11.4 -->
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.min.js"></script>
<script src="/static/bootstrap.js"></script>
<!-- Bootstrap 4 -->
<script src="../../../plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- Bootstrap WYSIHTML5 -->
<script src="../../../plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
<!-- AdminLTE App -->
<script src="../../../dist/js/adminlte.js"></script>
<script>
    $(function () {
        $.ajax({
            url:"/driver/getdriverhistorydispatch",
            data:"id="+${employee.id},
            success:function(result){
                //清空table表格
                $("#dispatchList").empty();
                var dispatches = result.extend.dispatches;
                $.each(dispatches, function (index, item) {



                    var idTd=$("<td></td>").append(item.id);
                    var truckTd = $("<td></td>").append(item.truckObject.plateNum);
                    var endTd=$("<td></td>").append(item.endDateShould);
                    var endrealTd=$("<td></td>").append(item.endDateReal);
                    $("<tr></tr>").append(idTd).append(truckTd).append(endTd).append(endrealTd).appendTo("#dispatchList");

                });
            }
        });
    });

</script>
</body>
</html>
