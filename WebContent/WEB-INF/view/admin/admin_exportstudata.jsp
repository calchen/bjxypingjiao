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
</head>
<body>
	<div class="container">
		<%@ include file="../top.jsp"%>
		<div class="row">
			<%@ include file="../left.jsp"%>
			<div class="span9">
				<h1>学生数据导出</h1>
				<table class="table table-bordered table-striped">
					<thead>
						<tr>
							<th>学年</th>
							<th>学期</th>
							<th>年级</th>
							<th>专业</th>
							<th>操作</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>2013-2014</td>
							<td>第一学期</td>
							<td>2011级</td>
							<td>计科</td>
							<td><a href="#" class="view-link">下载</a></td>
						</tr>
						<tr>
							<td>2013-2014</td>
							<td>第一学期</td>
							<td>2011级</td>
							<td>计科</td>
							<td><a href="#" class="view-link">下载</a></td>
						</tr>
						<tr>
							<td>2013-2014</td>
							<td>第一学期</td>
							<td>2011级</td>
							<td>计科</td>
							<td><a href="#" class="view-link">下载</a></td>
						</tr>
						<tr>
							<td>2013-2014</td>
							<td>第一学期</td>
							<td>2011级</td>
							<td>计科</td>
							<td><a href="#" class="view-link">下载</a></td>
						</tr>
						<tr>
							<td>2013-2014</td>
							<td>第一学期</td>
							<td>2011级</td>
							<td>计科</td>
							<td><a href="#" class="view-link">下载</a></td>
						</tr>
						<tr>
							<td>2013-2014</td>
							<td>第一学期</td>
							<td>2011级</td>
							<td>计科</td>
							<td><a href="#" class="view-link">下载</a></td>
						</tr>
					</tbody>
				</table>
				<a class="toggle-link" href="#query-condition"><i
					class="icon-plus"></i>查询条件</a>
				<form id="query-condition" class="form-horizontal hidden">
					<fieldset>
						<legend>查询条件</legend>
						<div class="control-group">
							<label class="control-label" for="input01">学年</label>
							<div class="controls">
								<input type="text" class="input-xlarge" id="input01" />
							</div>
						</div>
						<div class="control-group">
							<label class="control-label" for="input01">学期</label>
							<div class="controls">
								<input type="text" class="input-xlarge" id="input01" />
							</div>
						</div>
						<div class="control-group">
							<label class="control-label" for="input01">年级</label>
							<div class="controls">
								<input type="text" class="input-xlarge" id="input01" />
							</div>
						</div>
						<div class="control-group">
							<label class="control-label" for="input01">专业</label>
							<div class="controls">
								<input type="text" class="input-xlarge" id="input01" />
							</div>
						</div>
						<div class="form-actions">
							<button type="submit" class="btn btn-primary">查询</button>
							<button class="btn">取消</button>
						</div>
					</fieldset>
				</form>
			</div>
		</div>
	</div>
</body>
</html>
