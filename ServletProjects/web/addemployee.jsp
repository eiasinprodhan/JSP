<title>Add Employee - EMS</title>
<%@include file="header.jsp" %>
<div class="conatiner-fluid px-3">
    <div class="container my-3 p-0 bg-warning border border-warning rounded">
        <h4 class="text-center my-3"><i class="fa-solid fa-user-plus"></i> Add Employee</h4>
        <div class="conatiner-fluid bg-light m-0 px-5 py-3">

            <form action="employeeservlet" method="post">
                <input type="hidden" name="action" value="save" />
                <div class="row">
                    <div class="col-md-6">
                        <div class="mb-3">
                            <label class="form-label">Name</label>
                            <input name="name" type="text" class="form-control" id="name" placeholder="Your name">
                        </div>
                        <div class="mb-3">
                            <label class="form-label">Email</label>
                            <input name="email" type="email" class="form-control" id="email" placeholder="Your email">
                        </div>
                        <div class="mb-3">
                            <label class="form-label">Phone</label>
                            <input name="phone" type="text" class="form-control" id="phone" placeholder="Your phone">
                        </div>
                    </div>

                    <div class="col-md-6">
                        <div class="mb-3">
                            <label class="form-label">Designation</label>
                            <select name="designation" class="form-select" id="designation">
                                <option value="null" selected>Choose Your Designation</option>
                                <option value="CEO">CEO</option>
                                <option value="Project Manager">Project Manager</option>
                                <option value="Senior Software Developer">Senior Software Developer</option>
                                <option value="Junior Software Developer">Junior Software Developer</option>
                                <option value="Intern Software Developer">Intern Software Developer</option>
                            </select>
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Salary</label>
                            <input name="salary" type="number" class="form-control" id="salary" placeholder="Your salary">
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Gender</label>
                            <div class="form-check">
                                <input name="gender" class="form-check-input" type="radio" id="gender" value="Male" checked>
                                <label class="form-check-label" for="radioDefault1">
                                    Male
                                </label>
                            </div>
                            <div class="form-check">
                                <input name="gender" class="form-check-input" type="radio" id="gender" value="Female">
                                <label class="form-check-label" for="radioDefault1">
                                    Female
                                </label>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row my-3">
                    <div class="col-md-4">
                    </div>
                    <div class="col-md-4 d-flex justify-content-center aling-items-center">
                        <button type="submit" class="btn btn-success mx-3">Save</button>
                        <button type="reset" class="btn btn-danger mx-3">Reset</button>
                    </div>
                    <div class="col-md-4">
                    </div>
                </div>
            </form>

        </div>
    </div>
</div>
<%@include file="footer.jsp" %>