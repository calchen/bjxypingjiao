<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>

<%@ include file="head.jsp"%>
<link href="css/bootstrap-datepicker.css" rel="stylesheet">
<link href="css/bootstrap-timepicker.min.css" rel="stylesheet">
<script src="js/bootstrap-datepicker.js"></script>
<script src="js/locales/bootstrap-datepicker.zh-CN.js"></script>
<script src="js/bootstrap-timepicker.min.js"></script>
</head>
<body>
  <div class="container">
    <div class="row form-horizontal">
      <label class="control-label" for="input01">开始日期</label>
      <div class="controls">
        <div class="input-group date">
          <input id="datapicker1" type="text" class="form-control"
            style="width: 110px;"> <span class="input-group-addon">
            <i class="icon-calendar"></i>
          </span> <input id="timepicker1" type="text" class="input-small"> <span
            class="add-on"><i class="icon-time"></i></span>
        </div>
      </div>
      <br /> <label class="control-label" for="input01">结束日期</label>
      <div class="controls">
        <div class="input-group date">
          <input id="datapicker2" type="text" class="form-control"
            style="width: 110px;"> <span class="input-group-addon">
            <i class="icon-calendar"></i>
          </span> <input id="timepicker2" type="text" class="input-small"> <span
            class="add-on"><i class="icon-time"></i></span>
        </div>
      </div>
      <script type="text/javascript">
        $('.form-control').datepicker({
          format : "yyyy-mm-dd",
          weekStart : 1,
          todayBtn : "linked",
          language : "zh-CN",
          
          setUTCDate : 1,
          autoclose : true,
          todayHighlight : true
        });

        $('.input-small').timepicker({
          minuteStep : 1,
          showSeconds : true,
          showMeridian : false
        });
        var now = new Date(); 
        var h = now.getFullYear(); 
        var m = (now.getMonth() + 1>9) ? now.getMonth() + 1 : "0"+(now.getMonth() + 1); 
        var s = (now.getDate()>9)  ? now.getDate()  : "0"+now.getDate(); 
        var dateNow = h+"-"+m+"-"+s; 
        datapicker1.value=dateNow;
        datapicker2.value=dateNow;
      </script>
    </div>
  </div>
</body>
</html>