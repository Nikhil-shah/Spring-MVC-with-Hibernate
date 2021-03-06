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
					<li ><a href="${pageContext.request.contextPath}/tpohome">Student List</a></li>
					<li class="active"><a href="${pageContext.request.contextPath}/getcompanylist">Company</a></li>
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
		<article class="col-md-8 maincontent">
			<header class="page-header">
				<h1 class="page-title">Registered Companies</h1>
			</header>
			<div class="table-responsive">
		   <table class="table" >
			  <tbody style="width:10%;">
			  	<c:forEach var="company" items="${command.companyList}">
			  	
					<tr >
						<td colspan="2"><h3><b><a href="${pageContext.request.contextPath}/getregistercompany/${company.name}">${company.name}</a></b></h3></td>
						
					</tr>
					
					<tr>
						<td colspan="2">Contact person : ${company.contactperson} </td>
					</tr>
					<tr>
						<td>Email : ${company.email}</td>
						<td>Mobile Number : ${company.mobileno}</td>
					</tr>
				 	
				 	<tr >
						<td colspan="2">Postal Address : ${company.postaladdress}></td>
						
					</tr>
				  <spring:url value="/removecompany/${company.name}" var="applyurl" />
						<td align="right" colspan="2"><button onclick="location.href='${applyurl}'" class="btn btn-action" type="submit">Remove Company</button></td>
				 
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
						<li><a href="${pageContext.request.contextPath}/addcompany1">Register New Company</a><br><span class="small text-muted">
								You can Register new company which is going to visit campus.</span></li>
						<li><a href="${pageContext.request.contextPath}/scheduleforcompany">Schedule New Companies</a><br>
						<span class="small text-muted">You can schedule company which is already register.</span></li>
						
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
	
