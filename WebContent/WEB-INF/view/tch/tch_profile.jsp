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
          <form action="tch_profile_setting" method="post" class="form-horizontal">
            <fieldset>
              <legend>个人信息</legend>
              <div class="control-group">
                <label class="control-label" for="input01">姓名</label>
                <div class="controls">
                  <input type="text" class="input-xlarge" value="${teacherInfo['name']}" readonly="readonly"/>
                </div>
              </div>
              <div class="control-group">
                <label class="control-label" for="input01">工资号</label>
                <div class="controls">
                  <input type="text" class="input-xlarge" value="${teacherInfo['id']}" readonly="readonly"/>
                </div>
              </div>
              <div class="control-group">
                <label class="control-label" for="input01">电话</label>
                <div class="controls">
                  <input type="text" id="phone" class="input-xlarge" value="${teacherInfo['telNumber']}" name="teacherInfo.telNumber"/>
                </div>
              </div>
              <div class="control-group">
                <label class="control-label" for="input01">邮箱</label>
                <div class="controls">
                  <input type="text" id="email" class="input-xlarge" value="${teacherInfo['email']}" name="teacherInfo.email"/>
                </div>
              </div>      
              <div class="control-group">
                <label class="control-label" for="input01">身份证号</label>
                <div class="controls">
                  <s:if test="teacherInfo['idCardNumber']!=null && teacherInfo['idCardNumber']!=''">
                    <input type="text" class="input-xlarge"
                      value="${teacherInfo['idCardNumber']}"readonly="readonly"/>
                    <p class="help-block">身份证号可用于重置密码</p>
                  </s:if>
                  <s:else>
                    <input type="text" class="input-xlarge" id="id"
                      placeholder="请谨慎输入，输入后不可修改" name="teacherInfo.idCardNumber" />
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
                <button type="submit" class="btn btn-primary" id="check">保存</button> <button class="btn">取消</button>
              </div>
            </fieldset>
          </form>
        </div>
      </div>
    </div>
    <%@include file="../foot.jsp"%>
    <script type="text/javascript">
      window.onload = function(){
        var btn = document.getElementById("check");
        var email = document.getElementById("email");
        var phone = document.getElementById("phone");
        var id = document.getElementById("id");
        function isEmail(strEmail) { 
        	var reg = /^(\w-*\.*)+@(\w-?)+(\.\w{2,})+$/;
        	if(strEmail==''){
            	;
            }else if(!reg.test(strEmail))
            	alert("邮箱不正确！");
        }
        function isPhone(strPhone) { 
        	var reg = /^1\d{10}$/;
        	if(strPhone==''){
            	;
            }else if(!reg.test(strPhone))
            	alert("电话不正确！");
        }
        function isId(strId) { 
            var reg = /(^\d{15}$)|(^\d{17}([0-9]|X|x)$)/;
            if(strId==''){
            	;
            }else if(!reg.test(strId))
            	alert("身份证号不正确！");
        }
        btn.onclick = function(){
            isEmail(email.value);
            isPhone(phone.value);
            isId(id.value);
        }
    }
</script>
  </body>
</html>
