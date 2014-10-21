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
<%@ include file="head.jsp"%>
</head>
<body>
	<div id="login-page" class="container">
		<h1>滨江学院评教系统</h1>
		<form id="login-form" class="well" action="login" method="post">
			<input type="text" class="span2" placeholder="学工号" name="id"/><br /> 
			<input type="password" class="span2" placeholder="密码"  name="password"/>
			<br /> <i>学生账户默认密码为身份证后6位，x请小写</i>
			<i>老师账户用户名密码均为工资号，字母请小写</i>
			<label class="checkbox"> 
			  <!-- <input type="checkbox" name="nextCheck" />下次自动登录 -->
			</label>
			<button type="submit" class="btn btn-primary">登录</button>
			<button class="btn" data-toggle="modal" data-target="#forgotpassword">忘记密码</button>
			<a href="index">返回</a>
		</form>
	</div>

	<!-- 模态框（Modal） -->
	<div class="modal fade" id="forgotpassword" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
					<h4 class="modal-title" id="myModalLabel">忘记密码</h4>
				</div>
				<div class="modal-body">默认密码为身份证后6位，x请小写。<br/>学生账户请点击这里进行密码重置。<br />教师、管理员账户请联系教务处重置密码。</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭
					</button>
				</div>
			</div>
		</div>
	</div>
	<%@include file="foot.jsp"%>
</body>
</html>