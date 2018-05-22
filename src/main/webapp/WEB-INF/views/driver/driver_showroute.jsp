<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="initial-scale=1.0, user-scalable=no" />
    <style type="text/css">
        body, html,#allmap {width: 100%;height: 100%;overflow: hidden;margin:0;font-family:"微软雅黑";}
    </style>
    <script type="text/javascript"
            src="http://api.map.baidu.com/api?v=2.0&ak=fRnaUbQzjKctONFGiLqsuaQBArEg0EuG"></script>
    <title>show route</title>
</head>
<body>
<div id="allmap"></div>
</body>
</html>
<script type="text/javascript">
    // 百度地图API功能
    var map = new BMap.Map("allmap");
    var myP1 = new BMap.Point(${startp});    //起点
    var myP2 = new BMap.Point(${endp});    //终点
    var driving2 = new BMap.DrivingRoute(map, {renderOptions: {map: map, autoViewport: true}});    //驾车实例
    driving2.search(myP1, myP2);    //显示一条公交线路
</script>
