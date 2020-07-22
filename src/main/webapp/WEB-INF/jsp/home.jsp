<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
<title>LMS Project</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<style>
.navbar-nav  li a:hover {
	color: #1abc9c !important;
}
 .bg-1 { 
    background-color: #1abc9c; /* Green */
    color: #ffffff;
  }
  .bg-2 { 
    background-color: #474e5d; /* Dark Blue */
    color: #ffffff;
  }
  .bg-3 { 
    background-color: #ffffff; /* White */
    color: #555555;
  }
  .bg-4 { 
    background-color: #2f2f2f; /* Black Gray */
    color: #fff;
  }
</style>

</head>
<body>

	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">Library Management System</a>
			</div>
			<ul class="nav navbar-nav pull-right">
				<li class="active"><a href="/home">Home</a></li>
				<li><a href="login">Login</a></li>
			</ul>
		</div>
	</nav>

	<div class="container">
		<center><h3>Welcome to LMS Project</h3></center>
	</div>

	<!-- <!-- Third Container (Grid) -->
	<div class="container-fluid bg-3 text-center">
		<h3 class="margin">Where To Find Me?</h3>
		<br>
			<div class="col-sm-4">
				<a href="/login"> <img
					src="https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQkvL9cDdyifUx2siGR7mJ85xUN7RgajkSYQg&usqp=CAU"
					style="width: 225px" alt="Image">
					<p>Admin Login</p>
				</a>
			</div>
			<div class="col-sm-4">
				<a href="/login"> <img
					src="https://monteirolobato.com.br/public/assets/admin/images/avatars/avatar2_big@2x.png"
					style="width: 225px" alt="Image">
					<p>Librarian Login</p>
				</a>
			</div>
			<div class="col-sm-4">
				<a href="/signup"> <img
					src="https://monteirolobato.com.br/public/assets/admin/images/avatars/avatar2_big@2x.png"
					style="width: 225px" alt="Image">
					<p>Librarian Signup</p>
				</a>
			</div>
	</div>

	<!-- Footer -->
<footer class="container-fluid bg-4 text-center">
  <p>Library Management Project by HIMANSHU SINGH</p> 
</footer>

</body>
</html>

