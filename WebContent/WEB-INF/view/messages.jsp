<%@ page language="java" contentType="text/html; charset=utf-8" import="java.util.*"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!--[if lt IE 7 ]><html lang="en" class="ie6 ielt7 ielt8 ielt9"><![endif]--><!--[if IE 7 ]><html lang="en" class="ie7 ielt8 ielt9"><![endif]--><!--[if IE 8 ]><html lang="en" class="ie8 ielt9"><![endif]--><!--[if IE 9 ]><html lang="en" class="ie9"> <![endif]--><!--[if (gt IE 9)|!(IE)]><!--> 
<html lang="en"><!--<![endif]--> 
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
						站内信
					</h1>
					<h2>
					</h2>
					<ul class="messages">
						<li class="well">
							<p class="message">
								程序猿很忙，这个功能再等等哈~
							</p>
							<span class="meta"><em>n天前</em>由<em>程序猿</em>发送</span>
						</li>
					</ul>
					<a class="toggle-link" href="#message-reply"><i class="icon-plus"></i> 发送</a>
					<form id="message-reply" class="form-horizontal hidden">
						<fieldset>
							<div class="control-group">
								<label class="control-label" for="textarea">收信人</label>
								<div class="controls">
									<input type="text" class="input-xlarge" placeholder="学工号" />
								</div>
							</div>
							<div class="control-group">
								<label class="control-label" for="textarea">内容</label>
								<div class="controls">
									<textarea class="input-xlarge" id="textarea" rows="4" placeholder="都说了很忙了！你还点开？" ></textarea>
								</div>
							</div>
							<div class="form-actions">
								<button type="submit" class="btn btn-primary">发送</button> <button class="btn">取消</button>
							</div>
						</fieldset>
					</form>
				</div>
			</div>
		</div>
		<%@include file="foot.jsp"%>
	</body>
</html>
