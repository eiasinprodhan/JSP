<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean class="model.Student" id="student" />
<%@page import="dao.StudentDao" %>
<jsp:setProperty name="student" property="*" />

<%
    int result = StudentDao.saveStudent(student);
    if(result>0){
    response.sendRedirect("success.jsp");
    }
    else{
    response.sendRedirect("success.jsp");
    }
%>
