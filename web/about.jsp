<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<!-- Basic -->

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <!-- Mobile Metas -->
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Site Metas -->
    <title>Petricor</title>
    <meta name="keywords" content="">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- Site Icons -->
    <link rel="shortcut icon" href="imageshop/favicon.ico" type="image/x-icon">
    <link rel="apple-touch-icon" href="imageshop/apple-touch-icon.png">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="cssshop/bootstrap.min.css">
    <!-- Site CSS -->
    <link rel="stylesheet" href="cssshop/style.css">
    <!-- Responsive CSS -->
    <link rel="stylesheet" href="cssshop/responsive.css">
    <!-- Custom CSS -->
    <link rel="stylesheet" href="cssshop/custom.css">

    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

<!-- Start Main Top -->
<header class="main-header">
    <!-- Start Navigation -->
    <nav class="navbar navbar-expand-lg navbar-light bg-light navbar-default bootsnav">
        <div class="container">
            <!-- Start Header Navigation -->
            <div class="navbar-header">
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbar-menu" aria-controls="navbars-rs-food" aria-expanded="false" aria-label="Toggle navigation">
                    <i class="fa fa-bars"></i>
                </button>
                <a class="navbar-brand" href="indexshop.jsp"><img src="imageshop/logo1.png" style= "width:225px; height:145px; class="logo" alt=""></a>
            </div>
            <!-- End Header Navigation -->

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="navbar-menu">
                <ul class="nav navbar-nav ml-auto" data-in="fadeInDown" data-out="fadeOutUp">
                    <li class="nav-item active"><a class="nav-link" href="maiiin.jsp">Petricor</a></li>
                    <li class="nav-item"><a class="nav-link" href="about.jsp">Πληροφοριες</a></li>
                    <li class="dropdown">
                        <a href="#" class="nav-link dropdown-toggle arrow" data-toggle="dropdown">Αγορα</a>
                        <ul class="dropdown-menu">
                            <li><a href="shopping.jsp">Προϊοντα</a></li>
                            <li><a href="cart.jsp">Το καλάθι μου</a></li>
                            <li><a href="checkout.jsp">Πληρωμή</a></li>
                            <li><a href="wishlist.jsp">Αγαπημένα</a></li>
                        </ul>
                    </li>
                    <li class="nav-item"><a class="nav-link" href="contactus.jsp">Επικοινωνια</a></li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->

            <!-- Start Atribute Navigation -->
            <div class="attr-nav">
                <ul>
                    <li class="search"><a href="#"><i class="fa fa-search"></i></a></li>
                    <li class="side-menu">
                        <a href="#">
                            <i class="fa fa-shopping-bag"></i>
                            <span class="badge">3</span>
                            <p>Το καλάθι μου</p>
                        </a>
                    </li>
                </ul>
            </div>
            <!-- End Atribute Navigation -->
        </div>
        <!-- Start Side Menu -->
        <div class="side">
            <a href="#" class="close-side"><i class="fa fa-times"></i></a>
            <li class="cart-box">
                <ul class="cart-list">
                    <li>
                        <a href="#" class="photo"><img src="imageshop/img-pro-01.jpg" class="cart-thumb" alt="" /></a>
                        <h6><a href="#">Delica omtantur </a></h6>
                        <p>1x - <span class="price">$80.00</span></p>
                    </li>
                    <li>
                        <a href="#" class="photo"><img src="imageshop/img-pro-02.jpg" class="cart-thumb" alt="" /></a>
                        <h6><a href="#">Omnes ocurreret</a></h6>
                        <p>1x - <span class="price">$60.00</span></p>
                    </li>
                    <li>
                        <a href="#" class="photo"><img src="imageshop/img-pro-03.jpg" class="cart-thumb" alt="" /></a>
                        <h6><a href="#">Agam facilisis</a></h6>
                        <p>1x - <span class="price">$40.00</span></p>
                    </li>
                    <li class="total">
                        <a href="#" class="btn btn-default hvr-hover btn-cart">VIEW CART</a>
                        <span class="float-right"><strong>Total</strong>: $180.00</span>
                    </li>
                </ul>
            </li>
        </div>
        <!-- End Side Menu -->
    </nav>
    <!-- End Navigation -->
