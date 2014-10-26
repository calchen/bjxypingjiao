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
        <form action="tchpjsetting_${result['grade']}_${result['semester']}?name=${name }" method="post" class="form-horizontal">
          <input type="hidden" value="${result['grade']}" name="result.grade">
          <input type="hidden" value="${result['semester']}" name="result.semester">
          <input type="hidden" value="${result['course']}" name="result.course">
          
          <fieldset>
            <table class="table table-bordered table-striped table-hover">
              <thead>
                <tr>
                  <th>评分指标</th>
                  <th>分数(0-10分)</th>
                </tr>
              </thead>
              <s:set
                value="#{0:'0分',1:'1分',2:'2分',3:'3分',4:'4分',5:'5分'}"
                var="marklist" />
              <tbody>
                <tr>
                  <td>上课不迟到、不早退、不旷课</td>
                  <td>
                    <s:select list="marklist" theme="simple" value="result.result[0]" name="result.result[0]"/>
                  </td>
                </tr>
                <tr>
                  <td>尊敬师长、注重礼貌</td>
                  <td><s:select list="marklist" theme="simple" value="result.result[1]" name="result.result[1]"/></td>
                </tr>
                <tr>
                  <td>专心听讲、遵守课堂纪律</td>
                  <td><s:select list="marklist" theme="simple" value="result.result[2]" name="result.result[2]"/></td>
                </tr>
                <tr>
                  <td>课前预习，按时保质完成实习(实验)和作业</td>
                  <td><s:select list="marklist" theme="simple" value="result.result[3]" name="result.result[3]"/></td>
                </tr>
                <tr>
                  <td>学习风气浓厚</td>
                  <td><s:select list="marklist" theme="simple" value="result.result[4]" name="result.result[4]"/></td>
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
