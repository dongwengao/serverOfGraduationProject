<!DOCTYPE html>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html lang="zh-CN">

<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width,initial-scale=1,user-scalable=no" />
    <title>登陆页面</title>
    <link rel="stylesheet" href="plugins/bootstrap/css/bootstrap.css" />
    <link rel="stylesheet" href="dist/css/adminlte.css">
    <link rel="stylesheet" href="static/ionicons.min.css">
    <link rel="stylesheet" href="plugins/iCheck/square/blue.css">
    <link rel="stylesheet" href="plugins/font-awesome/css/font-awesome.css">
</head>
<body class="hold-transition login-page">
<div class="login-box">
    <div class="login-logo">
        <span><b>超市物流配送管理系统</b></span>
    </div>
    <!-- /.login-logo -->
    <div class="login-box-body">
        <p class="login-box-msg">登陆页面</p>

        <form action="employee/login" method="post">
            <div class="form-group has-feedback">
                <input type="text" class="form-control" placeholder="UserName" name="username">
                <span class="glyphicon glyphicon-user form-control-feedback"></span>
            </div>
            <div class="form-group has-feedback">
                <input type="password" class="form-control" placeholder="Password" name="password">
                <span class="glyphicon glyphicon-lock form-control-feedback"></span>
            </div>
            <div  class="text-center">
                    <button type="submit" class="btn btn-primary">
                        登陆
                    </button>
            </div>
        </form>

        <!--
            <div class="social-auth-links text-center">
              <p>- OR -</p>
              <a href="#" class="btn btn-block btn-social btn-facebook btn-flat"><i class="fa fa-facebook"></i> Sign in using
                Facebook</a>
              <a href="#" class="btn btn-block btn-social btn-google btn-flat"><i class="fa fa-google-plus"></i> Sign in using
                Google+</a>
            </div>
        /.social-auth-links -->
        <!--
        <a href="#">I forgot my password</a><br>
        <a href="#" class="text-center">Register a new membership</a>
        -->
    </div>
    <!-- /.login-box-body -->
</div>
<!-- /.login-box -->
</body>
</html>
