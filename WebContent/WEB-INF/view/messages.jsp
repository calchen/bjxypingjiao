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
								test。。。。。。。。。。。。。
							</p>
							<span class="meta">Written <em>2 weeks ago</em> by <em>Jill</em></span>
						</li>
						<li class="well">
							<p class="message">
								Donec id consequat odio. Etiam felis tellus, pretium tincidunt malesuada quis, vestibulum a leo. Cras tortor enim, elementum nec pretium non, vestibulum sit amet massa. Vivamus non velit quis purus luctus pretium et ut quam. Aenean eu urna nulla, quis iaculis nunc. Nam consectetur erat nec turpis dapibus ac sodales dolor pulvinar. Fusce eu consectetur risus. In ut erat sit amet nunc tempor mattis sit amet id diam.
							</p>
							<span class="meta">Written <em>1 week ago</em> by <em>John</em></span>
						</li>
					</ul>
					<a class="toggle-link" href="#message-reply"><i class="icon-plus"></i> Reply</a>
					<form id="message-reply" class="form-horizontal hidden">
						<fieldset>
							<legend>Reply</legend>
							<div class="control-group">
								<label class="control-label" for="textarea">Message</label>
								<div class="controls">
									<textarea class="input-xlarge" id="textarea" rows="4"></textarea>
								</div>
							</div>
							<div class="form-actions">
								<button type="submit" class="btn btn-primary">Create</button> <button class="btn">Cancel</button>
							</div>
						</fieldset>
					</form>
				</div>
			</div>
		</div>
		<%@include file="foot.jsp"%>
	</body>
</html>
