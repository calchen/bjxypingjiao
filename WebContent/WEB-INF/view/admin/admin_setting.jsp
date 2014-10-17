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
<link href="${pageContext.request.contextPath}/css/bootstrap-datetimepicker.min.css" rel="stylesheet">
<script src="${pageContext.request.contextPath}/js/bootstrap-datetimepicker.js"></script>
<script src="${pageContext.request.contextPath}/js/locales/bootstrap-datetimepicker.zh-CN.js"></script>

</head>
<body>
	<div class="container">
		<%@ include file="../top.jsp"%>
		<div class="row">
			<%@ include file="../left.jsp"%>
			<div class="span9">
				<h1>系统设置</h1>
				<form id="edit-profile" class="form-horizontal">
					<fieldset>
						<legend>学期设置</legend>
						<div class="control-group">
							<label class="control-label" for="input01">当前学期</label>
							<div class="controls">
								<input type="text" class="input-xlarge" id="input01"
									 value="2013-2014第2学期" />
							</div>
							<br /> <label class="control-label" for="input01">修改学年</label>
							<div class="controls">
								<select>
									<option>2013-2014</option>
									<option>2014-2015</option>
									<option>2015-2016</option>
								</select>
							</div>
							<br /> <label class="control-label" for="input01">修改学期</label>
							<div class="controls">
								<select>
									<option>第1学期</option>
									<option selected>第2学期</option>
								</select>
							</div>
						</div>
						<legend>评教设置</legend>
						<div class="control-group">
							<label class="control-label" for="input01">当前状态</label>
							<div class="controls">
								<input type="text" class="input-xlarge" id="input01"
									readonly="readonly" value="评教结束" />
							</div>
							<br /><label class="control-label" for="input01">修改状态</label>
							<div class="controls">
								<select>
									<option>评教准备</option>
									<option>评教开始</option>
									<option selected>评教结束</option>
								</select>
							</div>
							<br /> <label class="control-label" for="input01">开始日期</label>
							<div class="controls">
								<div class="input-append date form_datetime">
									<input type="text" >
										<span class="add-on"><i class="icon-th"></i>
									</span>
								</div>
							</div>
							<br /> <label class="control-label" for="input01">结束日期</label>
							<div class="controls">
								<div class="input-append date form_datetime">
									<input type="text" >
										<span class="add-on"><i class="icon-th"></i></span>
								</div>
							</div>
							<br /><label class="control-label" for="input01">评教阶段</label>
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
			language : 'zh-CN',
			weekStart : 1,
			todayBtn : 1,
			autoclose : 1,
			todayHighlight : 1,
			format : 'yyyy-mm-dd hh:ii',
			showMeridian : 1,
			pickerPosition: 'bottom-left'
		});
	</script>
	
	
	
</body>
</html>
