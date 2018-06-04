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
<body class="hold-transition sidebar-mini">


<!---Modal-->
<div class="modal fade" id="packAddModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h4 class="modal-title" id="myModalLabel">显示货单里所有包</h4>
            </div>

            <div class="modal-body">


                <table class="table table-hover" id="pack_table">
                    <thead>
                    <tr>
                        <th>包裹编号</th>
                        <th>名称</th>
                        <th>数量</th>
                        <th>状态</th>
                        <th>操作</th>
                    </tr>
                    <thead>
                    <tbody id="packList">

                    </tbody>

                </table>



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
                        <a href="" class="nav-link">
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

            <div class="container box-body table-responsive no-padding">
                <!-- Main hero unit for a primary marketing message or call to action -->
                <div class="leaderboard">
                    <h1>待处理货单</h1>
                    <p></p>
                </div>
                <!-- Example row of columns -->
                <div class="">
                    <!-- 显示表格数据 -->
                    <div class="row">
                        <div class="col-md-12">
                            <table class="table table-hover" id="merchandise_table">
                                <thead>
                                <tr>
                                    <th>货单号</th>
                                    <th>体积</th>
                                    <th>重量</th>
                                    <th>来源</th>
                                    <th>来源性质</th>
                                    <th>操作</th>
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

    $(function () {
        getinput();
    });

    function getinput(){
        $('#merchandise_table tbody').empty();
        $.ajax({
            url: "${pageContext.request.contextPath}/manager1/getallinput",
            data: "id=" +${employee.id},
            success: function (result) {
                $.each(result.extend.merchandises, function () {
                    var idTd = $("<td></td>").append(this.id);
                    var weightTd = $("<td></td>").append(this.weight);
                    var volumnTd = $("<td></td>").append(this.volumn);
                    var startTd = $("<td></td>").append(this.startpointobject.name);
                    var startType = $("<td></td>").append(this.startpoint.type == '1' ? '超市' : this.startpoint.type == '2' ? '仓库' : '工厂');
                    var editBtn = $("<button></button>").addClass(
                        "btn btn-primary btn-sm showdetail").append("详情");
                    var delBtn = $("<button></button>").addClass(
                        "btn btn-info btn-sm arrivedsure").append("确认到达");
                    var btnTd = $("<td></td>").append(editBtn).append(" ").append(
                        delBtn);
                    var num = $("<td></td>").append(this.num);
                    $("<tr></tr>").append(idTd).append(weightTd).append(volumnTd).append(startTd).append(startType).append(btnTd).appendTo("#merchandise_table tbody");
                });
            }
        });
    }

    var merchandiseId;
    $(document).on('click',".showdetail",function(){
            $('#packAddModal').modal();
            merchandiseId=$(this).parent("td").parent("tr").find("td:eq(0)").text();
            getMerchandiseDetail(merchandiseId);
    });

    function getMerchandiseDetail(merchandise){
        $("#pack_table tbody").empty();
        $.ajax({
            url:"${pageContext.request.contextPath}/manager1/getpacksbymid",
            data:"mid="+merchandiseId,
            success:function (result) {
                $('#pack_table tbody').empty();
                $.each(result.extend.packs, function () {
                    var idTd = $("<td></td>").append(this.packageId);
                    var nameTd = $("<td></td>").append(this.goods.name);
                    var numTd = $("<td></td>").append(this.num);
                    var stateTd=$("<td></td>").append(this.state==1?'未到达':'到达');
                    var sureBtn = $("<button></button>").addClass(
                        "btn btn-info btn-sm arrivesurepack").append("确认到达");
                    var btnTd = $("<td></td>").append(" ").append(
                        sureBtn);
                    var num = $("<td></td>").append(this.num);
                    $("<tr></tr>").append(idTd).append(nameTd).append(numTd).append(stateTd).append(btnTd).appendTo("#pack_table tbody");
                });


            }
        });
    }

    $(document).on('click',".arrivedsure",function(){
        var merchandiseId=$(this).parent("td").parent("tr").find("td:eq(0)").text();
            $.ajax({
                url:"${pageContext.request.contextPath}/manager1/suremerchandise",
                data:"id="+merchandiseId,
                success:function (result) {
                    alert("确认成功");
                    getinput();
                }
            });

    });


    $(document).on('click',".arrivesurepack",function(){
        var packId=$(this).parent("td").parent("tr").find("td:eq(0)").text();
        $.ajax({
            url:"${pageContext.request.contextPath}/manager1/suremerchandisepack",
            data:"id="+packId,
            success:function (result) {
                alert("确认成功");
                getMerchandiseDetail();
            }
        });

    });



</script>
</body>
</html>
