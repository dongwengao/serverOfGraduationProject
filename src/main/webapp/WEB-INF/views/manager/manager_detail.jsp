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
    <link rel="stylesheet" href="${pageContext.request.contextPath}/../../../plugins/font-awesome/css/font-awesome.min.css">
    <!-- Ionicons -->
    <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/dist/css/adminlte.min.css">
    <!-- bootstrap wysihtml5 - text editor -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/../../../plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">
    <!-- Google Font: Source Sans Pro -->
    <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700" rel="stylesheet">
</head>
<body class="hold-transition sidebar-mini">
<div class="wrapper">


    <!---Modal-->
    <div class="modal fade" id="empUpdateModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title" id="myModalLabel">更新信息</h4>
                </div>

                <div class="modal-body">
                    <form class="form-horizontal" action="${pageContext.request.contextPath}/updateInfo/updateCostar?id=${employee.id}" method="post" enctype="multipart/form-data">
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
                        还有工作地点
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                            <button type="submit" class="btn btn-primary" id="emp_save_btn">保存</button>
                        </div>
                    </form>
                </div>

            </div>
        </div>
    </div>



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
                                <a href="${pageContext.request.contextPath}/employee/managerdetailinfo1?id=${employee.id}" class="nav-link">
                                    <i class="fa fa-circle-o nav-icon"></i>
                                    <p>查看个人信息</p>
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
                        <a href="${pageContext.request.contextPath}/manager1/getLocationInfo?id=${employee.id}" class="nav-link">
                            <i class="fa fa-home"></i>
                            <p>
                                工作地点
                            </p>
                        </a>
                    </li>


                    <li class="nav-item has-treeview">
                        <a href="#" class="nav-link">
                            <i class="fa fa-tasks"></i>
                            <p>
                                任务清单
                                <i class="right fa fa-angle-left"></i>
                            </p>
                        </a>
                        <ul class="nav nav-treeview">
                            <li class="nav-item">
                                <a href="${pageContext.request.contextPath}/manager1/excel?id=${employee.id}" class="nav-link">
                                    <i class="fa fa-circle-o nav-icon"></i>
                                    <p>EXCEL导入</p>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a href="${pageContext.request.contextPath}/manager1/examInputMerchandise?id=${employee.id}" class="nav-link">
                                    <i class="fa fa-circle-o nav-icon"></i>
                                    <p>进货任务</p>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a href="${pageContext.request.contextPath}/manager1/addmerchandise?id=${employee.id}" class="nav-link">
                                    <i class="fa fa-circle-o nav-icon"></i>
                                    <p>出货任务</p>
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
            <table class="table table-hover" id="emps_table">
                <thead>
                <tr>
                    <th>姓名</th>
                    <th>${employee.name}</th>
                </tr>
                <tr>
                    <th>性别</th>
                    <th><c:if test="${employee.gender eq '1'}">男</c:if>
                        <c:if test="${employee.gender eq '2'}">女</c:if></th>
                </tr>
                <tr>
                    <th>电话</th>
                    <th>${employee.phone}</th>
                </tr>
                <tr>
                    <th>照片</th>
                    <th><img src="data:image/png;base64,${img}"></th>
                </tr>
                <tr>
                    <th>工作地点</th>
                    <th>${employee.manager.point.name}</th>
                </tr>
                <thead>
                <tbody>

                </tbody>
            </table>


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
    $('#emp_update_p').click(function () {
        $('#empUpdateModal').modal({});
    });
</script>
</body>
</html>
