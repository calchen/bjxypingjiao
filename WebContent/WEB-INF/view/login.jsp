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
<%@ include file="head.jsp"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<script src="${pageContext.request.contextPath}/js/sha1.js"/></script>
</head>
<body>
  <div id="login-page" class="container">
    <h1>滨江学院评教系统</h1>
    <form id="login-form" class="well" action="login" method="post">
      <input type="text" class="span3" placeholder="用户名" name="id"
        id="id" data-toggle="popover" data-trigger="hover" data-placement="bottom"
        data-content="学号或工资号"/>
      <br /> 
      <input type="password" class="span3" placeholder="密码" name="password" 
      id="password" data-toggle="popover" data-trigger="hover" data-placement="bottom"
        data-content="初始密码为身份证号后6位（x请小写）或者与用户名相同"/>
      <s:if test="logintimes>2">
        <div>
          <input type="text" class="span3" id="securityCode" name="securityCode" placeholder="验证码">
          <img src="SecurityCodeImage" id="Verify"  style="cursor:hand;" alt="看不清，换一张"/>
          <a href="javascript:onclick=changeImg()" id="changeImg">看不清，换一张</a>
        </div>
      </s:if>
      <br/>
      <s:if test="error!=null">
        <div class="alert">
          ${error }
        </div>
      </s:if>
      <label class="checkbox"> 
        <input type="checkbox" name="nextCheck" disabled="disabled"/>下次自动登录
      </label>
      
      <button class="btn btn-primary" onclick="return lgoin();" >登录</button>
      <button class="btn" data-toggle="modal" data-target="#forgotpassword">忘记密码</button>
      <a href="index">返回</a>
    </form>
  </div>

  <!-- 模态框（Modal） -->
  <div class="modal fade" id="forgotpassword" tabindex="-1" role="dialog"
    aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal"
            aria-hidden="true">&times;</button>
          <h4 class="modal-title" id="myModalLabel">忘记密码</h4>
        </div>
        <div class="modal-body">默认密码为身份证后6位，x请小写。<br/>学生账户请<a href="forgotpassword">点击这里</a>进行密码重置。<br />教师、管理员账户请联系教务处重置密码。</div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">关闭
          </button>
        </div>
      </div>
    </div>
  </div>
  <%@include file="foot.jsp"%>
  <script type="text/javascript">
    $(function (){ 
      $('#password').popover();
      $('#id').popover();
    });
    //对密码进行加密
    function lgoin(){
      var id = document.getElementById("id");
      if(id.value=='') {
    	id.focus();
    	alert('请输入用户名');
    	return false;
      }
      var password = document.getElementById("password");
      if(password.value=='') {
    	password.focus();
    	alert('请输入密码');
    	return false;
      }
      var password = document.getElementById("password");
      password.value = hex_sha1(password.value);
      var securityCode = document.getElementById("securityCode");
      if(securityCode.value=='') {
    	securityCode.focus();
    	alert('请输入验证码');
    	return false;
      }
    };
    $(function () {  
        //点击图片更换验证码
        $("#Verify").click(function(){
            $(this).attr("src","SecurityCodeImage?timestamp="+new Date().getTime());
        });
    });
    function changeImg(){
		document.getElementById("changeImg").disabled=true;
		document.getElementById("Verify").src="SecurityCodeImage?timestamp=" + new Date().getTime();
	}
  </script>
</body>
</html>