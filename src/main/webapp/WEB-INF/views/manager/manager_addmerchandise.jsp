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
</head>
<body class="hold-transition sidebar-mini">
<!---Modal-->
<div class="modal fade" id="packAddModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h4 class="modal-title" id="myModalLabel">添加一个包</h4>
            </div>

            <div class="modal-body">
                <form class="form-horizontal" id="pack_form">
                    <div class="form-group">
                        <label class="col-sm-4 control-label">
                            商品类别
                        </label>
                        <div class="col-sm-10">
                            <select class="form-control" name="goodsType" id="goodsType" default="1">

                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-4 control-label">
                            商品名称
                        </label>
                        <div class="col-sm-10">
                            <select class="form-control" name="goodsId" id="goods">

                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-4 control-label">
                            数量
                        </label>
                        <div class="col-sm-10">
                            <input type="number" name="num" class="form-control" id="num">
                        </div>
                    </div>

                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                        <button type="button" class="btn btn-primary" id="goods_save_btn">保存</button>
                    </div>

                </form>
            </div>

        </div>
    </div>
</div>








<!---Modal-->
<div class="modal fade" id="merchandiseAdd" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h4 class="modal-title">设置货单</h4>
            </div>

            <div class="modal-body">
                <form class="form-horizontal" id="merchandise_form">
                    <div class="form-group">
                        <label class="col-sm-4 control-label">
                            重量
                        </label>
                        <div class="col-sm-10">
                            <input type="number" name="weight" class="form-control" id="weight">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-4 control-label">
                            体积
                        </label>
                        <div class="col-sm-10">
                            <input type="number" name="volumn" class="form-control" id="volumn">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">
                            终点
                        </label>
                        <div class="col-sm-10">
                            <select class="form-control" name="endpoint" id="endpoint">
                            </select>
                        </div>
                    </div>


                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                        <button type="button" class="btn btn-primary" id="merchandise_save">保存</button>
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
                                <a href="/employee/managerdetailinfo1?id=${employee.id}" class="nav-link">
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
                        <a href="#" class="nav-link">
                            <i class="fa fa-home"></i>
                            <p>
                                工作地点
                            </p>
                        </a>
                    </li>


                    <li class="nav-item has-treeview">
                        <a href="" class="nav-link">
                            <i class="fa fa-tasks"></i>
                            <p>
                                任务清单
                                <i class="right fa fa-angle-left"></i>
                            </p>
                        </a>
                        <ul class="nav nav-treeview">
                            <li class="nav-item">
                                <a href="#" class="nav-link">
                                    <i class="fa fa-circle-o nav-icon"></i>
                                    <p>查看历史信息</p>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a href="#" class="nav-link">
                                    <i class="fa fa-circle-o nav-icon"></i>
                                    <p>进货任务</p>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a href="/manager1/addmerchandise?id=${employee.id}" class="nav-link">
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


            <div class="container">
                <div class="row">
                    <div class="col-md-4"></div>
                    <button type="button" class="btn btn-info btn-large col-md-4" id="btn">生成一个货单</button>
                    <div class="col-md-4"></div>
                    <div class="col-md-4"></div>
                    <div class="col-md-4" align="center"><span id="span_mid"></span></div>
                    <div class="col-md-4"></div>
                </div>
            </div>


            <div class="container box-body table-responsive no-padding">
                <!-- Main hero unit for a primary marketing message or call to action -->
                <div class="leaderboard">
                    <h1></h1>
                    <p></p>
                    <p>
                        <a id="addpack_a" class="btn btn-sm btn-large" href="#">添加一个包+</a></p>
                </div>
                <!-- Example row of columns -->
                <div class="">
                    <!-- 显示表格数据 -->
                    <div class="row">
                        <div class="col-md-12">
                            <table class="table table-hover" id="emps_table">
                                <thead>
                                <tr>
                                    <th>商品名</th>
                                    <th>数量</th>
                                    <th></th>
                                </tr>
                                <thead>
                                <tbody id="packsList">

                                </tbody>

                            </table>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row">

                <div class="col-md-5"></div>
                <div class="col-md-5"></div>
                <button type="button" class="btn btn-success col-md-1" id="btn_save">保存货单</button>
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
<!-- Bootstrap 4 -->
<script src="../../../plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- Bootstrap WYSIHTML5 -->
<script src="../../../plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
<!-- AdminLTE App -->
<script src="../../../dist/js/adminlte.js"></script>
<script>
    var merchandiseId;
    var goodsTypeId;
    $(function () {
    });
    $("#btn").click(function () {

        $('#packsList').empty();
        $.ajax({
            url: "/manager1/addmerchandiseforid",
            success: function (result) {
                $('#span_mid').empty();
                alert("生成一个货单" + result.extend.mid);
                $('#span_mid').append("货单号:" + result.extend.mid);
                merchandiseId = result.extend.mid;
                showPacksList();
            }
        });

    });

    $("#addpack_a").click(function () {

        $.ajax({
            url: "/goodsType/goodsTypelist",
            success: function (result) {
                $('#goodsType').empty();
                $.each(result.extend.goodsTypes, function () {
                    var optionEle = $("<option></option>").append(this.name).attr("value", this.id);
                    optionEle.appendTo("#goodsType");
                });

            }
        });

        getGoods(1);

        $('#packAddModal').modal();
    });

    function getGoods(goodsTypeId) {
        $.ajax({
            url: "/goods/goodsListByTypeId",
            data: "id=" + goodsTypeId,
            success: function (result) {

                $('#goods').empty();
                $.each(result.extend.goods, function () {
                    var optionEle = $("<option></option>").append(this.name).attr("value", this.id);
                    optionEle.appendTo("#goods");
                });
            }
        });
    }

    function getPoints(){
        $.ajax({
            url:"/point/getpoints",
            success:function (result) {
                $('#endpoint').empty();
                $.each(result.extend.points, function () {
                    var optionEle = $("<option></option>").append(this.name).attr("value", this.id);
                    optionEle.appendTo("#endpoint");
                });
            }
        });
    }

    $('#goodsType').bind("change", function () {
        goodsTypeId = $(this).val();
        getGoods(goodsTypeId);

    });

    $('#goods_save_btn').click(function () {
        $.ajax({
            url: "/package/packageSave",
            data: $.param({'merchandiseId': merchandiseId}) + '&' + $('#pack_form').serialize(),
            success: function (result) {
                alert(result);
                showPacksList();
                $('#packAddModal').modal('hide');
            }
        });

    })

    function showPacksList() {
        $('#packsList').empty();
        $.ajax({
            url: "/package/packs",
            data: "merchandiseId=" + merchandiseId,
            success: function (result) {
                $.each(result.extend.packs, function () {
                    var nameTd = $("<td></td>").append(this.goods.name);
                    var num = $("<td></td>").append(this.num);
                    $("<tr></tr>").append(nameTd).append(num).appendTo("#emps_table tbody");
                });
            }
        });
    }

    $('#btn_save').click(function () {
        getPoints();
        $('#merchandiseAdd').modal();
    });
</script>
</body>
</html>
