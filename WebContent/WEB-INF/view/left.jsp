<%@ page language="java" contentType="text/html; charset=utf-8" import="java.util.*"%>

<%@ taglib prefix="s" uri="/struts-tags"%>

<s:if test="#session['login_user_level']==2">
  <%@ include file="tch/left_tch.jsp"%>
</s:if>
<s:elseif test="#session['login_user_level']==4">
  <%@ include file="admin/left_admin.jsp"%>
</s:elseif>
<s:elseif test="#session['login_user_level']==1||#session['login_user_level']==null">
  <%@ include file="stu/left_stu.jsp"%>
</s:elseif>