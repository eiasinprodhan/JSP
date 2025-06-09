<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Student</title>
    </head>
    <body>
        <form action="savestudent.jsp" method="post">
            <label>Name</label>
            <br/>
            <input name="name" id="name" type="text">
            
            <br/>
            <label>Email</label>
            <br/>
            <input name="email" id="email" type="email">
            
            <br/>
            <label>Fee</label>
            <br/>
            <input name="fee" id="fee" type="text">
            
            <br/>
            <br/>
            <br/>
            
            <input type="submit" value="Save">
            
        </form>
    </body>
</html>
