<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="model.Employee" %>
<%@page import="dao.EmployeeDao" %>
<%@page import="java.util.*" %>

<%
    List<Employee> list = EmployeeDao.getAllEmployees();
    request.setAttribute("list", list);
%>

<title>All Employees - EMS</title>
<%@include file="header.jsp" %>
<div class="conatiner-fluid px-3">
    <div class="container bg-warning my-3 px-0 border border-warning rounded">
        <h4 class="text-center my-3"><i class="fa-solid fa-users"></i> All Employees</h4>
        <div class="table-responsive">
            <table class="table table-light table-striped my-0">
                <thead>
                    <tr>
                        <th class="text-center">ID</th>
                        <th class="text-center">Name</th>
                        <th class="text-center">Email</th>
                        <th class="text-center">Phone</th>
                        <th class="text-center">Gender</th>
                        <th class="text-center">Designation</th>
                        <th class="text-center">Salary</th>
                        <th class="text-center">Action</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${list}" var="e">
                        <tr>
                            <td class="text-center">${e.getId()}</td>
                            <td class="text-center">${e.getName()}</td>
                            <td class="text-center">${e.getEmail()}</td>
                            <td class="text-center">${e.getPhone()}</td>
                            <td class="text-center">${e.getGender()}</td>
                            <td class="text-center">${e.getDesignation()}</td>
                            <td class="text-center">${e.getSalary()}</td>
                            <td class="text-center">
                                <a href="employeeservlet?action=edit&id=${e.getId()}"><button class="btn btn-success btn-sm mx-1 my-1">Edit</button></a>
                                <a href="employeeservlet?action=delete&id=${e.getId()}"><button class="btn btn-danger btn-sm mx-1 my-1" onclick="return confirm('Are you really want to delete ${e.getName()} details?')">Delete</button></a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
<%@include file="footer.jsp" %>