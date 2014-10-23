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
            <h1>数据下载</h1>
            <table class="table table-bordered table-striped">
              <thead>
                <tr>
                  <th>学年</th>
                  <th>学期</th>
                  <th>类别</th>
                  <th>操作</th>
                </tr>
              </thead>
              <tbody>
                <s:iterator var="course" value="courses">
                  <tr>
                    <td>
                      ${course.grade}学年
                    </td>
                    <td>
                                                       第${course.semester}学期
                    </td>
                    <td>
                      ${course.name}
                    </td>
                    <td>
                      <a class="toggle-link" href="admin_courseset">
                        <i class="icon-remove"></i>删除
                      </a>
                    </td>
                  </tr>
                </s:iterator>
              </tbody>
            </table>
            <a class="toggle-link" href="#message-reply">
              <i class="icon-plus"></i>新增课程
            </a>
            <form action="admin_courseadd" method="post" id="message-reply" class="form-horizontal hidden">
              <fieldset>
                <div class="control-group">
                  <label class="control-label" for="textarea">学年</label>
                  <div class="controls">
                    <s:select list="gradeList" listKey="value" listValue="value"
                    value="grade.value" name="grade.value" />
                  </div>
                </div>
                <div class="control-group">
                  <label class="control-label" for="textarea">学期</label>
                  <div class="controls">
                    <s:select list="semesterList" listKey="value" listValue="value"
                    value="semester.value" name="semester.value" />
                  </div>
                </div>
                <div class="control-group">
                  <label class="control-label" for="textarea">课程名</label>
                  <div class="controls">
                    <input type="text" name="newCourse.name" />
                  </div>
                </div>
                <div class="form-actions">
                  <button type="submit" class="btn btn-primary">发送</button>
                  <button class="btn"> 取消</button>
                </div>
              </fieldset>
            </form>
          </div>
      </div>
  </div>
  <%@include file="../foot.jsp" %>
</body>
</html>