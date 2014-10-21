<%@ page language="java" contentType="text/html; charset=utf-8" %>
<%
  //获取当前页面的完整名称，如：index.jsp
  String uri = request.getRequestURI();
  uri = uri.substring(uri.lastIndexOf("/") + 1);
  request.getSession().setAttribute("uri", uri);
%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<div class="span3">
  <div class="well" style="padding: 8px 0;">
    <ul class="nav nav-list">
      <li class="nav-header">滨江学院评教系统</li>
      <s:if test="#session['uri']=='index.jsp'">
        <li class="active">
          <a href="index">
            <i class="icon-white icon-home"></i>信息公告
          </a>
        </li>
      </s:if>
      <s:else>
        <li>
          <a href="index">
            <i class="icon-home"></i>信息公告
          </a>
        </li>
      </s:else>
      <s:if test="#session['uri']=='stu_pingjiao.jsp'">
        <li class="active">
          <a href="stu_pingjiao">
            <i class="icon-white icon-check"></i>网上评教
          </a>
        </li>
      </s:if>
      <s:else>
        <li>
          <a href="stu_pingjiao">
            <i class="icon-check"></i>网上评教
          </a>
        </li>
      </s:else>
      <s:if test="#session['uri']=='messages.jsp'">
        <li class="active">
          <a href="messages">
            <i class="icon-white icon-envelope"></i>站内信
          </a>
        </li>
      </s:if>
      <s:else>
        <li>
          <a href="messages">
            <i class="icon-envelope"></i>站内信
          </a>
        </li>
      </s:else>
      <li class="nav-header">账号设置</li>
      <s:if test="#session['uri']=='stu_profile.jsp'">
        <li class="active">
          <a href="stu_profile">
            <i class="icon-white icon-user"></i>个人信息
          </a>
        </li>
      </s:if>
      <s:else>
        <li>
          <a href="stu_profile">
            <i class="icon-user"></i>个人信息
          </a>
        </li>
      </s:else>
      <s:if test="#session['uri']=='stu_password.jsp'">
        <li class="active">
          <a href="stu_password">
            <i class="icon-white icon-cog"></i>修改密码
          </a>
        </li>
      </s:if>
      <s:else>
        <li>
          <a href="stu_password">
            <i class="icon-cog"></i>修改密码
          </a>
        </li>
      </s:else>
      <li class="divider"></li>
      <s:if test="#session['uri']=='help.jsp'">
        <li class="active">
          <a href="help">
            <i class="icon-white icon-info-sign"></i>帮助
          </a>
        </li>
      </s:if>
      <s:else>
        <li>
          <a href="help">
            <i class="icon-info-sign"></i>帮助
          </a>
        </li>
      </s:else>
    </ul>
  </div>
</div>