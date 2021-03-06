<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<div>
	
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
	<script src="http://netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/headroom.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/jQuery.headroom.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/template.js"></script>
	
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
					<li class="active"><a href="${pageContext.request.contextPath}/adminhome">Student List</a></li>
					<li ><a href="${pageContext.request.contextPath}/registerIndex">Register Student</a></li>
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
					<h1 class="page-title">Edit Profile</h1>
				</header>
				
				<div class="col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
					<div class="panel panel-default">
						<div class="panel-body">
							<h3 class="thin text-center">Edit Profile</h3>
							<!--<p class="text-center text-muted">Lorem ipsum dolor sit amet, <a href="signin.html">Login</a> adipisicing elit. Quo nulla quibusdam cum doloremque incidunt nemo sunt a tenetur omnis odio. </p>-->
							<hr>

							<form:form action="${pageContext.request.contextPath}/adminupdateprofile">
								
								<div class="top-margin">
									<label>Email Address <span class="text-danger">*</span></label>
										<form:input path="email" class="form-control"/>
								</div>
								<hr>
								
								<div class="row top-margin">
									<div class="col-sm-6">
										<label>First Name</label>
										<form:input path="fname" class="form-control" />
									</div>
									<div class="col-sm-6">
										<label>Last Name</label>
										<form:input path="lname" class="form-control"/>
									</div>
								</div>

								<div class="top-margin">
									<label>Mobile No.</label>
									<form:input path="mobileno" class="form-control" />
								</div>

								<div class="top-margin">
									<label>Street</label>
									<form:input path="street" class="form-control" />
								</div>

								<div class="top-margin">
									<label>City</label>
									<form:input path="city" class="form-control" />
								</div>

								<div class="top-margin">
									<label>Country</label>
									<form:input path="country" class="form-control"/>
								</div>

								<hr>
								 
								 <div class="top-margin">
									<label  >Gender</label>
									<input type="hidden" class="form-control"/>
									<div >
										<label class="checkbox">
											<form:radiobutton value="male" path="gender" />
											Male
											&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
											<form:radiobutton value="female" path="gender"/>
											Female
										</label>   
									</div>
								</div>
								
								<div class="top-margin">
									<label>Birthdate</label>
									<form:input path="birthdate" class="form-control" />
								</div>
								
								<div class="top-margin">
									<label>Course Name</label>
									<form:select path="course" class="form-control">
											<form:option value="dac"> DAC </form:option>
	    									<form:option value="wimc"> WiMC </form:option>
	    									<form:option value="divesd"> DiVESD </form:option>
									</form:select>
								</div>
								
								<div class="top-margin">
									<label>Graduation Stream<span class="text-danger">*</label>
									<form:input path="graduationstream" class="form-control" />

								<div class="top-margin">
									<label>Graduation Percentage<span class="text-danger">*</label>
									<form:input path="graduationpercentage" class="form-control"/>
								</div>

								<div class="top-margin">
									<label>Higher Secondry/Diploma Percentage<span class="text-danger"/>*</label>
									<form:input path="higherpercentage" class="form-control"/>
								</div>

								<div class="top-margin">
									<label>Senior Secondry Percentage<span class="text-danger"/>*</label>
									<form:input path="seniorpercentage" class="form-control" />
								</div>

								<div class="top-margin">
									<label>Nationality <span class="text-danger">*</label>
									<form:input path="nationality" class="form-control"/>
								</div>
								<hr>

								<div class="row">
									<div class="col-lg-4 text-right">
										<button class="btn btn-action" type="submit">Update Profile</button>
									</div>
								</div>
							</form:form>
						</div>
					</div>

				</div>
				
			</article>
			<!-- /Article -->

		</div>
	</div>	<!-- /container -->
</div>
