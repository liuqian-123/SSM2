<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'address.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <div>${msg }</div>
  <form action="<%=path %>/address.action" method="post">
      账户:<select name="zh">
      <c:forEach items="${userList }" var="user">
      <option value="${user.id }"> ${user.userName }</option>
      </c:forEach>
      </select><br>
      地址:<textarea rows="5" cols="100" name="address"></textarea><br>
      是否默认:<input type="checkbox" value="1" name="isDefault"><br>
      备注:<textarea rows="5" cols="100" name="remark"></textarea><br>
      <input type="submit" value="提交"> 
      
      
  
  </form>
    
  </body>
</html>
