<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!-- Fixed navbar -->
		
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
					<li><a href="showhome">Home</a></li>
					<li><a href="showstudent">Students</a></li>
					<li><a href="showaboutrecruiters">Recruiters</a></li>
					<!--  <li class="dropdown">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">Student <b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href="sidebar-left.html">Left Sidebar</a></li>
							<li><a href="sidebar-right.html">Right Sidebar</a></li>
						</ul>
					</li>-->
					<li class="active"><a href="showcontact">Contact</a></li>
					<li ><a class="btn" href="loginIndex">SIGN IN</a></li>
				</ul>
			</div><!--/.nav-collapse -->
		</div>
	</div> 
	<!-- /.navbar -->

	<header id="head" class="secondary"></header>

	<div class="container">

		<div class="row">
			
			<!-- Article main content -->
			<article class="col-sm-9 maincontent">
				<header class="page-header">
					<h1 class="page-title">Contact us</h1>
				</header>
				
				<p>
					We'd love to hear from you. Interested in working together? Fill out the form below with some info about your interest and I will get back to you as soon as I can. Please allow a couple days for me to respond.
				</p>
				<br>
					<form:form action="addcontact" modelAttribute="command">
						<div class="row">
							<div class="col-sm-4">
								<form:input path="name" class="form-control" type="text" placeholder="Name"></form:input>
							</div>
							<div class="col-sm-4">
								<form:input path="email" class="form-control" type="text" placeholder="Email"></form:input>
							</div>
							<div class="col-sm-4">
								<form:input path="mobno" class="form-control" type="text" placeholder="Phone"></form:input>
							</div>
						</div>
						<br>
						<div class="row">
							<div class="col-sm-12">
								<form:textarea path="message" placeholder="Type your message here..." class="form-control" rows="9"></form:textarea>
							</div>
						</div>
						<br>
						<div class="row">
							<div class="col-sm-6">
							</div>
							<div class="col-sm-6 text-right">
								<input class="btn btn-action" type="submit" value="Send message">
							</div>
						</div>
					</form:form>
			</article>
			<!-- /Article -->
			
			<!-- Sidebar -->
			<aside class="col-sm-3 sidebar sidebar-right">

				<div class="widget">
					<h4>Address</h4>
					<address>
						Sunbeam Building 'C', opposite of gate no. 4 Market Yard, Pune - 411038 
					</address>
					<h4>Phone</h4>
					<address>
						+91 904 904 2742
					</address>
				</div>
			</aside>
			<!-- /Sidebar -->
		</div>
	</div>	<!-- /container -->
	
	<section class="container-full top-space">
		<div id="map"></div>
	</section>