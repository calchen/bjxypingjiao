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
<%@ include file="../head.jsp"%>
<style type="text/css">
select {
  width: 110px;
}
</style>
<style type="text/css">
body {
  padding-bottom: 70px;	
}
</style>
</head>
<body>
  <div class="container">
    <%@ include file="../top.jsp"%>
    <div class="row">
      <%@ include file="../left.jsp"%>
      <div class="span9">
        <h1>网上评教</h1>
        <s:if test="result['status']==0">
          <h2>${name }(未评)</h2>
        </s:if>
        <s:else>
          <h2>${name }(已评)</h2>
        </s:else>
        <form action="stupjsetting_${result['grade']}_${result['semester']}_${type}?name=${name }" method="post" class="form-horizontal">
          <input type="hidden" value="${result['grade']}" name="result.grade">
          <input type="hidden" value="${result['semester']}" name="result.semester">
          <input type="hidden" value="${result['course']}" name="result.course">
          <input type="hidden" value="${type}" name="type">
          <fieldset>
            <table class="table table-bordered table-striped table-hover">
              <thead>
                <tr>
                  <th>评分指标</th>
                  <th>分数(0-10分)</th>
                </tr>
              </thead>
              <s:set
                value="#{0:'0分',1:'1分',2:'2分',3:'3分',4:'4分',5:'5分',6:'6分',7:'7分',8:'8分',9:'9分',10:'10分'}"
                var="marklist" />
              <tbody>
                <tr>
                  <td>为人师表，严格管理和要求学生</td>
                  <td><s:select list="marklist" theme="simple" value="result.result[0]" name="result.result[0]"/>
                  </td>
                </tr>
                <tr>
                  <td>备课充足，讲解耐心</td>
                  <td><s:select list="marklist" theme="simple" value="result.result[1]" name="result.result[1]"/></td>
                </tr>
                <tr>
                  <td>教学任务明确，目标清晰</td>
                  <td><s:select list="marklist" theme="simple" value="result.result[2]" name="result.result[2]"/></td>
                </tr>
                <tr>
                  <td>实验演示动作规范，操作熟练</td>
                  <td><s:select list="marklist" theme="simple" value="result.result[3]" name="result.result[3]"/></td>
                </tr>
                <tr>
                  <td>实验器材维护良好，使用合理，布置有序</td>
                  <td><s:select list="marklist" theme="simple" value="result.result[4]" name="result.result[4]"/></td>
                </tr>
                <tr>
                  <td>着重培养学生动手能力，分析能力，解决问题能力</td>
                  <td><s:select list="marklist" theme="simple" value="result.result[5]" name="result.result[5]"/></td>
                </tr>
                <tr>
                  <td>教师治学严谨，言传身教</td>
                  <td><s:select list="marklist" theme="simple" value="result.result[6]" name="result.result[6]"/></td>
                </tr>
                <tr>
                  <td>指导及时，认真答疑</td>
                  <td><s:select list="marklist" theme="simple" value="result.result[7]" name="result.result[7]"/></td>
                </tr>
                <tr>
                  <td>实验课时安排合理，计划性强</td>
                  <td><s:select list="marklist" theme="simple" value="result.result[8]" name="result.result[8]"/></td>
                </tr>
                <tr>
                  <td>学生参与度高，课堂气氛良好</td>
                  <td><s:select list="marklist" theme="simple" value="result.result[9]" name="result.result[9]"/></td>
                </tr>
              </tbody>
            </table>
            <div class="form-control">
              <button type="submit" class="btn btn-primary" id="ms" data-toggle="popover" 
                data-trigger="hover" data-placement="right"
			    data-content="以最后一次提交为准">提交</button>
            </div>
          </fieldset>
        </form>
      </div>
    </div>
  </div>
  <%@include file="../foot.jsp"%>
  <script type="text/javascript">
	$(function (){ 
	  $('#ms').popover();
	});
  </script>
</body>
</html>
