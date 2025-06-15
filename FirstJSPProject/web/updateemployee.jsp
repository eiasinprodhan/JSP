<jsp:useBean class="model.Employee"  id="e" />
<%@page  import="dao.EmployeeDao" %>
<jsp:setProperty  name="e" property="*" />

<%
        
        int status = EmployeeDao.updateEmployee(e);
        if(status > 0){
             response.sendRedirect("update.jsp");
    
            }
            else{
            response.sendRedirect("errorupdate.jsp");
    }


%>