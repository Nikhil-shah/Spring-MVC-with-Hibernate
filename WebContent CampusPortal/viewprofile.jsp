<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<div>
	
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
	<script src="http://netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
	 <script src="//ajax.googleapis.com/ajax/libs/angularjs/1.2.12/angular.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/headroom.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/jQuery.headroom.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/template.js"></script>
	<div class="navbar navbar-inverse navbar-fixed-top headroom" >
		<div class="container">
			<div class="navbar-header">
				<!-- Button for smallest screens -->
				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse"><span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </button>
				<a class="navbar-brand" href="showhome"><img src="${pageContext.request.contextPath}/resources/images/logo.png" alt="Progressus HTML5 template"></a>
			</div>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav pull-right">
					<li class="active"><a href="${pageContext.request.contextPath}/tpohome">Student List</a></li>
					<li ><a href="${pageContext.request.contextPath}/getcompanylist">Company</a></li>
					<li><a href="${pageContext.request.contextPath}/viewschedulelist">Schedule Company</a></li>
					<li ><a class="btn" href="${pageContext.request.contextPath}/logoutIndex">Logout</a></li>
				</ul>
			</div><!--/.nav-collapse -->
		</div>
	</div> 
	<!-- /.navbar -->

	<header id="head" class="secondary"></header>
	<!-- container -->
	<div class="container">

		<div class="row">
			
			<!-- Article main content -->
			<article class="col-xs-12 maincontent">
				<header class="page-header">
					<h1 class="page-title">View Profile</h1>
				</header>
				
				<div class="col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
					<div class="panel panel-default">
						<div class="panel-body">
							<h3 class="thin text-center">View Profile</h3>
							<!--<p class="text-center text-muted">Lorem ipsum dolor sit amet, <a href="signin.html">Login</a> adipisicing elit. Quo nulla quibusdam cum doloremque incidunt nemo sunt a tenetur omnis odio. </p>-->
							<hr>

							<form:form action="updateprofile">
								
								<div class="top-margin">
									<label>Email Address</label>
									<form:label path="email" class="form-control">${command.email}</form:label>
								</div>

								<hr>
								
								<div class="row top-margin">
									<div class="col-sm-6">
										<label>First Name</label>
										<form:label path="fname" class="form-control">${command.fname}</form:label>
									</div>
									<div class="col-sm-6">
										<label>Last Name</label>
										<form:label path="lname" class="form-control">${command.lname}</form:label>
									</div>
								</div>

								<div class="top-margin">
									<label>Mobile No.</label>
									<form:label path="mobileno" class="form-control">${command.mobileno}</form:label>
								</div>

								<div class="top-margin">
									<label>Street</label>
									<form:label path="street" class="form-control">${command.street}</form:label>
								</div>

								<div class="top-margin">
									<label>City</label>
									<form:label path="city" class="form-control">${command.city}</form:label>
								</div>

								<div class="top-margin">
									<label>Country</label>
									<form:label path="country" class="form-control">${command.country}</form:label>
								</div>

								<hr>
								 
								 <div class="top-margin">
									<label>Gender</label>
									<form:label path="gender" class="form-control">${command.gender}</form:label>
								</div>
								
								<div class="top-margin">
									<label>Birthdate</label>
									<form:label path="birthdate" class="form-control">${command.birthdate}</form:label>
								</div>
								
								<div class="top-margin">
									<label>Course Name</label>
									<form:label path="course" class="form-control">${command.course}</form:label>
								</div>
								
								<div class="top-margin">
									<label>Graduation Stream<span class="text-danger">*</label>
									<form:label path="graduationstream" class="form-control">${command.graduationstream}</form:label>
								</div>

								<div class="top-margin">
									<label>Graduation Percentage<span class="text-danger">*</label>
									<form:label path="graduationpercentage" class="form-control">${command.graduationpercentage}</form:label>
								</div>

								<div class="top-margin">
									<label>Higher Secondry/Diploma Percentage<span class="text-danger"/>*</label>
									<form:label path="higherpercentage" class="form-control">${command.higherpercentage}</form:label>
								</div>

								<div class="top-margin">
									<label>Senior Secondry Percentage<span class="text-danger"/>*</label>
									<form:label path="seniorpercentage" class="form-control">${command.seniorpercentage}</form:label>
								</div>

								<div class="top-margin">
									<label>Nationality <span class="text-danger">*</label>
									<form:label path="nationality" class="form-control">${command.nationality}</form:label>
								</div>
								<hr>

							</form:form>
						</div>
					</div>

				</div>
				
			</article>
			<!-- /Article -->

		</div>
	</div>	<!-- /container -->
</div>
