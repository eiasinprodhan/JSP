<%@ page import="dao.EmployeeDao" %>
<jsp:useBean id="e" class="model.Employee" />
<jsp:setProperty name="e" property="*" />

<%
    int status = EmployeeDao.saveEmployee(e);
    if (status > 0) {
        response.sendRedirect("success.jsp");
    } else {
        response.sendRedirect("error.jsp");
    }
%>
