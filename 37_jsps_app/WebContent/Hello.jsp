<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Date" %>
<%@ include file = "insert.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<b> This is JSP demo</b>
<%-- Scriplet tag --%>
<%

Date date = new Date();
out.print(date);

%>
<%-- Expression tag --%>
<b><%= new java.util.Date() %></b>
<br>
<br>

<%-- Declaration tag --%>
<%! String message = "WELcome!!!!!"; %>
<b><h1><%= message %></b></h1>



<% 
    out.println("Hello, this is a message from the JSP page."); 
%>


<%
    String user = request.getParameter("username");
    if (user != null) {
        out.println("Hello, " + user + "!");
    } else {
        out.println("Hello, guest!");
    }
%>


<%
    response.setContentType("text/html");
    response.setHeader("Custom-Header", "Value");
%>


<%
    String initParamValue = config.getInitParameter("paramName");
    out.println("Initialization parameter value: " + initParamValue);
%>

</body>
</html>