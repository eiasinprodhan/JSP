<%@page import="model.Employee" %>
<%@page import="dao.EmployeeDao" %>

<%
    String id = request.getParameter("id");
    Employee e = EmployeeDao.getEmployeeById(Integer.parseInt(id));
%>

<%@include file="header.jsp" %>
<title>Update Employee | Employee JSP Project</title>

<div class="container my-3 p-0 bg-danger border border-danger rounded">
    <h3 class="text-center text-light my-2">Update Employee</h3>
    <div class="conatiner-fluid bg-light m-0 px-5 py-3">

        <form action="updateemployee.jsp" method="post">
            <div class="row">
                <div class="col-md-6">
                    <div class="mb-3">
                        <label class="form-label">ID</label>
                        <input name="id" type="hidden" id="id" value="<%=e.getId()%>">
                        <input type="text" class="form-control" value="<%=e.getId()%>" disabled>
                    </div>
                    <div class="mb-3">
                        <label class="form-label">Name</label>
                        <input name="name" type="text" class="form-control" id="name" value="<%=e.getName()%>" placeholder="Your name">
                    </div>
                    <div class="mb-3">
                        <label class="form-label">Email</label>
                        <input name="email" type="email" class="form-control" id="email" value="<%=e.getEmail()%>" placeholder="Your email">
                    </div>
                    <div class="mb-3">
                        <label class="form-label">Phone</label>
                        <input name="phone" type="text" class="form-control" id="phone" value="<%=e.getPhone()%>" placeholder="Your phone">
                    </div>
                </div>

                <div class="col-md-6">
                    <div class="mb-3">
                        <label class="form-label">Designation</label>
                        <select name="designation" class="form-select" id="designation">
                            <option value="CEO" <%= "CEO".equals(e.getDesignation()) ? "selected" : "" %>>CEO</option>
                            <option value="Project Manager" <%= "Project Manager".equals(e.getDesignation()) ? "selected" : "" %>>Project Manager</option>
                            <option value="Senior Software Developer" <%= "Senior Software Developer".equals(e.getDesignation()) ? "selected" : "" %>>Senior Software Developer</option>
                            <option value="Junior Software Developer" <%= "Junior Software Developer".equals(e.getDesignation()) ? "selected" : "" %>>Junior Software Developer</option>
                            <option value="Intern Software Developer" <%= "Intern Software Developer".equals(e.getDesignation()) ? "selected" : "" %>>Intern Software Developer</option>
                        </select>
                    </div>

                    <div class="mb-3">
                        <label class="form-label">Salary</label>
                        <input name="salary" type="number" class="form-control" id="salary" value="<%=e.getSalary()%>" placeholder="Your salary">
                    </div>

                    <div class="mb-3">
                        <label class="form-label">Gender</label>
                        <div class="form-check">
                            <input name="gender" class="form-check-input" type="radio" id="gender" value="Male" <%= "Male".equals(e.getGender()) ? "checked" : "" %> >
                            <label class="form-check-label" for="radioDefault1">
                                Male
                            </label>
                        </div>
                        <div class="form-check">
                            <input name="gender" class="form-check-input" type="radio" id="gender" value="Female" <%= "Female".equals(e.getGender()) ? "checked" : "" %>>
                            <label class="form-check-label" for="radioDefault1">
                                Female
                            </label>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row my-5">
                <div class="col-md-4">
                </div>
                <div class="col-md-4 d-flex justify-content-center aling-items-center">
                    <button type="submit" class="btn btn-success mx-3">Update</button>
                    <button type="reset" class="btn btn-danger mx-3">Reset</button>
                </div>
                <div class="col-md-4">
                </div>
            </div>
        </form>

    </div>
</div>
<%@include file="footer.jsp" %>
