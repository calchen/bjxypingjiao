<%@ page language="java" contentType="text/html; charset=utf-8" %>
<%
  //获取当前页面的完整名称，如：index.jsp
  String uri = request.getRequestURI();
  uri = uri.substring(uri.lastIndexOf("/") + 1);
  //System.out.println(uri);
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
      <s:if test="#session['uri']=='admin_setting.jsp'">
        <li class="active">
          <a href="admin_setting">
            <i class="icon-white icon-check"></i>系统设置
          </a>
        </li>
      </s:if>
      <s:else>
        <li>
          <a href="admin_setting">
            <i class="icon-check"></i>系统设置
          </a>
        </li>
      </s:else>
      <li class="nav-header">数据上传</li>
      <s:if test="#session['uri']=='admin_importstudata.jsp'">
        <li class="active">
          <a href="admin_importstudata">
            <i class="icon-white icon-file"></i>学生数据
          </a>
        </li>
      </s:if>
      <s:else>
        <li>
          <a href="admin_importstudata">
            <i class="icon-file"></i>学生数据
          </a>
        </li>
      </s:else>
      <s:if test="#session['uri']==''">
        <li class="active">
          <a href="admin_importtchdata">
            <i class="icon-white icon-file"></i>教师数据
          </a>
        </li>
      </s:if>
      <s:else>
        <li>
          <a href="admin_importtchdata">
            <i class="icon-file"></i>教师数据
          </a>
        </li>
      </s:else>
      <s:if test="#session['uri']==''">
        <li class="active">
          <a href="admin_importcrsdata">
            <i class="icon-white icon-file"></i>课程数据
          </a>
        </li>
      </s:if>
      <s:else>
        <li>
          <a href="admin_importcrsdata">
            <i class="icon-file"></i>课程数据
          </a>
        </li>
      </s:else>
      <li class="nav-header">评教查看 </li>
      <s:if test="#session['uri']==''">
        <li class="active">
          <a href="admin_statuscurrent">
            <i class="icon-white icon-calendar"></i>评教情况
          </a>
        </li>
      </s:if>
      <s:else>
        <li>
          <a href="admin_statuscurrent">
            <i class="icon-calendar"></i>评教情况
          </a>
        </li>
      </s:else>
      <s:if test="#session['uri']==''">
        <li class="active">
          <a href="admin_statusresult">
            <i class="icon-white icon-calendar"></i>评教记录
          </a>
        </li>
      </s:if>
      <s:else>
        <li>
          <a href="admin_statusresult">
            <i class="icon-calendar"></i>评教记录
          </a>
        </li>
      </s:else>
      <s:if test="#session['uri']==''">
        <li class="active">
          <a href="admin_statustch">
            <i class="icon-white icon-calendar"></i>评教数据
          </a>
        </li>
      </s:if>
      <s:else>
        <li>
          <a href="admin_statustch">
            <i class="icon-calendar"></i>评教数据
          </a>
        </li>
      </s:else>
      <li class="nav-header">账号设置</li>
      <s:if test="#session['uri']==''">
        <li class="active">
          <a href="profile">
            <i class="icon-white icon-user"></i>个人信息
          </a>
        </li>
      </s:if>
      <s:else>
        <li>
          <a href="profile">
            <i class="icon-user"></i>个人信息
          </a>
        </li>
      </s:else>
      <s:if test="#session['uri']==''">
        <li class="active">
          <a href="password">
            <i class="icon-white icon-cog"></i>修改密码
          </a>
        </li>
      </s:if>
      <s:else>
        <li>
          <a href="password">
            <i class="icon-cog"></i>修改密码
          </a>
        </li>
      </s:else>
      <li class="divider">
      </li>
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