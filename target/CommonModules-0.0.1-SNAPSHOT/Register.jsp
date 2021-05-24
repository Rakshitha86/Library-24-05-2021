<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
header {
	height: 40px;
	background-color: lime;
	display: flex;
	justify-content: space-between;
}

body {
	background-color: aqua;
}

.center-screen>div {
	padding: 2px;
}

.company-name {
	height: 80px;
	display: inline-block;
	width: 60%;
	text-align: center;
	font-size: 25px;
	color: rgb(175, 0, 38);
	text-transform: uppercase;
	position: absolute;
}

input, textarea {
	height: 30px;
	width: 200px;
	border-radius: 5px;
	text-align: center;
	font-size: 15px;
	margin-bottom: 10px;
	padding: 2px;
}

.submit {
	background-color: rgb(43, 176, 228);
	height: 39px;
	width: 209px;
	border-radius: 5px;
	font-size: 20px;
	color: maroon;
	margin-bottom: 5px;
}

form {
	display: inline;
}

footer {
	height: 30px;
	background-color: lime;
	text-align: center;
	padding-top: 15px;
	margin-top: 550px;
}
</style>
</head>
<body>
	<header>
		<div class="logo">
		</div>
		<div class="company-name">Name of the Application</div>
		<div class="links" style="margin-top: 40px;">
			<input type="submit" value="login">
		</div>
	</header>
	<form action="register.cm" method="post">
		<table>
			<div>
				<tr>
					<th><label>FullName :</label></th>
					<th><input type="text" name="fullname"></th>
				</tr>
			</div>
			<div>
				<tr>
					<th><label>EmailId :</label></th>
					<th><input type="email" name="emailid"></th>
				</tr>
			</div>
			<div>
				<tr>
					<th><label>Contact :</label></th>
					<th><input type="number" name="contact"></th>
				</tr>
			</div>
			<div>
				<
				<tr>
					<th><label>DateOfBirth :</label></th>
					<th><input type="date" name="dateofbirth"></th>
				</tr>
			</div>
			<div>
				<tr>
					<th><label>Address :</label></th>
					<th><textarea name="address" rows="2" cols="20"></textarea></th>
				</tr>
			</div>
			<div>
				<tr>
					<th><label>SelectGender :</label></th>
					<th><input type="radio" name="gender" value="male">Male
						<input type="radio" name="gender" value="female">Female <input
						type="radio" name="gender" value="others">Others</th>
				</tr>
			</div>
			<div>
				<tr>
					<th><label>CreatePassword :</label></th>
					<th><input type="password" name="createpassword"></th>
				</tr>
			</div>
			<div>
				<tr>
					<th><label>ConfirmPassword :</label></th>
					<th><input type="password" name="confirmpassword"></th>
				</tr>
			</div>
		</table>
		<div>
			<input type="submit" value="Register"> <input type="reset"
				value="Reset">
		</div>
	</form>
	<h1>${message}</h1>
	<footer>All right reserved @copyright X-workz 2021</footer>
</body>
</html>