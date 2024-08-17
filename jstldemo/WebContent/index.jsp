<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSTL Demo</title>
</head>
<body>
<c:out value = "Neha"></c:out>
<c:set var = "name" scope ="session" value ="Neha"></c:set>
<c:out value ="${name}"></c:out>
<c:import url ="NewFile.jsp"></c:import>

<c:set var="number" value="4" />

<c:out value="${number}" />

<c:if test="${number % 2 == 0}">
  <c:out value="Even" />
</c:if>


</body>
</html>