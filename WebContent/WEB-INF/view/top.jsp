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
            <s:if test="#session['login_user_level']==1">
              <a href="stu_profile">账号设置</a>
            </s:if>
            <s:elseif test="#session['login_user_level']==2">
              <a href="tch_profile">账号设置</a>
            </s:elseif>
            <s:elseif test="#session['login_user_level']==4">
              <a href="admin_profile">账号设置</a>
            </s:elseif>
            <s:else>
              <a href="login">账号设置</a>
            </s:else>
          </li>
          <li>
            <a href="help">帮助</a>
          </li>
        </ul>
        <ul class="nav pull-right">
          <li>
            <a href="login">
              <s:if test="#session['login_user_name']!=null">
                ${session.login_user_name}
                (${session.login_user})
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