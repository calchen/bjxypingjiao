<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<!--[if lt IE 7 ]><html lang="zh-CN" class="ie6 ielt7 ielt8 ielt9"><![endif]-->
<!--[if IE 7 ]><html lang="zh-CN" class="ie7 ielt8 ielt9"><![endif]-->
<!--[if IE 8 ]><html lang="zh-CN" class="ie8 ielt9"><![endif]-->
<!--[if IE 9 ]><html lang="zh-CN" class="ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!-->
<html lang="zh-CN">
<!--<![endif]-->
<head>
<%@ include file="../head.jsp"%>
<script src="${pageContext.request.contextPath}/js/sha1.js"/></script>
<!-- 
<link href="css/strength-meter.css" rel="stylesheet"/>
<script src="js/strength-meter.js"></script>
<script src="js/strength-meter-zh-cn.js"></script> -->
</head>
<body>
  <div class="container">
    <%@ include file="../top.jsp"%>
    <div class="row">
      <%@ include file="../left.jsp"%>
      <div class="span9">
        <h1>修改密码</h1>
        <form action="tch_password_setting" id="theForm" method="post" class="form-horizontal">
          <fieldset>
            <legend>修改密码</legend>
            <div class="control-group">
              <label class="control-label" for="input01">旧密码</label>
              <div class="controls">
                <input type="password" id="passwordold" class="input-xlarge" name="oldPawword"/>
              </div>
            </div>
            <div class="control-group">
              <label class="control-label" for="input01">新密码</label>
              <div class="controls">
                <input type="password" id="password1" class="input-xlarge" name="newPassword"/>
              </div>
            </div>
            <div class="control-group">
              <label class="control-label" for="input01">再次确认密码</label>
              <div class="controls">
                <input type="password" id="password2" class="input-xlarge"/>
              </div>
            </div>
            <s:if test="status!=null">
              <div class="control-group">
                <label class="control-label" for="input01"></label>
                <div class="span3">
                  <div class="alert">
                    ${status }
                  </div>
                </div>
              </div>
            </s:if>
            <div class="form-actions">
              <button type="submit" id="check" class="btn btn-primary" onclick="return update();">修改</button>
              <button class="btn">取消</button>
            </div>
          </fieldset>
        </form>
      </div>
    </div>
  </div>
  <%@include file="../foot.jsp"%>
  <script type="text/javascript">
    function update() {
    	var passwdold = document.getElementById("passwordold")
    	var passwd1 = document.getElementById("password1");
        var passwd2 = document.getElementById("password2");
        var check = document.getElementById("check");
        if(passwdold.value == '') {
        	alert("请输入旧密码");
        	passwdold.focus();
            return false;
        }
        if(passwd1.value != passwd2.value){
            alert("两次密码不一致！");
            passwd1.focus();
            return false;
        }
        passwdold.value = hex_sha1(passwdold.value);
        passwd1.value = hex_sha1(passwd1.value);
    }
  </script>
</body>
</html>
