<%@ page language="java" contentType="text/html; charset=utf-8"%> 
<!DOCTYPE html>
<!--[if lt IE 7 ]><html lang="zh-CN" class="ie6 ielt7 ielt8 ielt9"><![endif]-->
<!--[if IE 7 ]><html lang="zh-CN" class="ie7 ielt8 ielt9"><![endif]-->
<!--[if IE 8 ]><html lang="zh-CN" class="ie8 ielt9"><![endif]-->
<!--[if IE 9 ]><html lang="zh-CN" class="ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!-->
<html lang="zh-CN">
<!--<![endif]-->
<head>
  <%@ include file="../head.jsp" %>
</head>
<body>
  <div class="container">
    <%@ include file="../top.jsp" %>
      <div class="row">
        <%@ include file="../left.jsp" %>
          <div class="span9">
            <h1>网上评教</h1>
            <table class="table table-bordered table-striped">
              <thead>
                <tr>
                  <th>学年</th>
                  <th>学期</th>
                  <th>课程</th>
                  <th>操作</th>
                </tr>
              </thead>
              <tbody>
                <s:iterator var="list" value="courses">
                  <tr>
                    <td>${list.grade }学年</td>
                    <td>第${list.semester }学期</td>
                    <td>${list.name }</td>
                    <td>
                      <a class="toggle-link" 
                        href="tchpj_${list.grade}_${list.semester}?name=${list.name }">
                        <i class="icon-check"></i>评教
                      </a>
                    </td>
                  </tr>
                </s:iterator>           
              </tbody>
            </table>
          </div>
      </div>
  </div>
  <%@include file="../foot.jsp"%>
</body>
</html>
