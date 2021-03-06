<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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
					<li ><a href="${pageContext.request.contextPath}/getcompanylist">Company</a></li>
					<li class="active"><a href="${pageContext.request.contextPath}/viewschedulelist">Schedule Company</a></li>
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
				<h1 class="page-title">Update Scheduled Company</h1>
			</header>
			
			<div class="col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
				<div class="panel panel-default">
					<div class="panel-body">
						<h3 class="thin text-center">Update Scheduled Company</h3>
						<!--<p class="text-center text-muted">Lorem ipsum dolor sit amet, <a href="signin.html">Login</a> adipisicing elit. Quo nulla quibusdam cum doloremque incidunt nemo sunt a tenetur omnis odio. </p>-->
						<hr>

						<form:form action="${pageContext.request.contextPath}/updateschedulecompany" modelAttribute="command">
							
							<div class="top-margin">
								<label>Company</label>
								<form:input path="name" class="form-control"></form:input>
							</div>

							<div class="top-margin">
								<label>Date</label>
								<form:input path="date" class="form-control"/>
							</div>
							
							<div class="top-margin">
								<label>Time of reporting</label>
								<form:input path="timeofreporting" class="form-control"/>
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
								<label>Short list Criteria for Graduation Aggregate </label>
								<form:input path="grduationcriteria" class="form-control"/>
							</div>
							
							<div class="top-margin">
								<label>Short list Criteria for Higher Secondary/Diploma </label>
								<form:input path="hsccriteria" class="form-control"/>
							</div>
							
							<div class="top-margin">
								<label>Short list Criteria for Senior Secondary </label>
								<form:input path="ssccriteria" class="form-control"/>
							</div>

							<div class="top-margin">
								<label>Place of Posting</label>
								<form:input path="placeofposting" class="form-control"/>
							</div>

							<div class="top-margin">
								<label>Gross Salary Package</label>
								<form:input path="gspackage" class="form-control"/>
							</div>

							<div class="top-margin">
								<label>bond</label>
								<form:select path="bond" class="form-control">
										<form:option value="yes"> Yes </form:option>
    									<form:option value="no"> No </form:option>
								</form:select>
							</div>
							
							<hr>

							<div class="row">
								<div class="col-lg-4 text-right">
									<button class="btn btn-action" type="submit">Update Scheduled Company</button>
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
	

	