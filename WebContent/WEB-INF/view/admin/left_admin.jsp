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
      <li class="nav-header">设置</li>
      <s:if test="#session['uri']=='admin_setting.jsp'">
        <li class="active">
          <a href="admin_setting">
            <i class="icon-white icon-edit"></i>系统设置
          </a>
        </li>
      </s:if>
      <s:else>
        <li>
          <a href="admin_setting">
            <i class="icon-edit"></i>系统设置
          </a>
        </li>
      </s:else>
      <s:if test="#session['uri']=='admin_courseset.jsp'">
        <li class="active">
          <a href="admin_courseset">
            <i class="icon-white icon-th-list"></i>课程设置
          </a>
        </li>
      </s:if>
      <s:else>
        <li>
          <a href="admin_courseset">
            <i class="icon-th-list"></i>课程设置
          </a>
        </li>
      </s:else>
      <s:if test="#session['uri']=='admin_uploaddata.jsp'">
        <li class="active">
          <a href="admin_uploaddata">
            <i class="icon-white icon-upload"></i>数据上传
          </a>
        </li>
      </s:if>
      <s:else>
        <li>
          <a href="admin_uploaddata">
            <i class="icon-upload"></i>数据上传
          </a>
        </li>
      </s:else>
      <li class="nav-header">评教情况 </li>
      <s:if test="#session['uri']=='admin_status.jsp'">
        <li class="active">
          <a href="admin_status?page=1">
            <i class="icon-white icon-calendar"></i>评教查看
          </a>
        </li>
      </s:if>
      <s:else>
        <li>
          <a href="admin_status?page=1">
            <i class="icon-calendar"></i>评教查看
          </a>
        </li>
      </s:else>
      <s:if test="#session['uri']==''">
        <li class="active">
          <a href="admin_statusresult">
            <i class="icon-white icon-download"></i>数据下载
          </a>
        </li>
      </s:if>
      <s:else>
        <li>
          <a href="admin_statusresult">
            <i class="icon-download"></i>数据下载
          </a>
        </li>
      </s:else>
      <li class="nav-header">账号设置</li>
      <s:if test="#session['uri']==''">
        <li class="active">
          <a href="profile">
            <i class="icon-white icon-list-alt"></i>账号管理
          </a>
        </li>
      </s:if>
      <s:else>
        <li>
          <a href="profile">
            <i class="icon-list-alt"></i>账号管理
          </a>
        </li>
      </s:else>
      <s:if test="#session['uri']==''">
        <li class="active">
          <a href="profile">
            <i class="icon-white icon-user"></i>修改信息
          </a>
        </li>
      </s:if>
      <s:else>
        <li>
          <a href="profile">
            <i class="icon-user"></i>修改信息
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