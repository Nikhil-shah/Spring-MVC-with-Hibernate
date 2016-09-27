<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- container -->
<script src="${pageContext.request.contextPath}/resources/js/angular.min.js"></script>
  <script>
var mainApp = angular.module("mainApp", []);

mainApp.controller('Controller', function($scope) {
   $scope.submit = function(){
	   $scope.pass = "";
	   $scope.email = "";
   } 
      
   $scope.submit()});
</script>  

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
					<li><a href="${pageContext.request.contextPath}/home/${sessionScope.login.course}">Applicable Companies</a></li>
					<li><a href="${pageContext.request.contextPath}/home/all/${sessionScope.login.course}">All Companies</a></li>
					<li ><a href="${pageContext.request.contextPath}/home/applied/${sessionScope.login.userid}">Applied Companies</a></li>
					<li ><a href="${pageContext.request.contextPath}/editprofile">Edit Profile</a></li>
					<li class="active"><a href="${pageContext.request.contextPath}/showchangedpassord">Change Password</a></li>
					<li ><a class="btn" href="${pageContext.request.contextPath}/logoutIndex">Logout</a></li>
				</ul>
			</div><!--/.nav-collapse -->
		</div>
	</div> 
	<!-- /.navbar -->

	<header id="head" class="secondary"></header>

<div class="container">

	<div class="row">
		
		<!-- Article main content -->
		<article class="col-xs-12 maincontent">
			<header class="page-header">
				<h1 class="page-title">Change Password</h1>
			</header>
			
			<div class="col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
				<div class="panel panel-default">
					<div class="panel-body">
						<h3 class="thin text-center">Change password</h3>
						<hr>
						
						<form:form action="changepassword" name="Form" ng-app="mainApp" ng-controller="Controller" novalidate="true">
							<div class="top-margin">
								<label>Enter your old password <span class="text-danger">*</span></label>
								<form:password path="email" class="form-control" required="true" ng-model="email"/>
								<span style="color:red;" ng-show="Form.email.$dirty && Form.email.$invalid">
      							<span ng-show="Form.email.$error.required">Password is required.</span></span>    
							</div>
							
							<div class="top-margin">
								<label>Enter your new password <span class="text-danger">*</span></label>
								<form:password path="pass" class="form-control" required="true" ng-model="pass"/>
								<span style="color:red;" ng-show="Form.pass.$dirty && Form.pass.$invalid">
      							<span ng-show="Form.pass.$error.required">Password is required.</span></span>    
							</div>
							
							<hr>

							<div class="row">
								<div class="col-lg-4 text-right">
									<button class="btn btn-action" type="submit">Change Password</button>
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
	