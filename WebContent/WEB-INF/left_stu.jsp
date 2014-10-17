<%@ page language="java" contentType="text/html; charset=utf-8" %>
<%
  //获取当前页面的完整名称，如：index.jsp
  String uri = request.getRequestURI();
  uri = uri.substring(uri.lastIndexOf("/") + 1);
  System.out.println(uri);
%>
  <div class="span3">
    <div class="well" style="padding: 8px 0;">
      <ul class="nav nav-list">
        <li class="nav-header">滨江学院评教系统</li>
      <%
      if(uri != null && uri.toLowerCase().equals("index.jsp")) {
        %>
        <li class="active"><a href="index"><i class="icon-white icon-home"></i> 信息公告</a>
        </li>
        <%
      } else {
        %>
        <li>
          <a href="index"><i class="icon-home"></i> 信息公告</a>
        </li>
        <%
      }
      if(uri != null && uri.toLowerCase().equals("pingjiao.jsp")) {
        %>
        <li class="active">
          <a href="pingjiao"><i class="icon-white icon-check"></i> 网上评教</a>
        </li>
        <%
      } else {
        %>
        <li>
          <a href="pingjiao"><i class="icon-check"></i> 网上评教</a>
        </li>
        <%
      }
      if(uri != null && uri.toLowerCase().equals("result.jsp")) {
        %>
        <li class="active">
          <a href="result"><i class="icon-white icon-list-alt"></i> 评教记录</a>
        </li>
        <%
      } else {
        %>
        <li>
          <a href="result"><i class="icon-list-alt"></i> 评教记录</a>
        </li>
        <%
      }
      /*if(uri != null && uri.toLowerCase().equals("messages.jsp")) {
        %>
        <li class="active">
          <a href="messages"><i class="icon-white icon-envelope"></i> 站内信</a>
        </li>
        <%
      } else {
        %>
        <li>
          <a href="messages"><i class="icon-envelope"></i> 站内信</a>
        </li>
        <%
      }
      */%>
          
        <li class="nav-header">账号设置 </li>
      <%
      if(uri != null && uri.toLowerCase().equals("profile.jsp")) {
        %>
        <li class="active">
          <a href="profile"><i class="icon-white icon-user"></i> 个人信息</a>
        </li>
        <%
      } else {
        %>
        <li>
          <a href="profile"><i class="icon-user"></i> 个人信息</a>
        </li>
        <%
      }
      if(uri != null && uri.toLowerCase().equals("password.jsp")) {
        %>
        <li class="active">
          <a href="password"><i class="icon-white icon-cog"></i> 修改密码</a>
        </li>
        <%
      } else {
        %>
        <li>
          <a href="password"><i class="icon-cog"></i> 修改密码</a>
        </li>
        <%
      }
      %>
          
        <li class="divider"></li>
      <%
      if(uri != null && uri.toLowerCase().equals("help.jsp")) {
        %>
        <li class="active">
          <a href="help"><i class="icon-white icon-info-sign"></i> 帮助</a>
        </li>
        <%
      } else {
        %>
        <li>
          <a href="help"><i class="icon-info-sign"></i> 帮助</a>
        </li>
        <%
      }
      %>    
      </ul>
    </div>
  </div>