</header>
<!-- End Main Top -->

<!-- Start Top Search -->
<div class="top-search">
    <div class="container">
        <div class="input-group">
            <span class="input-group-addon"><i class="fa fa-search"></i></span>
            <input type="text" class="form-control" placeholder="Search">
            <span class="input-group-addon close-search"><i class="fa fa-times"></i></span>
        </div>
    </div>
</div>
<!-- End Top Search -->
<!-- Start All Title Box -->
<div class="all-title-box">
    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                <h2>ABOUT US</h2>
                <ul class="breadcrumb">
                    <li class="breadcrumb-item"><a href="#">Home</a></li>
                    <li class="breadcrumb-item active">ABOUT US</li>
                </ul>
            </div>
        </div>
    </div>
</div>
<!-- End All Title Box -->

<!-- Start About Page  -->
<div class="about-box-main">
    <div class="container">
        <div class="row">
            <div class="col-lg-6">
                <div class="banner-frame"> <img class="img-fluid" src="imageshop/about-img.jpg" alt="" />
                </div>
            </div>
            <div class="col-lg-6">
                <h2 class="noo-sh-title-top">Η ομάδα μας, <span>Petricor</span></h2>
                <p>Η Petricor είναι η δημιουργική έκφραση της ομάδας μας. Γεννήθηκε το 2021 απο τον Άρη και την Χαρά, τελειόφοιτους φοιτητές του τμήματος Πληροφορικής του Πανεπιστημίου Πειραιώς. Αυτό που ξεκίνησε ως μία εργασία για το μάθημα "Ηλεκτρονικό Επιχειρείν και Καινοτομία" του 8ου Εξαμήνου, οδήγησε σε ένα πολύ όμορφο ταξίδι εξερεύνησης και εξέλιξης.<br><h2>Πρόθεσή μας</h2>Πρόθεσή μας είναι η σύνδεση με τον εαυτό μας, τη φύση, τον κόσμο γύρω μας και η δημιουργία μακιγιάζ. Δημιουργούμε μια κοινότητα ομορφιάς, ένα ασφαλές μέρος, στο οποίο όλοι εκφράζουμε ελεύθερα την ομορφιά που ήδη έχουμε και βγάζουμε προς τα έξω, αγαπάμε και φροντίζουμε το σώμα μας.<br><br>
                <h2>Beauty In Greece</h2>
                Οι σειρές των προϊόντων μας έχουν εμπνευστεί από την Ελλάδα και τους θησαυρούς της. Κάθε σειρά έχει για όνομα της ένα μέρος της Ελλάδος όπως η Syros, και η Acheron. Οι φωτογραφίσεις των προϊόντων μας γίνονται στο αντίστοιχο μέρος. Υπάρχει μάλιστα ένα challenge για εσάς. Όποιος αγοράζει για παράδειγμα ένα προϊόν από την σειρά Σύρος καλείται να βγάλει μια φωτογραφία με αυτό στη Σύρο και να μας το στείλει. Στόχος μας είναι να βρούμε νέα πρόσωπα, διαφορετικά, νεανικά, με σημάδια, αψεγάδιαστα ή με ακμή. Εσείς οι ίδιοι οι πελάτες θα έχετε την ευκαιρία να γινέτε και τα μοντέλα μας. <br><h3>#Bonus</h2>Στο τέλος του μήνα, το 3% των εσόδων δίνεται για την φροντίδα της περιοχής που έχει την περισσότερη απήχηση.(πχ Αν συγκεντρώσουμε από τα Ioannina 80 φωτογραφίες και από το Rethymno 25, τότε τα χρήματα θα διατεθούν για την ανάδειξη των Ιωαννίνων) <br><br>
                <h2>Beauty In Art</h2>Challenge #2 <br>Επίσης, για κάθε προϊόν, διοργανώνουμε και διαγωνισμό ζωγραφικής. Σκοπός είναι η καλλιτεχνική επιμέλεια του προϊόντος. Όποιo1 κερδίσει, θα σχεδιάσει την συσκευασία του προϊόντος και θα αμοιφθεί.<br><br><h2>Τα προϊόντα μας</h2>Πρόκειται για καλλυντικά προϊόντα 100% βιολογικά, που απευθύνονται στο νεανικό κοινό αφού στοχεύουν στην ενυδάτωση και την ήπια επανορθωτική δράση σε ανερχόμενες βλάβες. Με βάση τους φυσικές πρώτες ύλες, υπόσχονται ανάλαφρο αποτέλεσμα, υψηλή απόδοση και μεγάλη διάρκεια.<br>
                Τα προϊόντα μας προσφέρονται για τις παρακάτω χρήσεις:<br>
                1.	Καταπολέμηση της ακμής<br>
                2.	Περιποίηση προσώπου<br>
                3.	Περιποίηση σώματος<br>
                4.	Περιποίηση μαλλιών<br>
                5.	Καλλυντικά<br>
                6.	Αντηλιακή προστασία<br>
                <h2>Οφέλη για το Περιβάλλον</h2>
                •	Ανακυκλώσιμες συσκευασίες<br>
                •	Υπεύθυνη διαχείριση των αποβλήτων και των υπολειμμάτων κατά την παραγωγή/συσκευασία<br>
                •	Μείωση κατανάλωσης ηλεκτρικής ενέργειας και καυσίμων<br>
                •	Οικολογικός σχεδιασμός προϊόντος<br>
                •	Δεν δοκιμάζονται σε ζώα<br>
                </p>
                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
                <a class="btn hvr-hover" href="#">Read More</a>
            </div>
        </div>
        <div class="row my-5">
            <div class="col-sm-6 col-lg-4">
                <div class="service-block-inner">
                    <h3>We are Trusted</h3>
                    <p>Πιστοποίηση από γιατρούς και άλλους φορείς. </p>
                </div>
            </div>
            <div class="col-sm-6 col-lg-4">
                <div class="service-block-inner">
                    <h3>We are Professional</h3>
                    <p>Υποσχόμαστε και Ικανοποιούμε τα εξής:<br>
                        1.	Ποιότητα<br>
                        2.	Οικολογική Συνείδηση<br>
                        3.	Αξιοπιστία<br>
                    </p>
                </div>
            </div>
            <div class="col-sm-6 col-lg-4">
                <div class="service-block-inner">
                    <h3>We are Expert</h3>
                    <p>Άριστα καταρτισμένο προσωπικό, φαρμακοποιοί, χημικοί, βοτανολόγοι, δερματολόγοι, αγρότες.</p>
                </div>
            </div>
        </div>
        <hr class="my-0"> </div>
