  <header>
		<nav class="navbar navbar-expand-md navbar-dark"
			style="background-color: tomato">
			<div>
				<a href="homePage.jsp" class="navbar-brand">Home </a>
			</div>

			<ul class="navbar-nav">
				<li><a href="<%=request.getContextPath()%>/homePage.jsp"
					class="nav-link">Employees</a></li>
			</ul>
			
			<ul class="navbar-nav right">
				<li><a href="<%=request.getContextPath()%>/logout"
					class="nav-link">Logout</a></li>
			</ul>
		</nav>
	</header>