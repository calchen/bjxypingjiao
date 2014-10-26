<%@ page language="java" contentType="text/html; charset=utf-8"%> 
<!DOCTYPE html>
<!--[if lt IE 7 ]><html lang="zh-CN" class="ie6 ielt7 ielt8 ielt9"><![endif]-->
<!--[if IE 7 ]><html lang="zh-CN" class="ie7 ielt8 ielt9"><![endif]-->
<!--[if IE 8 ]><html lang="zh-CN" class="ie8 ielt9"><![endif]-->
<!--[if IE 9 ]><html lang="zh-CN" class="ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!-->
<html lang="zh-CN"><!--<![endif]-->
  <head>
    <%@ include file="../head.jsp" %>
  </head>
  <body>
    <div class="container">
      <%@ include  file="../top.jsp"%>
      <div class="row">
        <%@ include  file="../left.jsp"%>
        <div class="span9">
          <h1>编辑个人信息</h1>
          <form action="stu_profile_setting" method="post" class="form-horizontal">
            <fieldset>
              <legend>个人信息</legend>
              <div class="control-group">
                <label class="control-label" for="input01">姓名</label>
                <div class="controls">
                  <input type="text" class="input-xlarge" value="${studentInfo['name']}" readonly="readonly"/>
                </div>
              </div>
              <div class="control-group">
                <label class="control-label" for="input01">学号</label>
                <div class="controls">
                  <input type="text" class="input-xlarge" value="${studentInfo['id']}" readonly="readonly"/>
                </div>
              </div>
              <div class="control-group">
                <label class="control-label" for="input01">专业</label>
                <div class="controls">
                  <input type="text" class="input-xlarge" value="${studentInfo['professionalName']}" readonly="readonly"/>
                </div>
              </div>
              <div class="control-group">
                <label class="control-label" for="input01">班级</label>
                <div class="controls">
                  <input type="text" class="input-xlarge" value="${studentInfo['executiveClass']}" readonly="readonly"/>
                </div>
              </div>
              <div class="control-group">
                <label class="control-label" for="input01">电话</label>
                <div class="controls">
                  <input type="text" id="phone" class="input-xlarge" value="${studentInfo['telNumber']}" name="studentInfo.telNumber"/>
                </div>
              </div>
              <div class="control-group">
                <label class="control-label" for="input01">邮箱</label>
                <div class="controls">
                  <input type="text" id="email" class="input-xlarge" value="${studentInfo['email']}" name="studentInfo.email"/>
                </div>
              </div>      
              <div class="control-group">
                <label class="control-label" for="input01">身份证号</label>
                <div class="controls">
                  <s:if test="studentInfo['idCardNumber']!='' && studentInfo['idCardNumber']!=null">
                    <input type="text" class="input-xlarge"
                      value="${studentInfo['idCardNumber']}"readonly="readonly"/>
                    <p class="help-block">身份证号可用于重置密码</p>
                  </s:if>
                  <s:else>
                    <input type="text" class="input-xlarge" id="id"
                      placeholder="请谨慎输入，输入后不可修改" name="studentInfo.idCardNumber" />
                    <p class="help-block">身份证号可用于重置密码</p>
                  </s:else>
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
                <button type="submit" class="btn btn-primary" onclick="return check();">保存</button> 
                <button class="btn">取消</button>
              </div>
            </fieldset>
          </form>
        </div>
      </div>
    </div>
    <%@include file="../foot.jsp"%>
    <script type="text/javascript">
      function check(){
        var phone = document.getElementById("phone");
        var email = document.getElementById("email");
        var id = document.getElementById("id");
        var reg = /^1\d{10}$/;
        if(phone.value==''){
          ;
        }else if(!reg.test(phone.value)) {
        	phone.focus();
        	alert("电话不正确！");
          return false;
        }
        reg = /^(\w-*\.*)+@(\w-?)+(\.\w{2,})+$/;
        if(email.value==''){
          ;
        }else if(!reg.test(email.value)){
          email.focus();
          alert("邮箱不正确！");
          return false;
        }
        reg = /^\d{18}|\d{15}$/;
        if(id.value==''){
          ;
        }else if(!reg.test(id.value)){
        	id.focus();
          alert("身份证号不正确！");
          return false;
        }
    }
</script>
  </body>
</html>
