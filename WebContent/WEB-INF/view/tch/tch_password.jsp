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
<!-- 
<link href="css/strength-meter.css" rel="stylesheet"/>
<script src="js/strength-meter.js"></script>
<script src="js/strength-meter-zh-cn.js"></script> -->
</head>
<body>
	<div class="container">
		<%@ include file="../top.jsp"%>
		<div class="row">
			<%@ include file="../left.jsp"%>
			<div class="span9">
				<h1>修改密码</h1>
				<form id="edit-profile" class="form-horizontal">
					<fieldset>
						<legend>修改密码</legend>
						<div class="control-group">
							<label class="control-label" for="input01">旧密码</label>
							<div class="controls">
								<input type="password" class="input-xlarge" id="input01" />
							</div>
						</div>
						<div class="control-group">
							<label class="control-label" for="input01">新密码</label>
							<div class="controls">
								<input type="password" class=" input-xlarge"/>
							</div>
						</div>
						<div class="control-group">
							<label class="control-label" for="input01">再次确认密码</label>
							<div class="controls">
								<input type="password" class="input-xlarge" id="input01" />
							</div>
						</div>
						<div class="form-actions">
							<button type="submit" class="btn btn-primary">修改</button>
							<button class="btn">取消</button>
						</div>
					</fieldset>
				</form>
			</div>
		</div>
	</div>
</body>
</html>
