<!DOCTYPE html>

<html>
	<style>
		.button{
			background-color: #E92900;
			border-color: #FFFFFF;
			color: #FFFFFF;
			font-size: 48px;
			height: 100px;
			width: 100%;
			float: left;
			transition: 0.5s;
		}
		.button:hover{
			color: #E92900;
			border-color: #E92900;
			background-color: #FFFFFF;
		}
	</style>
	<head>
		<title>Index view</title>
	</head>

	<body style = "background-color: #000000;">
		<form action="${pageContext.servletContext.contextPath}/index" method="post">
			<div>
				<input class="button" type="Submit" name="submit" value="Add Numbers!"/>
			</div>
			<div>
				<input class="button" type="Submit" name="submit" value="Multiply Numbers!"/>
			</div>
			<div>
				<input class="button" type="Submit" name="submit" value="Guessing Game!"/>
			</div>
		</form>
	</body>
</html>
