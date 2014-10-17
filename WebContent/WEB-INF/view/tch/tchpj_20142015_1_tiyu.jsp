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
</head>
<body>
	<div class="container">
		<%@ include file="../top.jsp"%>
		<div class="row">
			<%@ include file="../left.jsp"%>
			<div class="span9">
				<h1>网上评教</h1>
				<h2>体育</h2>
				<form id="edit-profile" class="form-horizontal" action="">
					<fieldset>
						<table class="table table-bordered table-striped table-hover">
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
									<td>学生精力集中，遵守纪律，听从教师指导</td>
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
									<td>教师教态大方，言语准确，示范正确</td>
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
									<td>教师课堂准备充分，教学环节齐全</td>
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
									<td>教师合理利用场地，体育器材利用率高</td>
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
									<td>教师教学手段科学，方法多样，有创新性</td>
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
									<td>运动负荷量，练习密度合适</td>
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
									<td>教学效果良好，学生掌握锻炼方法，增强锻炼兴趣</td>
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
									<td>教师训练认真负责，练习积极参与，及时指导</td>
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
						<div class="form-control">
							<button type="submit" class="btn btn-primary">提交</button>
						</div>
					</fieldset>
				</form>
			</div>
		</div>
	</div>
</body>
</html>
