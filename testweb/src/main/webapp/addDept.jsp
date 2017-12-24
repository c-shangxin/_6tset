<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: csx
  Date: 2017/12/24
  Time: 21:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>添加部门</h2>
<s:form method="POST" action="deptAction_addDept">
部门名称:<s:textfield name="dept.dname" />
    <s:submit value="添加" />
</s:form>
</body>
</html>
