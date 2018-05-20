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
    <link href="/static/bootstrap-datetimepicker.min.css" rel="stylesheet">
    <script type="text/javascript"
            src="http://api.map.baidu.com/api?v=2.0&ak=fRnaUbQzjKctONFGiLqsuaQBArEg0EuG"></script>

</head>
<body class="hold-transition sidebar-mini">


<!---Modal-->
<div class="modal fade" id="dispatchModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h4 class="modal-title" id="myModalLabel">添加调配任务</h4>
            </div>

            <div class="modal-body">
                <div class="form-group">
                    <label class="col-sm-4 control-label">
                        地点性质
                    </label>
                    <div class="col-sm-10">
                        <label class="col-sm-4 control-label" id="stationtype"/>
                    </div>
                </div>
                <form class="form-horizontal" id="dispatch_form">
                    <div class="form-group">
                        <label class="col-sm-4 control-label">
                            待调配货单号
                        </label>
                        <div class="col-sm-10">
                            <select class="form-control" name="merchandiseId" id="merchandiseId">

                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-4 control-label">
                            可分配卡车
                        </label>
                        <div class="col-sm-10">
                            <select class="form-control" name="truckId" id="truckId">

                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-4 control-label">
                            可分配司机
                        </label>
                        <div class="col-sm-10">
                            <select class="form-control" name="deliverId" id="deliverId">

                            </select>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-sm-4 control-label">
                            应该到达日期
                        </label>
                        <div class="col-sm-10">
                            <input id="date" name="endDateShould">

                        </div>
                    </div>

                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                        <button type="button" class="btn btn-primary" id="dispatch_save_btn">保存</button>
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

            <div id="allmap" style="width: 100%;height:600px"></div>

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
<script src="/static/bootstrap-datetimepicker.min.js"></script>
<script>

    $("#date").datetimepicker();

    var points;
    var markers;
    var i;
    $(function () {

        //获得有需要调度订单的位置
        $.ajax({
            url: "/dispatch/getallpointsneeddispatch",
            success: function (result) {
                initMarker(result);
                getMap();

            }
        });
    });

    function initMarker(result) {
        points = result.extend.points;
        markers = new Array(points.length);
        for (i = 0; i < points.length; i++) {
            var strs = points[i].location.split(',');
            markers[i] = new BMap.Marker(new BMap.Point(strs[0], strs[1]), 15);
            markers[i].addEventListener("click", getModal.bind(this, points[i].id));
        }
    }

    function getMap() {
        var map = new BMap.Map("allmap");    // 创建Map实例
        var strs = points[0].location.split(',');
        map.centerAndZoom(new BMap.Point(strs[0], strs[1]), 15);  // 初始化地图,设置中心点坐标和地图级别
        //set marker
        for (i = 0; i < points.length; i++) {
            map.addOverlay(markers[i]);
        }

        //添加地图类型控件
        map.addControl(new BMap.MapTypeControl({
            mapTypes: [
                BMAP_NORMAL_MAP,
                BMAP_HYBRID_MAP
            ]
        }));
        map.setCurrentCity("");          // 设置地图显示的城市 此项是必须设置的
        map.enableScrollWheelZoom(true);     //开启鼠标滚轮缩放
    }

    function getModal(pid) {
        $.ajax({
            url: "/truck/gettruckbypid",
            data: "id=" + pid,
            success: function (result) {
                $("#truckId").empty();
                $.each(result.extend.trucks, function () {

                    var optionEle = $("<option></option>").append(this.plateNum).attr("value", this.id);
                    optionEle.appendTo("#truckId");
                });
            }
        });

        $.ajax({
            url:"/driver/getdriverbypid",
            data:"id="+pid,
            success:function (result) {
                $("#deliverId").empty();
                $.each(result.extend.drivers, function () {

                    var optionEle = $("<option></option>").append(this.name).attr("value", this.id);
                    optionEle.appendTo("#deliverId");
                });
            }
        });

        var type;
        if (points[pid - 1].type == '1') {
            type = "超市";
        } else if (points[pid - 1].type == '2') {
            type = '仓库';
        } else if (points[pid - 1].type = '3') {
            type = '工厂';
        }
        $('#stationtype').empty();
        $('#stationtype').append(type);
        $.ajax({
            url: "/merchandise/getmerchandisebypid",
            data: "id=" + pid,
            success: function (result) {
                $("#dispatch_form #merchandiseId").empty();
                $.each(result.extend.merchandise, function () {

                    var optionEle = $("<option></option>").append(this.id).attr("value", this.id);
                    optionEle.appendTo("#merchandiseId");
                });
                $('#dispatchModal').modal();
            }
        });

    }
    
    $('#dispatch_save_btn').click(function () {
        $.ajax({
            url:"/dispatch/savedispatch",
            method:'post',
            data:$.param({'dispatcherId': ${employee.id}}) + '&' + $('#dispatch_form').serialize(),
            success:function (result) {
                alert("success");
            }
        });

    });

</script>
</body>
</html>
