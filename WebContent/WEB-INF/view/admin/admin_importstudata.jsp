<%@ page language="java" contentType="text/html; charset=utf-8"%> 
<!DOCTYPE html>
<!--[if lt IE 7 ]><html lang="zh-CN" class="ie6 ielt7 ielt8 ielt9"><![endif]-->
<!--[if IE 7 ]><html lang="zh-CN" class="ie7 ielt8 ielt9"><![endif]-->
<!--[if IE 8 ]><html lang="zh-CN" class="ie8 ielt9"><![endif]-->
<!--[if IE 9 ]><html lang="zh-CN" class="ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!-->
<html lang="zh-CN"><!--<![endif]-->
	<head>
		<%@ include file="../head.jsp" %>
	</head>
	<body>
		<div class="container">
			<%@ include  file="../top.jsp"%>
			<div class="row">
				<%@ include  file="../left.jsp"%>
				<div class="span9">
					<h1>
						学生数据上传
					</h1>
					<ul class="files zebra-list">
						<li>
							<i class="icon-file"></i> <a class="title" href="#">2013-2014学年第一学期体育选课.xls</a> 
							<span class="meta">上传于 <em>2014年4月5日</em>上传者<em>张三</em></span>
						</li>
						<li>
							<i class="icon-file"></i> <a class="title" href="#">2013-2014学年第一学期英语选课.xls</a> 
							<span class="meta">上传于 <em>2014年4月5日</em>上传者<em>张三</em></span>
						</li>
						<li>
							<i class="icon-file"></i> <a class="title" href="#">2013-2014学年第一学期物理实验选课.xls</a> 
							<span class="meta">上传于 <em>2014年4月5日</em>上传者<em>张三</em></span>
						</li>
					</ul>
					<a class="toggle-link" href="#new-file"><i class="icon-plus"></i>上传文件</a>
					<form id="new-file" class="form-horizontal hidden">
						<fieldset>
							<legend>上传文件</legend>
							<div class="control-group">
								<label class="control-label" for="textarea">课程</label>
								<div class="controls">
									<select>
										<option>体育</option>
										<option>英语</option>
										<option>物理实验</option>
									</select>
								</div>
							</div>
							<div class="control-group">
								<label class="control-label" for="fileInput">文件</label>
								<div class="controls">
									<input class="input-file" id="fileInput" type="file" />
								</div>
							</div>
							<div class="form-actions">
								<button type="submit" class="btn btn-primary">上传</button> <button class="btn">取消</button>
							</div>
						</fieldset>
					</form>
				</div>
			</div>
		</div>
	</body>
</html>
