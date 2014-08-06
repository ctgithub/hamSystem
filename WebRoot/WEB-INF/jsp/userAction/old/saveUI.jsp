<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  
  
  <body>
		<s:form action="user_add">
			姓名<s:textfield name="user.name"></s:textfield>
			登录名<s:textarea name="user.loginName"></s:textarea>
			<s:submit>提交</s:submit>
		</s:form>
  </body>
</html>
