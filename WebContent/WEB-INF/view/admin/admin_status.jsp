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
            <h1>评教查看</h1>
            <table class="table table-bordered table-striped">
              <thead>
                <tr>
                  <th>行政班</th>
                  <th>学年</th>
                  <th>学期</th>
                  <th>课程</th>
                  <th>已评</th>
                  <th>未评</th>
                  <th>操作</th>
                </tr>
              </thead>
              <tbody>
                <s:iterator var="list" value="statusList">
                  <tr>
                    <td>${list.executiveClass }</td>
                    <td>${list.grade }</td>
                    <td>${list.semester }</td>
                    <td>${list.course }</td>
                    <td>${list.havePj }</td>
                    <td>${list.haventPj }</td>
                    <td>
                      <a class="toggle-link" href="admin_status?page=1&executiveClass=${list.executiveClass }&grade=${list.grade }&semester=${list.semester }&course=${list.course}">
                        <i class="icon-search"></i>查看
                      </a>
                    </td>
                  </tr>
                </s:iterator>
              </tbody>
            </table>
            <div class="pagination">
              <ul>
                <li><a href="admin_status?page=${pre }">«</a> </li>
				<s:iterator var="list" value="pageList">
					<li><a href="admin_status?page=${list }">${list }</a> </li>
				</s:iterator>
                <li><a href="admin_status?page=${next }">»</a> </li>
              </ul>
            </div>
            <a class="toggle-link" href="#new-file">
              <i class="icon-plus"></i>查询
            </a>
            <form action="admin_statussearch" enctype="multipart/form-data" id="new-file" class="form-horizontal hidden">
              <fieldset>
                <div class="control-group">
                  <label class="control-label" for="textarea">年级</label>
                  <div class="controls">
                    <s:select list="gradeList"/>
                  </div>
                </div>
                <div class="form-actions">
                  <button type="submit" class="btn btn-primary">查询</button>
                  <button class="btn">取消</button>
                </div>
              </fieldset>
            </form>
          </div>
      </div>
  </div>
  <%@include file="../foot.jsp" %>
</body>
</html>
