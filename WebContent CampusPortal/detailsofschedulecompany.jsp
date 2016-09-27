<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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
					<li><a href="${pageContext.request.contextPath}/home/${sessionScope.login.course}">Applicable Companies</a></li>
					<li><a href="${pageContext.request.contextPath}/home/all/${sessionScope.login.course}">All Companies</a></li>
					<li class="active"><a href="${pageContext.request.contextPath}/home/applied/${sessionScope.login.userid}">Applied Companies</a></li>
					<li ><a href="${pageContext.request.contextPath}/editprofile">Edit Profile</a></li>
					<li ><a href="${pageContext.request.contextPath}/showchangedpassord">Change Password</a></li>
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
				<h1 class="page-title">Schedule Company Details</h1>
			</header>
			
			<div class="col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
				<div class="panel panel-default">
					<div class="panel-body">
						<h3 class="thin text-center">Schedule Company Details</h3>
						<!--<p class="text-center text-muted">Lorem ipsum dolor sit amet, <a href="signin.html">Login</a> adipisicing elit. Quo nulla quibusdam cum doloremque incidunt nemo sunt a tenetur omnis odio. </p>-->
						<hr>

						<form:form action="${pageContext.request.contextPath}/showapplyforcompany/${command.name}" modelAttribute="command">
							
							<div class="top-margin">
								<label>Company Name</label>
								<form:label path="name" class="form-control">${command.name}</form:label>
							</div>

							<div class="top-margin">
								<label>Date</label>
								<form:label path="date" class="form-control">${command.date}</form:label>
							</div>
							
							<div class="top-margin">
								<label>Time of reporting</label>
								<form:label path="timeofreporting" class="form-control">${command.timeofreporting}</form:label>
							</div>
							
							<div class="top-margin">
								<label>Course Name</label>
								<form:label path="course" class="form-control">${command.course}</form:label>
							</div>

							<div class="top-margin">
								<label>Short list Criteria for Graduation Aggregate </label>
								<form:label path="grduationcriteria" class="form-control">${command.grduationcriteria}</form:label>
							</div>
							
							<div class="top-margin">
								<label>Short list Criteria for Higher Secondary/Diploma </label>
								<form:label path="hsccriteria" class="form-control">${command.hsccriteria}</form:label>
							</div>
							
							<div class="top-margin">
								<label>Short list Criteria for Senior Secondary </label>
								<form:label path="ssccriteria" class="form-control">${command.ssccriteria}</form:label>
							</div>

							<div class="top-margin">
								<label>Place of Posting</label>
								<form:label path="placeofposting" class="form-control">${command.placeofposting}</form:label>
							</div>

							<div class="top-margin">
								<label>Gross Salary Package</label>
								<form:label path="gspackage" class="form-control">${command.gspackage}</form:label>
							</div>

							<div class="top-margin">
								<label>bond</label>
								<form:label path="bond" class="form-control">${command.bond}</form:label>
							</div>
							
							<hr>

							<div class="row">
								<div class="col-lg-4 text-right">
									<button class="btn btn-action" type="submit">Apply</button>
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
	

	