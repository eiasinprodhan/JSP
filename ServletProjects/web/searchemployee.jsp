<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="model.Employee" %>
<%@page import="java.util.*" %>

<%
    List<Employee> list = (List) request.getAttribute("employee");
    request.setAttribute("list", list);
%>

<title>Search Employee - EMS</title>
<%@include file="header.jsp" %>

<div class="conatiner-fluid px-3">
    <div class="container my-3 p-0 bg-warning border border-warning rounded">
        <h5 class="text-center my-3"><i class="fa-solid fa-magnifying-glass"></i> Search Employee</h5>
        <div class="conatiner-fluid bg-light m-0 px-5 py-3">
            <form action="employeeservlet" method="post">
                <input type="hidden" name="action" value="search" />
                <div class="row">
                    <div class="col-md-12 d-flex flex-row justify-content-center align-items-center">
                        <input name="keyword" type="text" class="form-control" id="keyword" placeholder="Search employee..." style="width: 800px"> 
                    </div>  
                    <div class="col-md-12 d-flex flex-row justify-content-center align-items-center">
                        <button type="submit" class="btn btn-warning my-3" onclick="document.getElementById('searchresult').style.display = 'block'">Search</button>
                    </div>  
                </div>
        </div>
        </form>
    </div>

    <div class="container bg-warning my-3 px-0 border border-warning rounded"'>
        <h5 class="text-center my-3"><i class="fa-solid fa-user"></i> Search Result</h5>
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

    <%@include file="footer.jsp" %>