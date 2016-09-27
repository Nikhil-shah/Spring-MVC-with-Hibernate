<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<script src="${pageContext.request.contextPath}/resources/js/angular.min.js"></script>
  <script>
var mainApp = angular.module("mainApp", []);

mainApp.controller('Controller', function($scope) {
   $scope.submit = function(){
		$scope.email = "";
		$scope.pass = "";
		$scope.fname ="";
		$scope.lname = "";
		$scope.mobileno = "";
		$scope.street="";
		$scope.city="";
		$scope.country="";
		$scope.birthdate="";
		$scope.graduationstream="";
		$scope.graduationpercentage=0.0
		$scope.higherpercentage=0.0
		$scope.seniorpercentage=0.0
		$scope.nationality="";
   } 
      
   $scope.submit()});
</script>  
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
					<li ><a href="${pageContext.request.contextPath}/adminhome">Student List</a></li>
					<li class="active"><a href="${pageContext.request.contextPath}/registerIndex">Register Student</a></li>
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
					<h1 class="page-title">Registration</h1>
				</header>
				
				<div class="col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
					<div class="panel panel-default">
						<div class="panel-body">
							<h3 class="thin text-center">Register a new student account</h3>
							<!--<p class="text-center text-muted">Lorem ipsum dolor sit amet, <a href="signin.html">Login</a> adipisicing elit. Quo nulla quibusdam cum doloremque incidunt nemo sunt a tenetur omnis odio. </p>-->
							<hr>

							<form:form action="${pageContext.request.contextPath}/register" name="Form" ng-app="mainApp" ng-controller="Controller" novalidate="true">
							
								<!-- <div class="row top-margin">
									<div class="col-sm-6">
									<label>	
										<span>Photo to upload</span>
										<input name="file" type="file" /> 
									</label>
									</div>
								</div>
								
								<hr> -->
								
								<div class="row top-margin">
									<div class="col-sm-6">
										<label>Email Address <span class="text-danger">*</span></label>
										<form:input path="email" class="form-control" required="true" ng-model="email"/>
										<span style="color:red;" ng-show="Form.email.$dirty && Form.email.$invalid">
		      							<span ng-show="Form.email.$error.required">Email is required.</span></span> 
											</div>
									<div class="col-sm-6">
										<label>Confirm Email Address <span class="text-danger">*</span></label>
										<input type="email" class="form-control" required="true" ng-model="email"/>
										<span style="color:red;" ng-show="Form.email.$dirty && Form.email.$invalid">
		      							<span ng-show="Form.email.$error.required">Email is required.</span></span> 
									</div>
								</div>

								<div class="row top-margin">
									<div class="col-sm-6">
										<label>Password <span class="text-danger">*</span></label>
										<form:password path="pass" class="form-control" required="true" ng-model="pass"/>
										<span style="color:red;" ng-show="Form.pass.$dirty && Form.pass.$invalid">
		      							<span ng-show="Form.pass.$error.required">Password is required.</span></span> 
									</div>
									<div class="col-sm-6">
										<label>Confirm Password <span class="text-danger">*</span></label>
										<input type="password" class="form-control"/>
									</div>
								</div>

								<hr>
								
								<div class="row top-margin">
									<div class="col-sm-6">
										<label>First Name</label>
										<form:input path="fname" class="form-control" required="true" ng-model="fname"/>
										<span style="color:red;" ng-show="Form.fname.$dirty && Form.fname.$invalid">
		      							<span ng-show="Form.fname.$error.required">First name is required.</span></span> 
									</div>
									<div class="col-sm-6">
										<label>Last Name</label>
										<form:input path="lname" class="form-control" required="true" ng-model="lname"/>
										<span style="color:red;" ng-show="Form.lname.$dirty && Form.lname.$invalid">
		      							<span ng-show="Form.lname.$error.required">Last name is required.</span></span>
									</div>
								</div>

								<div class="top-margin">
									<label>Mobile No.</label>
									<form:input path="mobileno" class="form-control" required="true" ng-model="mobileno"/>
										<span style="color:red;" ng-show="Form.mobileno.$dirty && Form.mobileno.$invalid">
		      							<span ng-show="Form.mobileno.$error.required">Mobile number is required.</span></span>
								</div>

								<div class="top-margin">
									<label>Street</label>
									<form:input path="street" class="form-control" required="true" ng-model="street"/>
										<span style="color:red;" ng-show="Form.street.$dirty && Form.street.$invalid">
		      							<span ng-show="Form.street.$error.required">Street is required.</span></span>
								</div>

								<div class="top-margin">
									<label>City</label>
									<form:input path="city" class="form-control" required="true" ng-model="city"/>
										<span style="color:red;" ng-show="Form.city.$dirty && Form.city.$invalid">
		      							<span ng-show="Form.city.$error.required">City is required.</span></span>
								</div>

								<div class="top-margin">
									<label>Country</label>
									<form:input path="country" class="form-control" required="true" ng-model="country"/>
										<span style="color:red;" ng-show="Form.country.$dirty && Form.country.$invalid">
		      							<span ng-show="Form.country.$error.required">Country is required.</span></span>
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
									<form:input path="birthdate" class="form-control" required="true" ng-model="birthdate"/>
										<span style="color:red;" ng-show="Form.birthdate.$dirty && Form.birthdate.$invalid">
		      							<span ng-show="Form.birthdate.$error.required">Birthdate is required.</span></span>
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
									<form:input path="graduationstream" class="form-control" required="true" ng-model="graduationstream"/>
										<span style="color:red;" ng-show="Form.graduationstream.$dirty && Form.graduationstream.$invalid">
		      							<span ng-show="Form.graduationstream.$error.required">Graduation Stream is required.</span></span>
								</div>

								<div class="top-margin">
									<label>Graduation Percentage<span class="text-danger">*</label>
									<form:input path="graduationpercentage" class="form-control" required="true" ng-model="graduationpercentage"/>
										<span style="color:red;" ng-show="Form.graduationpercentage.$dirty && Form.graduationpercentage.$invalid">
		      							<span ng-show="Form.graduationpercentage.$error.required">Graduation percentage is required.</span></span>
								</div>

								<div class="top-margin">
									<label>Higher Secondry/Diploma Percentage<span class="text-danger"/>*</label>
									<form:input path="higherpercentage" class="form-control" required="true" ng-model="higherpercentage"/>
										<span style="color:red;" ng-show="Form.higherpercentage.$dirty && Form.higherpercentage.$invalid">
		      							<span ng-show="Form.higherpercentage.$error.required">HSC/Diploma percentage is required.</span></span>
								</div>

								<div class="top-margin">
									<label>Senior Secondry Percentage<span class="text-danger"/>*</label>
									<form:input path="seniorpercentage" class="form-control" required="true" ng-model="seniorpercentage"/>
										<span style="color:red;" ng-show="Form.seniorpercentage.$dirty && Form.seniorpercentage.$invalid">
		      							<span ng-show="Form.seniorpercentage.$error.required">SSC percentage is required.</span></span>
								</div>

								<div class="top-margin">
									<label>Nationality <span class="text-danger">*</label>
									<form:input path="nationality" class="form-control" required="true" ng-model="nationality"/>
										<span style="color:red;" ng-show="Form.nationality.$dirty && Form.nationality.$invalid">
		      							<span ng-show="Form.nationality.$error.required">Nationality is required.</span></span>
								</div>
								<hr>

								<div class="row">
									
									<div class="col-lg-4 text-right">
										<button class="btn btn-action" type="submit">Register</button>
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
