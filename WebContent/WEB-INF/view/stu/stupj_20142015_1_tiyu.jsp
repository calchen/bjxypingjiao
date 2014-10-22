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
        <h2>体育(${result.status})</h2>
        <form action="stupj_20142015_1_tiyu_setting" method="post" class="form-horizontal">
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
                value="#{0:'0分',1:'1分',2:'2分',3:'3分',4:'4分',5:'5分',6:'6分',7:'7分',8:'8分',9:'9分',10:'10分'}"
                var="marklist" />
              <tbody>
                <tr>
                  <td>学生学习兴趣浓厚，学习积极性高</td>
                  <td>
                    <s:select list="marklist" theme="simple" value="result.result[0]" 
                      name="result.result[0]"/>
                  </td>
                </tr>
                <tr>
                  <td>学生精力集中，遵守纪律，听从教师指导</td>
                  <td><s:select list="marklist" theme="simple" value="result.result[1]" name="result.result[1]"/></td>
                </tr>
                <tr>
                  <td>教师教态大方，言语准确，示范正确</td>
                  <td><s:select list="marklist" theme="simple" value="result.result[2]" name="result.result[2]"/></td>
                </tr>
                <tr>
                  <td>教师课堂准备充分，教学环节齐全</td>
                  <td><s:select list="marklist" theme="simple" value="result.result[3]" name="result.result[3]"/></td>
                </tr>
                <tr>
                  <td>教师合理利用场地，体育器材利用率高</td>
                  <td><s:select list="marklist" theme="simple" value="result.result[4]" name="result.result[4]"/></td>
                </tr>
                <tr>
                  <td>教师教学手段科学，方法多样，有创新性</td>
                  <td><s:select list="marklist" theme="simple" value="result.result[5]" name="result.result[5]"/></td>
                </tr>
                <tr>
                  <td>运动负荷量，练习密度合适</td>
                  <td><s:select list="marklist" theme="simple" value="result.result[6]" name="result.result[6]"/></td>
                </tr>
                <tr>
                  <td>教学效果良好，学生掌握锻炼方法，增强锻炼兴趣</td>
                  <td><s:select list="marklist" theme="simple" value="result.result[7]" name="result.result[7]"/></td>
                </tr>
                <tr>
                  <td>教师训练认真负责，练习积极参与，及时指导</td>
                  <td><s:select list="marklist" theme="simple" value="result.result[8]" name="result.result[8]"/></td>
                </tr>
                <tr>
                  <td>教师讲课有自己的风格、特色，深受学生喜爱</td>
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
