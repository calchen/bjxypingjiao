<%@ page language="java" contentType="text/html; charset=utf-8"%> 
<!DOCTYPE html>
<!--[if lt IE 7 ]><html lang="zh-CN" class="ie6 ielt7 ielt8 ielt9"><![endif]-->
<!--[if IE 7 ]><html lang="zh-CN" class="ie7 ielt8 ielt9"><![endif]-->
<!--[if IE 8 ]><html lang="zh-CN" class="ie8 ielt9"><![endif]-->
<!--[if IE 9 ]><html lang="zh-CN" class="ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!-->
<html lang="zh-CN"><!--<![endif]-->
	<head>
		<%@ include file="head.jsp" %>
	</head>
	<body>
		<div class="container">
			<%@ include  file="top.jsp"%>
			<div class="row">
				<%@ include  file="left.jsp"%>
				<div class="span9">
					<h1>
						编辑个人信息
					</h1>
					<form id="edit-profile" class="form-horizontal">
						<fieldset>
							<legend>个人信息</legend>
							<div class="control-group">
								<label class="control-label" for="input01">姓名</label>
								<div class="controls">
									<input type="text" class="input-xlarge" id="input01" />
								</div>
							</div>
							<div class="control-group">
								<label class="control-label" for="input01">学号</label>
								<div class="controls">
									<input type="text" class="input-xlarge" id="input01"/>
								</div>
							</div>
							<div class="control-group">
								<label class="control-label" for="input01">电话</label>
								<div class="controls">
									<input type="text" class="input-xlarge" id="input01"/>
								</div>
							</div>
							<div class="control-group">
								<label class="control-label" for="input01">邮箱</label>
								<div class="controls">
									<input type="text" class="input-xlarge" id="input01" />
								</div>
							</div>					
							<div class="form-actions">
								<button type="submit" class="btn btn-primary">保存</button> <button class="btn">取消</button>
							</div>
						</fieldset>
					</form>
				</div>
			</div>
		</div>
	</body>
</html>