</div>

<!-- End About Page -->
<!-- Start Footer  -->
<footer>
    <div class="footer-main">
        <div class="container">
            <div class="row">
                <div class="col-lg-4 col-md-12 col-sm-12">
                    <div class="footer-top-box">
                        <h3>Business Time</h3>
                        <ul class="list-time">
                            <li>Monday - Friday: 08.00am to 05.00pm</li> <li>Saturday: 10.00am to 08.00pm</li> <li>Sunday: <span>Closed</span></li>
                        </ul>
                    </div>
                </div>
                <div class="col-lg-4 col-md-12 col-sm-12">
                    <div class="footer-top-box">
                        <h3>Newsletter</h3>
                        <form class="newsletter-box">
                            <div class="form-group">
                                <input class="" type="email" name="Email" placeholder="Email Address*" />
                                <i class="fa fa-envelope"></i>
                            </div>
                            <button class="btn hvr-hover" type="submit">Submit</button>
                        </form>
                    </div>
                </div>
                <div class="col-lg-4 col-md-12 col-sm-12">
                    <div class="footer-top-box">
                        <h3>Social Media</h3>
                        <p>Find us on Instagram @petricor.</p>
                        <ul>
                            <li><a href="#"><i class="fab fa-facebook" aria-hidden="true"></i></a></li>
                            <li><a href="#"><i class="fab fa-twitter" aria-hidden="true"></i></a></li>
                            <li><a href="#"><i class="fab fa-linkedin" aria-hidden="true"></i></a></li>
                            <li><a href="#"><i class="fab fa-google-plus" aria-hidden="true"></i></a></li>
                            <li><a href="#"><i class="fa fa-rss" aria-hidden="true"></i></a></li>
                            <li><a href="#"><i class="fab fa-pinterest-p" aria-hidden="true"></i></a></li>
                            <li><a href="#"><i class="fab fa-whatsapp" aria-hidden="true"></i></a></li>
                        </ul>
                    </div>
                </div>
            </div>
            <hr>
            <div class="row">
                <div class="col-lg-4 col-md-12 col-sm-12">
                    <div class="footer-widget">
                        <h4>About Petricor</h4>
                        <p>Kαλλυντικά προϊόντα 100% βιολογικά, που απευθύνονται στο νεανικό κοινό αφού στοχεύουν στην ενυδάτωση και την ήπια επανορθωτική δράση, σε ανερχόμενες βλάβες. Με βάση τους φυσικές πρώτες ύλες, υπόσχονται ανάλαφρο αποτέλεσμα, υψηλή απόδοση και μεγάλη διάρκεια..</p>
                        <p>Καταπολέμηση της ακμής, Περιποίηση προσώπου, Περιποίηση σώματος, Περιποίηση μαλλιών, Καλλυντικά, Αντηλιακή προστασία</p>
                    </div>
                </div>
                <div class="col-lg-4 col-md-12 col-sm-12">
                    <div class="footer-link">
                        <h4>Information</h4>
                        <ul>
                            <li><a href="#">About Us</a></li>
                            <li><a href="#">Customer Service</a></li>
                            <li><a href="#">Our Sitemap</a></li>
                            <li><a href="#">Terms &amp; Conditions</a></li>
                            <li><a href="#">Privacy Policy</a></li>
                            <li><a href="#">Delivery Information</a></li>
                        </ul>
                    </div>
                </div>
                <div class="col-lg-4 col-md-12 col-sm-12">
                    <div class="footer-link-contact">
                        <h4>Contact Us</h4>
                        <ul>
                            <li>
                                <p><i class="fas fa-map-marker-alt"></i>Address: Fragkopoyloy 46, <br>Athens,<br>TK 11525 </p>
                            </li>
                            <li>
                                <p><i class="fas fa-phone-square"></i>Phone: <a href="tel:+1-888705770">2106775632</a></p>
                            </li>
                            <li>
                                <p><i class="fas fa-envelope"></i>Email: <a href="mailto:contactinfo@gmail.com">petricor@gmail.com</a></p>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
</footer>
<!-- End Footer  -->

<a href="#" id="back-to-top" title="Back to top" style="display: none;">&uarr;</a>

<!-- ALL JS FILES -->
<script src="jsshop/jquery-3.2.1.min.js"></script>
<script src="jsshop/popper.min.js"></script>
<script src="jsshop/bootstrap.min.js"></script>
<!-- ALL PLUGINS -->
<script src="jsshop/jquery.superslides.min.js"></script>
<script src="jsshop/bootstrap-select.js"></script>
<script src="jsshop/inewsticker.js"></script>
<script src="jsshop/bootsnav.js."></script>
<script src="jsshop/images-loded.min.js"></script>
<script src="jsshop/isotope.min.js"></script>
<script src="jsshop/owl.carousel.min.js"></script>
<script src="jsshop/baguetteBox.min.js"></script>
<script src="jsshop/form-validator.min.js"></script>
<script src="jsshop/contact-form-script.js"></script>
<script src="jsshop/custom.js"></script>
</body>

</html>
