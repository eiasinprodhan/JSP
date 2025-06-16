<%@page contentType="text/html" pageEncoding="UTF-8"%>
<title>Home - EMS</title>
<%@include file="header.jsp" %>
<div class="container-fluid mx-auto p-0">
    <div id="carouselExampleIndicators" class="carousel slide">
        <div class="carousel-indicators">
            <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
            <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1" aria-label="Slide 2"></button>
            <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2" aria-label="Slide 3"></button>
        </div>
        <div class="carousel-inner">
            <div class="carousel-item active">
                <img src="annie-spratt-XMpXzzWrJ6g-unsplash.jpg" class="d-block" style="height: 85vh; width: auto" alt="...">
            </div>
            <div class="carousel-item">
                <img src="mohammad-rahmani-W-LQbAUhE64-unsplash.jpg" class="d-block" style="height: 85vh; width: auto" alt="...">
            </div>
            <div class="carousel-item">
                <img src="sigmund-Fa9b57hffnM-unsplash.jpg" class="d-block" style="height: 85vh; width: auto" alt="...">
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
