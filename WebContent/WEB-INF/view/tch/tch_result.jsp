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
						评教记录
					</h1>
					<table class="table table-bordered table-striped">
						<thead>
							<tr>
								<th>
									学年
								</th>
								<th>
									学期
								</th>
								<th>
									课程
								</th>
								<th>
									操作
								</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>
									2013-2014学年
								</td>
								<td>
									第一学期
								</td>
								<td>
									体育
								</td>
								<td>
									<a class="toggle-link" href="pingjiao20131tiyu.jsp"><i class="icon-pencil"></i> 修改</a>
									
								</td>
							</tr>
							<tr>
								<td>
									2013-2014学年
								</td>
								<td>
									第一学期
								</td>
								<td>
									英语
								</td>
								<td>
									<a class="toggle-link" href="#"><i class="icon-eye-open"></i> 查看</a>
								</td>
							</tr>							
							<tr>
								<td>
									2013-2014学年
								</td>
								<td>
									第一学期
								</td>
								<td>
									物理实验
								</td>
								<td>
									<a class="toggle-link" href="#"><i class="icon-eye-open"></i> 查看</a>
								</td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</body>
</html>
