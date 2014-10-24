<%@ page language="java" contentType="text/html; charset=utf-8"%> 
<!DOCTYPE html>
<!--[if lt IE 7 ]><html lang="zh-CN" class="ie6 ielt7 ielt8 ielt9"><![endif]-->
<!--[if IE 7 ]><html lang="zh-CN" class="ie7 ielt8 ielt9"><![endif]-->
<!--[if IE 8 ]><html lang="zh-CN" class="ie8 ielt9"><![endif]-->
<!--[if IE 9 ]><html lang="zh-CN" class="ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!-->
<html lang="zh-CN"><!--<![endif]-->
  <head>
    <%@ include file="head.jsp" %>
  </head>
  <body>
    <div class="container">
      <%@ include  file="top.jsp"%>
      <div class="row">
        <%@ include  file="left.jsp"%>
        <div class="span9">
          <h1>信息公告</h1>
          <div class="hero-unit">
            <h2>欢迎使用滨江学院评教系统</h2>
            <p>
              ${PUBLICMESSAGE }
            </p>
          </div>
          <div class="well summary">
            <ul>
              <li>
                <span class="count">${application.ONLINEUSER}</span> 用户在线
              </li>
            </ul>
          </div>
          <s:if test="#session['USER_LEVEL']==4">
            <a class="toggle-link" href="#messagepublish">
              <i class="icon-plus"></i> 发送信息公告
            </a>
            <form action="admin_publishmessage" method="post" id="messagepublish" class="form-horizontal hidden" >
              <fieldset>
                <div class="control-group">
                  <label class="control-label" for="textarea">内容</label>
                  <div class="controls">
                    <textarea class="input-xlarge" rows="4" name="message"></textarea>
                  </div>
                </div>
                <div class="form-actions">
                  <button type="submit" class="btn btn-primary">发送</button> 
                  <button class="btn">取消</button>
                </div>
              </fieldset>
            </form>
          </s:if>
        </div>
      </div>
    </div>
    

    <%@include file="foot.jsp"%>
  </body>
</html>