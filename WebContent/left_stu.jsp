<%@ page language="java" contentType="text/html; charset=utf-8" %>
<%
  //获取当前页面的完整名称，如：index.jsp
  String uri = request.getRequestURI();
  uri = uri.substring(uri.lastIndexOf("/") + 1);
  //System.out.println(uri);
%>
  <div class="span3">
    <div class="well" style="padding: 8px 0;">
      <ul class="nav nav-list">
        <li class="nav-header">滨江学院评教系统</li>
      <%
      if("index.jsp".equals(uri.toLowerCase())) {
        %>
        <li class="active"><a href="index.jsp">
          <i class="icon-white icon-home"></i> 信息公告</a>
        </li>
        <%
      } else {
        %>
        <li>
          <a href="index.jsp"><i class="icon-home"></i> 信息公告</a>
        </li>
        <%
      }
      if(uri != null && uri.toLowerCase().startsWith("pingjiao")) {
        %>
        <li class="active">
          <a href="pingjiao.jsp"><i class="icon-white icon-check"></i> 网上评教</a>
        </li>
        <%
      } else {
        %>
        <li>
          <a href="pingjiao.jsp"><i class="icon-check"></i> 网上评教</a>
        </li>
        <%
      }
      if("result.jsp".equals(uri.toLowerCase())) {
        %>
        <li class="active">
          <a href="result.jsp"><i class="icon-white icon-list-alt"></i> 评教记录</a>
        </li>
        <%
      } else {
        %>
        <li>
          <a href="result.jsp"><i class="icon-list-alt"></i> 评教记录</a>
        </li>
        <%
      }
      /*if("messages.jsp".equals(uri.toLowerCase())) {
        %>
        <li class="active">
          <a href="messages.jsp"><i class="icon-white icon-envelope"></i> 站内信</a>
        </li>
        <%
      } else {
        %>
        <li>
          <a href="messages.jsp"><i class="icon-envelope"></i> 站内信</a>
        </li>
        <%
      }
      */%>
          
                <li class="nav-header">账号设置 </li>
      <%
      if("profile.jsp".equals(uri.toLowerCase())) {
        %>
        <li class="active">
          <a href="profile.jsp"><i class="icon-white icon-user"></i> 个人信息</a>
        </li>
        <%
      } else {
        %>
        <li>
          <a href="profile.jsp"><i class="icon-user"></i> 个人信息</a>
        </li>
        <%
      }
      if("password.jsp  ".equals(uri.toLowerCase())) {
        %>
        <li class="active">
          <a href="password.jsp"><i class="icon-white icon-cog"></i> 修改密码</a>
        </li>
        <%
      } else {
        %>
        <li>
          <a href="password.jsp"><i class="icon-cog"></i> 修改密码</a>
        </li>
        <%
      }
      %>
          
        <li class="divider"></li>
      <%
      if("help.jsp".equals(uri.toLowerCase())) {
        %>
        <li class="active">
          <a href="help.jsp"><i class="icon-white icon-info-sign"></i> 帮助</a>
        </li>
        <%
      } else {
        %>
        <li>
          <a href="help.jsp"><i class="icon-info-sign"></i> 帮助</a>
        </li>
        <%
      }
      %>    
      </ul>
    </div>
  </div>