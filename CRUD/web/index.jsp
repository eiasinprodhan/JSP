<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="model.Employee" %>
<%@page import="dao.EmployeeDao" %>
<%@page import="java.util.*" %>

<%
    List<Employee> list = EmployeeDao.getAllEmployees();
    request.setAttribute("list", list);
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>All Employees List</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body class="bg-light">
        <div class="container py-5">
            <h2 class="text-center mb-4">All Employees List</h2>

            <div class="d-flex justify-content-end mb-3">
                <a href="addemployee.jsp" class="btn btn-warning text-dark">Add New Employee</a>
            </div>

            <table class="table table-bordered table-hover bg-white">
                <thead class="table-light">
                    <tr>
                        <th class="text-center">ID</th>
                        <th class="text-center">Name</th>
                        <th class="text-center">Designation</th>
                        <th class="text-center">Salary</th>
                        <th class="text-center">Action</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${list}" var="e">
                        <tr>
                            <td>${e.getId()}</td>
                            <td>${e.getName()}</td>
                            <td>${e.getDesignation()}</td>
                            <td>${e.getSalary()}</td>
                            <td>
                                <a href="employeeservlet?action=edit&id=${e.getId()}" class="btn btn-success btn-sm me-1">Edit</a>
                                <a href="employeeservlet?action=delete&id=${e.getId()}"
                                   onclick="return confirm('Are you sure you want to delete ${e.getName()}?')"
                                   class="btn btn-danger btn-sm">
                                    Delete
                                </a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
    </body>
</html>
