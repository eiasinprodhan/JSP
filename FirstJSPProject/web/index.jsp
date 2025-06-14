<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<title>Employee JSP Project</title>
<div class="container-fluid">
    <div id="carouselExampleIndicators" class="carousel slide">
        <div class="carousel-indicators">
            <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
            <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1" aria-label="Slide 2"></button>
            <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2" aria-label="Slide 3"></button>
        </div>
        <div class="carousel-inner">
            <div class="carousel-item active">
                <img src="https://img.freepik.com/free-photo/business-meeting-about-employment_53876-94801.jpg" style="height: 80vh" class="d-block w-100" alt="...">
            </div>
            <div class="carousel-item">
                <img src="https://img.freepik.com/premium-photo/silhouette-image-business-people-group-city-background_31965-26180.jpg" style="height: 80vh" class="d-block w-100" alt="...">
            </div>
            <div class="carousel-item">
                <img src="https://img.freepik.com/free-photo/business-recruitment-application_53876-94931.jpg" style="height: 80vh" class="d-block w-100" alt="...">
            </div>
        </div>
        <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="visually-hidden">Previous</span>
        </button>
        <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="visually-hidden">Next</span>
        </button>
    </div>
</div>
<%@include file="footer.jsp" %>
