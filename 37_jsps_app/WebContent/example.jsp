<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP Implicit Objects Example</title>
</head>
<body>

<%-- Using the `out` object to write content to the response --%>
<h1>Implicit Objects Example</h1>
<p>
    <%
        out.println("Hello, this is a message from the JSP page.");
    %>
</p>

<%-- Using the `request` object to retrieve request parameters --%>
<p>
    <%
        String user = request.getParameter("username");
        if (user != null) {
            out.println("Hello, " + user + "!");
        } else {
            out.println("Hello, guest!");
        }
    %>
</p>

<%-- Using the `response` object to set content type and headers --%>
<%
    response.setContentType("text/html");
    response.setHeader("Custom-Header", "HeaderValue");
%>

<%-- Using the `config` object to retrieve initialization parameters --%>
<p>
    <%
        String initParamValue = config.getInitParameter("paramName");
        if (initParamValue != null) {
            out.println("Initialization parameter value: " + initParamValue);
        } else {
            out.println("Initialization parameter 'paramName' is not set.");
        }
    %>
</p>

</body>
</html>