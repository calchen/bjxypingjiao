<%@ page language="java" contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<div class="navbar">
  <div class="navbar-inner">
    <div class="container">
      <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
        <span class="icon-bar">
        </span>
        <span class="icon-bar">
        </span>
        <span class="icon-bar">
        </span>
      </a>
      <a class="brand" href="#">滨江学院评教系统</a>
      <div class="nav-collapse">
        <ul class="nav">
          <li class="active">
            <a href="index">信息公告</a>
          </li>
          <li>
            <a href="profile">账号设置</a>
          </li>
          <li>
            <a href="help">帮助</a>
          </li>
        </ul>
        <ul class="nav pull-right">
          <li>
            <a href="login">
              <s:if test="#session['login_user_name']!=null">
                <s:property value="#session['login_user_name']" />
              </s:if>
              <s:else>
                                       登录
              </s:else>
            </a>
          </li>
          <li>
            <a href="logout">注销</a>
          </li>
        </ul>
      </div>
    </div>
  </div>
</div>