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
          <h1>网上评教</h1>
          <ul class="files zebra-list">
            <li>
              <i class="icon-check"></i> <a class="title" href="pingjiao20131tiyu.jsp">体育</a> 
              <span class="meta">评教日期 <em>12月11日</em>至<em>12月25日</em></span>
            </li>
            <li>
              <i class="icon-check"></i> <a class="title" href="pingjiao20131wulishiyan.jsp">物理实验</a> 
              <span class="meta">评教日期 <em>12月11日</em>至<em>12月25日</em></span>
            </li>
            <li>
              <i class="icon-check"></i> <a class="title" href="pingjiao20131yingyu.jsp">英语</a> 
              <span class="meta">评教日期 <em>12月11日</em>至<em>12月25日</em></span>
            </li>
          </ul>
        </div>
      </div>
    </div>
  </body>
</html>
