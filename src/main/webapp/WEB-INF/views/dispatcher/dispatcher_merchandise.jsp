<!DOCTYPE html>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>AdminLTE 3 | Dashboard</title>
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
    <script type="text/javascript"
            src="http://api.map.baidu.com/api?v=2.0&ak=fRnaUbQzjKctONFGiLqsuaQBArEg0EuG"></script>
</head>
<body class="hold-transition sidebar-mini">


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
                                <a href="/employee/costardetailinfo1?id=${employee.id}" class="nav-link">
                                    <i class="fa fa-circle-o nav-icon"></i>
                                    <p>查看个人信息</p>
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
                            <i class="fa fa-suitcase"></i>
                            <p>
                                货物信息
                                <i class="right fa fa-angle-left"></i>
                            </p>
                        </a>
                        <ul class="nav nav-treeview">
                            <li class="nav-item">
                                <a href="/merchandise/getallmerchandise?id=${employee.id}" class="nav-link">
                                    <i class="fa fa-circle-o nav-icon"></i>
                                    <p>查看货物信息</p>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a href="/merchandise/getneeddispatche?id=${employee.id}" class="nav-link">
                                    <i class="fa fa-circle-o nav-icon"></i>
                                    <p>待调度货物信息</p>
                                </a>
                            </li>
                        </ul>
                    </li>


                    <li class="nav-item has-treeview">
                        <a href="#" class="nav-link">
                            <i class="fa fa-truck"></i>
                            <p>
                                卡车信息
                                <i class="right fa fa-angle-left"></i>
                            </p>
                        </a>
                        <ul class="nav nav-treeview">
                            <li class="nav-item">
                                <a href="/truck/truckall?id=${employee.id}" class="nav-link">
                                    <i class="fa fa-circle-o nav-icon"></i>
                                    <p>查看卡车信息</p>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a href="/truck/usetruck?id=${employee.id}" class="nav-link">
                                    <i class="fa fa-circle-o nav-icon"></i>
                                    <p>可调度卡车信息</p>
                                </a>
                            </li>
                        </ul>
                    </li>


                    <li class="nav-item has-treeview">
                        <a href="#" class="nav-link">
                            <i class="fa fa-user-circle-o"></i>
                            <p>
                                司机信息
                                <i class="right fa fa-angle-left"></i>
                            </p>
                        </a>
                        <ul class="nav nav-treeview">
                            <li class="nav-item">
                                <a href="/driver/drivers?id=${employee.id}" class="nav-link">
                                    <i class="fa fa-circle-o nav-icon"></i>
                                    <p>查看司机信息</p>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a href="/driver/driversuse?id=${employee.id}" class="nav-link">
                                    <i class="fa fa-circle-o nav-icon"></i>
                                    <p>可调度司机信息</p>
                                </a>
                            </li>
                        </ul>
                    </li>

                    <li class="nav-item">
                        <a href="/dispatch/makedispatcher?id=${employee.id}" class="nav-link">
                            <i class="fa fa-circle-o nav-icon"></i>
                            <p>生成调度单</p>
                        </a>
                    </li>

                    <li class="nav-item">
                        <a href="/dispatch/alldispatch?id=${employee.id}" class="nav-link">
                            <i class="fa fa-circle-o nav-icon"></i>
                            <p>查看调度单</p>
                        </a>
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
                            <table class="table table-hover" id="emps_table">
                                <thead>
                                <tr>
                                    <th>货物编号</th>
                                    <th>体积</th>
                                    <th>重量</th>
                                    <th>发货地点</th>
                                    <th>接收地点</th>
                                    <th>状态</th>
                                </tr>
                                <thead>
                                <tbody id="merchandiseList">

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
<%--<!-- Bootstrap 4 -->--%>
<script src="../../../plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<%--<!-- Bootstrap WYSIHTML5 -->--%>
<script src="../../../plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
<%--<!-- AdminLTE App -->--%>
<script src="../../../dist/js/adminlte.js"></script>
<script>

    $(function () {
        $.ajax({
            url: "/merchandise/getallmerchandiseforjson",
            success: function (result) {
                var merchandises=result.extend.merchandises;
                $.each(merchandises, function (index, item) {
                    var midTd=$("<td></td>").append(item.id);
                    var volumnTd = $("<td></td>").append(item.volumn);
                    var weightTd=$("<td></td>").append(item.weight);
                    var startTd=$("<td></td>").append(item.startpointobject.name);
                    var endTd=$("<td></td>").append(item.endpointobject.name);
                    var stateId=$("<td></td>").append(item.state == '2' ? '到达' :item.state=='1'?'未调度':'在路上');
                    $("<tr></tr>").append(midTd).append(volumnTd).append(weightTd).append(startTd).append(endTd).append(
                        stateId).appendTo("#emps_table tbody");
                });
            }
        });
    });

</script>


</body>
</html>
