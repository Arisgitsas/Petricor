<%--
  Created by IntelliJ IDEA.
  User: arisg
  Date: 6/1/2021
  Time: 3:54 PM
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

  <title>Login #4</title>
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
              <h3>Login to <strong>Petricor</strong></h3>
              <p>Experience high tech online shopping</p>
              <!-- <p class="mb-4">Lorem ipsum dolor sit amet elit. Sapiente sit aut eos consectetur adipisicing.</p> -->
            </div>
            <form  method="post" action="${pageContext.request.contextPath}/Login">
              <div class="form-group first">
                <label for="id">E-mail</label>
                <input type="text" class="form-control" placeholder="your-email@gmail.com" name= "id" id="id" pattern="[A-Za-z0-9]+">
              </div>
              <div class="form-group last mb-3">
                <label for="id">Password</label>
                <input type ="password" class="form-control" placeholder="Password" name = "password" pattern="[A-Za-z0-9]+">
              </div>

              <input type="submit" value="Login" class="btn btn-block btn-primary">
              <p>


              </p>
              <p>  If not registered click the button below</p>
              <input type="submit" value="Sign Up" class="btn btn-block btn-primary" onclick="document.forms[0].action = 'register.jsp'; return true;" >

            </form>
          </div>
        </div>
      </div>
    </div>
  </div>


</div>



<script src="js/jquery-3.3.1.min.js"></script>
<script src="js/popper.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/main.js"></script>
</body>
</html>

