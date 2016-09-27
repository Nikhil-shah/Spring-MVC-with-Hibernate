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
					<li><a href="showhome">Home</a></li>
					<li class="active"><a href="showstudent">Students</a></li>
					<li><a href="showaboutrecruiters">Recruiters</a></li>
					<!--  <li class="dropdown">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">Student <b class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a href="sidebar-left.html">Left Sidebar</a></li>
							<li><a href="sidebar-right.html">Right Sidebar</a></li>
						</ul>
					</li>-->
					<li ><a href="showcontact">Contact</a></li>
					<li ><a class="btn" href="loginIndex">SIGN IN</a></li>
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
		
			<header class="page-header">
				
				<h1 class="page-title">Recruiters</h1>
			</header>
			<div class="table-responsive">
		   <table class="table">
			  <thead>
				 <tr>
					<th>Sr. No.</th>
					<th>Name </th>
					<th>Web site </th>
					<th>Selection Procedure</th>
					<th>Technologies </th>
					<th>Place of posting</th>
					<th>Gross Salary Package</th>
					<th>Bond</th>
					<th>Course</th>
				 </tr>
			  </thead>
			  <tbody>
			  	<c:forEach var="recruiter" items="${command.recruiterList}">
					<tr>
						<td>${recruiter.srno}</td>
						<td>${recruiter.name}</td>
						<td><a href="${recruiter.website}">${recruiter.website}</a></td>
						<td>${recruiter.selectionpro}</td>
						<td>${recruiter.technologies}</td>
						<td>${recruiter.placeofposting}</td>
						<td>${recruiter.gspackage}</td>
						<td>${recruiter.bond}</td>
						<td>${recruiter.course}</td>
					 </tr>
				 </c:forEach>
			  </tbody>
		   </table>
		   <hr>
		</div>  	
	</div>
</div>	<!-- /container -->
	
