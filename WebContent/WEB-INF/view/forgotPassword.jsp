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
<script src="${pageContext.request.contextPath}/js/sha1.js"/></script>
<!-- 
<link href="css/strength-meter.css" rel="stylesheet"/>
<script src="js/strength-meter.js"></script>
<script src="js/strength-meter-zh-cn.js"></script> -->
</head>
<body>
  <div class="container">
    <%@ include file="top.jsp"%>
    <div class="row">
      <%@ include file="left.jsp"%>
      <div class="span9">
        <h1>重置密码</h1>
        <form action="findpassword" id="theForm" method="post" class="form-horizontal">
          <fieldset>
            <legend>重置密码</legend>
            <div class="control-group">
              <label class="control-label" for="input01">用户名</label>
              <div class="controls">
                <input type="text" id="id" class="input-xlarge" name="id"/>
              </div>
            </div>
            <div class="control-group">
              <label class="control-label" for="input01">身份证号</label>
              <div class="controls">
                <input type="text" id="idcardNum" class="input-xlarge" name="idcardNum"/>
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
            <div>
              <label class="control-label" for="input01">验证码</label>
              <div class="controls">
              <input type="text" class="input-mini" id="securityCode" name="securityCode">
              
              <img src="SecurityCodeImage" id="Verify"  style="cursor:hand;" alt="看不清，换一张"/>
              <a href="javascript:onclick=changeImg()" id="changeImg">看不清，换一张</a>
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
  <%@include file="foot.jsp"%>
  <script type="text/javascript">
    function update() {
    	var id = document.getElementById("id");
    	var idcardNum = document.getElementById("idcardNum");
    	var passwd1 = document.getElementById("password1");
        var passwd2 = document.getElementById("password2");
        var check = document.getElementById("check");
        var reg = /^\d{18}|\d{15}$/;
        if(id.value=='') {
        	id.focus();
        	alert("用户名不能为空！");
            return false;
        }
        if(idcardNum.value==''){
        	idcardNum.focus();
            alert("身份证号不能为空！");
            return false;
        }else if(!reg.test(idcardNum.value)){
        	idcardNum.focus();
          alert("身份证号不正确！");
          return false;
        }
        if(passwd1.value != passwd2.value){
            alert("两次密码不一致！");
            passwd1.focus();
            return false;
        }
        passwd1.value = hex_sha1(passwd1.value);
    }
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
