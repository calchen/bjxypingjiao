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
          <h1>账号管理</h1>
          <form id="admin_profile" method="get" class="form-horizontal">
            <fieldset>
              <legend>账号管理</legend>
              <s:if test="operation==0">
                <div class="control-group">
                  <label class="control-label" for="input01">操作</label>
                  <div class="controls">
                    <s:set value="#{1:'添加账号',2:'删除账号',3:'修改账号'}" var="stat"/>
                    <s:select list="stat" name="operation"/>
                  </div>
                </div>
                <div class="control-group">
                  <label class="control-label" for="input01">用户名</label>
                  <div class="controls">
                    <input type="text" class="input-large" name="username"/>
                  </div>
                </div>
                <div class="form-actions">
                  <button type="submit" class="btn btn-primary">下一步</button> 
                  <button class="btn">取消</button>
                </div>
              </s:if>
              <s:elseif test="operation==1 || operation==3">
                <div class="control-group">
                  <label class="control-label" for="input01">用户名</label>
                  <div class="controls">
                    <input type="text" class="input-large" value="${username }" name="username"/>
                  </div>
                </div>
                <div class="control-group">
                  <label class="control-label" for="input01">密码</label>
                  <div class="controls">
                    <input type="password" class="input-large" value="${password }" name="password"/>
                  </div>
                </div>
                <div class="control-group" id="div1">
                  <label class="control-label" for="input01">专业</label>
                  <div class="controls">
                    <input type="password" class="input-large" value="${professionName }" name="professionName"/>
                  </div>
                </div>
                <div class="control-group" id="div2">
                  <label class="control-label" for="input01">行政班</label>
                  <div class="controls">
                    <input type="password" class="input-large" value="${executiveClass }" name="executiveClass"/>
                  </div>
                </div>
                <div class="control-group">
                  <label class="control-label" for="input01">账户类型</label>
                  <div class="controls">
                    <s:set value="#{1:'学生',2:'老师',4:'管理员'}" var="le"/>
                    <s:select list="le" name="level" onchange="disappear(this.value)"/>
                  </div>
                </div>
                <s:if test="null==null">
                  <label class="control-label" for="input01"></label>
                  <div class="controls">
                    <div class="alert input-medium">
                      ${error }213
                    </div>
                  </div>
                </s:if>
                <div class="form-actions">
                  <button type="submit" class="btn btn-primary">确定</button> 
                  <button class="btn">取消</button>
                </div>
              </s:elseif>
              <s:elseif test="operation==2">
                
              </s:elseif>
              <s:elseif test="operation==3">
              
              </s:elseif>
            </fieldset>
          </form>
        </div>
      </div>
    </div>
    <%@include file="../foot.jsp" %>
    <script type="text/javascript">
      function disappear(value) {
    	  if(value == 2 || value == 4) {
    		  div = document.getElementById("div1");
    		  div.style.display="none";
    		  div = document.getElementById("div2");
    		  div.style.display="none";
    	  }else if (value == 1 ) {
    		  div = document.getElementById("div1");
    		  div.style.display="block";
    		  div = document.getElementById("div2");
    		  div.style.display="block";
    	  }
      } 
    </script>
  </body>
</html>
