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
				<h2>物理实验</h2>
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
									<td>为人师表，严格管理和要求学生</td>
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
									<td>备课充足，讲解耐心</td>
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
									<td>教学任务明确，目标清晰</td>
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
									<td>实验演示动作规范，操作熟练</td>
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
									<td>实验器材维护良好，使用合理，布置有序</td>
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
									<td>着重培养学生动手能力，分析能力，解决问题能力</td>
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
									<td>指导及时，认真答疑</td>
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
									<td>实验课时安排合理，计划性强</td>
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
									<td>学生参与度高，课堂气氛良好</td>
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
