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
            <h1>教师数据上传</h1>
            <ul class="files zebra-list">
              <s:iterator var="file" value="filelist">
                <li>
                  <i class="icon-file">
                  </i>
                  <a class="title" href="${file.path}">${file.name}</a>
                  <span class="meta">上传于<em>${file.date}</em>上传者<em>${file.owner}</em>
                  </span>
                </li>
              </s:iterator>
            </ul>
            <a class="toggle-link" href="#new-file">
              <i class="icon-plus"></i>上传文件
            </a>
            <form action="admin_uploaddataup" enctype="multipart/form-data" id="new-file" class="form-horizontal hidden">
              <fieldset>
                <legend>上传文件</legend>
                <div class="control-group">
                  <label class="control-label" for="textarea">学年</label>
                  <div class="controls">
                    <s:select list="gradeList" listKey="value" listValue="value" value="grade.value"
                    name="grade.value" />
                  </div>
                </div>
                <div class="control-group">
                  <label class="control-label" for="textarea">学期</label>
                  <div class="controls">
                    <s:select list="semesterList" listKey="value" listValue="value" value="semester.value"
                    name="semester.value" />
                  </div>
                </div>
                <div class="control-group">
                  <label class="control-label" for="textarea">课程</label>
                  <div class="controls">
                    <s:select list="courseList" listKey="name" listValue="name" value="coursse.name"
                    name="coursse.name" />
                  </div>
                </div>
                <div class="control-group">
                  <label class="control-label" for="fileInput">文件</label>
                  <div class="controls">
                    <input class="input-file" id="fileInput" type="file" name="file" accept="application/vnd.ms-excel"/>
                  </div>
                </div>
                <div class="form-actions">
                  <button type="submit" class="btn btn-primary">上传</button>
                  <button class="btn">取消</button>
                </div>
              </fieldset>
            </form>
          </div>
      </div>
  </div>
</body>

</html>
