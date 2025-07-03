<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Employee" %>

<%
    Employee e = (Employee) request.getAttribute("employee");
%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Edit Employee</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    </head>
    <body class="bg-light">
        <div class="container mt-5">
            <div class="row justify-content-center">
                <div class="col-md-6">
                    <div class="card shadow-sm">
                        <div class="card-body">
                            <h3 class="card-title text-center mb-4">Edit Employee</h3>
                            <form action="employeeservlet" method="post">
                                <input name="id" type="hidden" value="<%= e.getId() %>">
                                <input name="action" type="hidden" value="update">

                                <div class="mb-3">
                                    <label for="name" class="form-label">Name</label>
                                    <input name="name" type="text" id="name" class="form-control" 
                                           value="<%= e.getName() %>" placeholder="Enter name" required>
                                </div>

                                <div class="mb-3">
                                    <label for="designation" class="form-label">Designation</label>
                                    <select name="designation" class="form-select" id="designation">
                                        <option value="CEO" <%= "CEO".equals(e.getDesignation()) ? "selected" : "" %>>CEO</option>
                                        <option value="Project Manager" <%= "Project Manager".equals(e.getDesignation()) ? "selected" : "" %>>Project Manager</option>
                                        <option value="Senior Software Developer" <%= "Senior Software Developer".equals(e.getDesignation()) ? "selected" : "" %>>Senior Software Developer</option>
                                        <option value="Junior Software Developer" <%= "Junior Software Developer".equals(e.getDesignation()) ? "selected" : "" %>>Junior Software Developer</option>
                                        <option value="Intern Software Developer" <%= "Intern Software Developer".equals(e.getDesignation()) ? "selected" : "" %>>Intern Software Developer</option>
                                    </select>
                                </div>

                                <div class="mb-3">
                                    <label for="salary" class="form-label">Salary</label>
                                    <input name="salary" type="number" id="salary" class="form-control" 
                                           value="<%= e.getSalary() %>" placeholder="Enter salary" required>
                                </div>

                                <button type="submit" class="btn btn-primary w-100">Update Employee</button>
                            </form>
                            <div class="text-center mt-3">
                                <a href="index.jsp" class="text-decoration-none">← Back to Employee List</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
    </body>
</html>
