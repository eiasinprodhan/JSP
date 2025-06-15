<%@include file="header.jsp" %>
<title>Update Error | Employee JSP Project</title>
<div class="container my-3 px-0 border border-danger rounded">
    <div class="row my-3">
        <h3 class="text-danger text-center">Opps! Somthing went wrong!</h3>
        <p class="text-secondary text-center">Input fields are blank or email or phone number is already exist.</p>
        
        <div class="col-12-md d-flex justify-content-center aling-items-center ">
            <a href="employeelist.jsp">
                <button class="btn btn-danger my-3">Try again!</button>
            </a>
        </div>
    </div>
</div>
<%@include file="footer.jsp" %>
