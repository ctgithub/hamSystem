<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  
  
  <body>
  	<s:iterator value="#roleList">
  		<s:property value="id"/>
  		<s:property value="name"/>
  		<s:property value="description"/>
  		<s:a action="role_delete?id=%{id}" >删除</s:a>
  		<s:a action="role_editUI?id=%{id}">修改</s:a>
  		<br/>
  	</s:iterator>
  	<s:a action="role_addUI">添加</s:a>
  </body>
</html>
