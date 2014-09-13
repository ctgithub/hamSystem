<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html>
<head>
    <title>健康档案列表</title>
    <%@ include file="/WEB-INF/jsp/public/commons.jspf" %>
</head>
<body>

<div id="Title_bar">
    <div id="Title_bar_Head"> 
        <div id="Title_Head"></div>
        <div id="Title"><!--页面标题-->
            <img border="0" width="13" height="13" src="${pageContext.request.contextPath}/style/images/title_arrow.gif"/> 健康档案管理
        </div>
        <div id="Title_End"></div>
    </div>
</div>

<div id="MainArea">
	<!-- 其他功能超链接 -->
    <div id="TableTail">
        <div id="TableTail_inside">
            <s:a action="archive_addUI"><img src="${pageContext.request.contextPath}/style/images/createNew.png" /></s:a>
        </div>
    </div>
    
    <table cellspacing="0" cellpadding="0" class="TableStyle">
       
        <!-- 表头-->
        <thead>
            <tr align=center valign=middle id=TableTitle>
                <td width="120">档案ID</td>
                <td width="100">姓名</td>
                <td width="30">性别</td>
                <td>年龄</td>
                <td>慢性疾病</td>
                <td>现住址</td>
                <td>电话</td>
                <td>录入员</td>
                <td>其他操作</td>
            </tr>
        </thead>
        
        <!--显示数据列表-->
        <tbody id="TableData" class="dataContainer" datakey="residentArchiveList">
        
        <s:iterator value="#residentArchiveList">
            <tr class="TableDetail1 template">
                <td width="120">${rsArchiveId}&nbsp;</td>
                <td>${name}&nbsp;</td>
                <td>${gender}&nbsp;</td>
                
                <td>${age}&nbsp;</td>
                <td>慢性疾病 &nbsp;</td>
                
                <td>${addressId}&nbsp;</td>
                <td>${phoneNumber}&nbsp;</td>
                <td>${doctor.name}&nbsp;</td>
                <td>
                	<s:a action="archive_editUI?id=%{id}">修改档案</s:a>
                	<s:a action="archive_delete?id=%{id}" onclick="return confirm('确定要删除吗？')">删除</s:a>
                	<s:a action="phyExam_archiveList?rsaId=%{id}">健康体检</s:a>
                </td>
            </tr>
        </s:iterator> 
            
        </tbody>
    </table>
    
    
</div>

</body>
</html>
