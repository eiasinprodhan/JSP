<title>Contact Us - EMS</title>
<%@include file="header.jsp" %>
<div class="conatiner-fluid px-3">
    <div class="container my-3 p-0 bg-warning border border-warning rounded">
        <h5 class="text-center my-3"><i class="fa-solid fa-phone"></i> Contact Us</h5>
        <div class="conatiner-fluid bg-light m-0 px-5 py-3">
            <div class="row">
                <div class="col-md-6">
                    <form>
                        <div class="mb-3">
                            <label for="name" class="form-label">Your Name</label>
                            <input type="text" class="form-control" id="name" placeholder="Full Name">
                        </div>
                        <div class="mb-3">
                            <label for="email" class="form-label">Email Address</label>
                            <input type="email" class="form-control" id="email" placeholder="name@example.com">
                        </div>
                        <div class="mb-3">
                            <label for="message" class="form-label">Message</label>
                            <textarea class="form-control" id="message" rows="4" placeholder="Your message..."></textarea>
                        </div>
                        <button type="submit" class="btn btn-warning">Send Message</button>
                    </form>
                </div>
                <div class="col-md-6">
                    <h5>EMS Company Inc.</h5>
                    <p>123 Business Avenue, Tech City, India</p>
                    <p><strong>Email:</strong> contact@ems.com</p>
                    <p><strong>Phone:</strong> +91-9876543210</p>
                </div>
            </div>
        </div>
    </div>
</div>
<%@include file="footer.jsp" %>