<%@ page language="java" contentType="text/html; charset=utf-8"%>
 <%@taglib prefix="s" uri="/struts-tags"%>
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
  <link href="${pageContext.request.contextPath}/css/bootstrap-datetimepicker.min.css" rel="stylesheet">
  <script src="${pageContext.request.contextPath}/js/bootstrap-datetimepicker.js"> </script>
  <script src="${pageContext.request.contextPath}/js/locales/bootstrap-datetimepicker.zh-CN.js"> </script>
</head>
<body>
  <div class="container">
    <%@ include file="../top.jsp" %>
      <div class="row">
        <%@ include file="../left.jsp" %>
          <div class="span9">
            <h1>系统设置</h1>
            <form action="admin_settingup" method="post" id="edit-profile" class="form-horizontal">
              <fieldset>
                <legend>学期设置</legend>
                <div class="control-group">
                  <label class="control-label" for="input01">当前学期</label>
                  <div class="controls">
                    <input type="text" id="input01" readonly="readonly"
                      value="${grade.value}${semester.value}"
                    />
                  </div>
                  <br />
                  <label class="control-label" for="input01">修改学年</label>
                  <div class="controls">
                    <s:select class="input-xlarge" list="gradeList" listKey="value" listValue="value" 
                      value="grade.value" name="grade.value" />
                  </div>
                  <br />
                  <label class="control-label" for="input01">修改学期</label>
                  <div class="controls">
                    <s:select list="semesterList" listKey="value" listValue="value" 
                      value="semester.value" name="semester.value"/>
                  </div>
                </div>
                <legend>评教设置</legend>
                <div class="control-group">
                  <label class="control-label" for="input01">当前状态</label>
                  <div class="controls">
                    <input type="text" readonly="readonly"
                      value="评教进行" />
                  </div>
                  <br />
                  <label class="control-label" for="input01">修改状态</label>
                  <div class="controls">
                    <s:set value="#{'prepare':'评教准备','going':'评教进行','end':'评教结束'}" var="stat"/>
                    <s:select list="stat" value="status" name="status"/>
                  </div>
                  <br />
                  <label class="control-label" for="input01">开始日期</label>
                  <div class="controls">
                    <div class="input-append date form_datetime">
                      <input type="text" value="${start}"  name="start" >
                      <span class="add-on">
                        <i class="icon-th">
                        </i>
                      </span>
                    </div>
                  </div>
                  <br />
                  <label class="control-label" for="input01">结束日期</label>
                  <div class="controls">
                    <div class="input-append date form_datetime">
                      <input type="text" value="${end}" name="end" >
                      <span class="add-on">
                        <i class="icon-th">
                        </i>
                      </span>
                    </div>
                  </div>
                  <br />
                  <label class="control-label" for="input01">评教阶段</label>
                  <div class="controls">
                    <select>
                      <option>开学</option>
                      <option selected>期中</option>
                      <option>期末</option>
                    </select>
                  </div>
                </div>
                <div class="form-actions">
                  <button type="submit" class="btn btn-primary">保存</button>
                  <button class="btn">取消</button>
                </div>
              </fieldset>
            </form>
          </div>
      </div>
  </div>
  <script type="text/javascript">
    $('.form_datetime').datetimepicker({
      language: 'zh-CN',
      weekStart: 1,
      todayBtn: 1,
      autoclose: 1,
      todayHighlight: 1,
      format: 'yyyy-mm-dd hh:ii',
      showMeridian: 1,
      pickerPosition: 'bottom-left'
    });
  </script>
</body>

</html>