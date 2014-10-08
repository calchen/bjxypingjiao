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
<style type="text/css">
select {
	width: 110px;
}
</style>
</head>
<body>
	<div class="container">
		<%@ include file="top.jsp"%>
		<div class="row">
			<%@ include file="left.jsp"%>
			<div class="span9">
				<h1>网上评教</h1>
				<h2>英语</h2>
				<form id="edit-profile" class="form-horizontal">
					<fieldset>
						<table class="table table-bordered table-striped">
							<thead>
								<tr>
									<th>评分指标</th>
									<th>分数(0-10分)</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>学生学习兴趣浓厚，学习积极性高</td>
									<td><select>
											<option>0分</option>
											<option>1分</option>
											<option>2分</option>
											<option>3分</option>
											<option>4分</option>
											<option>5分</option>
											<option>6分</option>
											<option>7分</option>
											<option>8分</option>
											<option>9分</option>
											<option>10分</option>
									</select></td>
								</tr>
								<tr>
									<td>学生独立完成作业，课堂学习效率高，较好掌握讲授的知识</td>
									<td><select>
											<option>0分</option>
											<option>1分</option>
											<option>2分</option>
											<option>3分</option>
											<option>4分</option>
											<option>5分</option>
											<option>6分</option>
											<option>7分</option>
											<option>8分</option>
											<option>9分</option>
											<option>10分</option>
									</select></td>
								</tr>
								<tr>
									<td>教师教态大方，关心学生，讲课有激情</td>
									<td><select>
											<option>0分</option>
											<option>1分</option>
											<option>2分</option>
											<option>3分</option>
											<option>4分</option>
											<option>5分</option>
											<option>6分</option>
											<option>7分</option>
											<option>8分</option>
											<option>9分</option>
											<option>10分</option>
									</select></td>
								</tr>
								<tr>
									<td>教师开拓学生思维，指导学习方法</td>
									<td><select>
											<option>0分</option>
											<option>1分</option>
											<option>2分</option>
											<option>3分</option>
											<option>4分</option>
											<option>5分</option>
											<option>6分</option>
											<option>7分</option>
											<option>8分</option>
											<option>9分</option>
											<option>10分</option>
									</select></td>
								</tr>
								<tr>
									<td>教师讲课内容充实，重、难点突出，理论联系实际</td>
									<td><select>
											<option>0分</option>
											<option>1分</option>
											<option>2分</option>
											<option>3分</option>
											<option>4分</option>
											<option>5分</option>
											<option>6分</option>
											<option>7分</option>
											<option>8分</option>
											<option>9分</option>
											<option>10分</option>
									</select></td>
								</tr>
								<tr>
									<td>教师讲课有适当的深度和广度，介绍本课程的学术前沿</td>
									<td><select>
											<option>0分</option>
											<option>1分</option>
											<option>2分</option>
											<option>3分</option>
											<option>4分</option>
											<option>5分</option>
											<option>6分</option>
											<option>7分</option>
											<option>8分</option>
											<option>9分</option>
											<option>10分</option>
									</select></td>
								</tr>
								<tr>
									<td>教师治学严谨，言传身教</td>
									<td><select>
											<option>0分</option>
											<option>1分</option>
											<option>2分</option>
											<option>3分</option>
											<option>4分</option>
											<option>5分</option>
											<option>6分</option>
											<option>7分</option>
											<option>8分</option>
											<option>9分</option>
											<option>10分</option>
									</select></td>
								</tr>
								<tr>
									<td>教师认真批改作业并讲解作业，适时安排答疑</td>
									<td><select>
											<option>0分</option>
											<option>1分</option>
											<option>2分</option>
											<option>3分</option>
											<option>4分</option>
											<option>5分</option>
											<option>6分</option>
											<option>7分</option>
											<option>8分</option>
											<option>9分</option>
											<option>10分</option>
									</select></td>
								</tr>
								<tr>
									<td>教师讲课思路清晰，阐述准确，注重师生交流</td>
									<td><select>
											<option>0分</option>
											<option>1分</option>
											<option>2分</option>
											<option>3分</option>
											<option>4分</option>
											<option>5分</option>
											<option>6分</option>
											<option>7分</option>
											<option>8分</option>
											<option>9分</option>
											<option>10分</option>
									</select></td>
								</tr>
								<tr>
									<td>教师讲课有自己的风格、特色，深受学生喜爱</td>
									<td><select>
											<option>0分</option>
											<option>1分</option>
											<option>2分</option>
											<option>3分</option>
											<option>4分</option>
											<option>5分</option>
											<option>6分</option>
											<option>7分</option>
											<option>8分</option>
											<option>9分</option>
											<option>10分</option>
									</select></td>
								</tr>
							</tbody>
						</table>
						<div class="form-actions">
							<button type="submit" class="btn btn-primary">提交</button>
						</div>
					</fieldset>
				</form>
			</div>
		</div>
	</div>
</body>
</html>
