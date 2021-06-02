<%--
  Created by IntelliJ IDEA.
  User: arisg
  Date: 6/1/2021
  Time: 4:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link href="https://fonts.googleapis.com/css?family=Roboto:300,400&display=swap" rel="stylesheet">

    <link rel="stylesheet" href="fonts/icomoon/style.css">

    <link rel="stylesheet" href="css/owl.carousel.min.css">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css">

    <!-- Style -->
    <link rel="stylesheet" href="css/style.css">

    <title>Register #4</title>
</head>
<body>

<div class="d-md-flex half">
    <div class="bg" style="background-image: url('images/natural-cosmetics-fragrance-lemon-orange.jpg');"></div>
    <div class="contents">

        <div class="container">
            <div class="row align-items-center justify-content-center">
                <div class="col-md-12">
                    <div class="form-block mx-auto">
                        <div class="text-center mb-5">
                            <h3>Register in the form below</h3>
                            <p>Experience high tech online shopping</p>
                            <!-- <p class="mb-4">Lorem ipsum dolor sit amet elit. Sapiente sit aut eos consectetur adipisicing.</p> -->
                        </div>
<form action="${pageContext.request.contextPath}/Registers" method="post">

    <div class="form-group first">
        <label>First Name</label>
        <input type="text" class="form-control" placeholder="Name" name="name">
    </div>
    <div class="form-group first">
        <label>Surname</label>
        <input type="text" class="form-control" placeholder="Surname" name="surname">
    </div>
    <div class="form-group first">
        <label>Age</label>
        <input type="text" class="form-control" placeholder="99" name="age">
    </div>
    <div class="form-group first">
        <label>Sex</label>
        <input type="text" class="form-control" placeholder="male/female" name="sex">
    </div>
    <div class="form-group first">
        <label>E-mail</label>
        <input type="email" class="form-control" placeholder="yourmail@example.com" name="email">
    </div>
    <div class="form-group last mb-3">
        <label>Password</label>
        <input type="password" class="form-control" placeholder="Your Password" name="password">
    </div>
  <!--  <div class="form-group last mb-3">
        <label>Re-type password</label>
        <input type="password" class="form-control" placeholder="Your Password" name="password2">
    </div>
-->


    <input type="submit" value="Register" class="btn btn-block btn-primary">

</form>
</body>
</html>
