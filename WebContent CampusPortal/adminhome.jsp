<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
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
		<article class="col-md-8 maincontent">
			<header class="page-header">
				<h1 class="page-title">Student List</h1>
			</header>
			<div class="table-responsive">
		   <table class="table" >
			  <tbody style="width:10%;">
			  	<c:forEach var="student" items="${command.studentList}">
			  	
					<tr >
						<td colspan="2"><h3><b><a href="${pageContext.request.contextPath}/adminedit/${student.userid}">${student.fname} ${student.lname}</a></b></h3></td>
						
					</tr>
					
					<tr>
						<td colspan="2">Email : ${student.email} </td>
					</tr>
					<tr>
						<td>Mobile Number : ${student.mobileno}</td>
						<td>Graduation Stream : ${student.graduationstream}</td>
					</tr>
				 </c:forEach>
			  </tbody>
		   </table>
		   <hr>
		</div> 
		</article>
			<!-- /Article -->
			
			<!-- Sidebar -->
			<aside class="col-md-4 sidebar sidebar-right">

				<div class="widget">
					<h4>Links</h4>
					<ul class="list-unstyled list-spaces">
						<li><a href="${pageContext.request.contextPath}/registerIndex">Register New Student</a><br><span class="small text-muted">
								You can Register new Student.</span></li>
						
					</ul>
				</div>
				
				<div class="row widget">
					<div class="col-xs-12">
						<h4>Infosys</h4>
						<p><img src="${pageContext.request.contextPath}/resources/images/infosys.jpg" alt=""></p>
						<p>Infosys is a global leader in consulting, technology, and outsourcing and next-generation services.</p>
					</div>
				</div>
				<div class="row widget">
					<div class="col-xs-12">
						<h4>Tata Group</h4>
						<p><img src="${pageContext.request.contextPath}/resources/images/tata.jpg" alt=""></p>
					</div>
				</div>
				<div class="row widget">
					<div class="col-xs-12">
						<h4>Accenture</h4>
						<p><img src="${pageContext.request.contextPath}/resources/images/accenture.jpg" alt=""></p>
						<p>Accenture is one of the world’s leading professional services companies, providing consulting and outsourcing services through our strategy, digital, technology and operations capabilities.</p>
					</div>
				</div>

			</aside> 	
	</div>
</div>	<!-- /container -->
	
