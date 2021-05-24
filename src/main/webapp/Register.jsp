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
	height: 50px;
	background-color: yellow;
	display: flex;
	justify-content: space-between;
	position: fixed;
	width: 98.5%;
	border: dashed;
	border-color: red;
}

body {
	background-image: url("Images/8.jpg");
	background-repeat: no-repeat;
	background-size: 100%;
	font-size: 20px;
	color:Purple;
}

.center-screen>div {
	padding: 2px;
}

.company-name {
	height: 100px;
	display: inline-block;
	width: 60%;
	text-align: center;
	font-size: 40px;
	color: Blue;
	text-transform: uppercase;
	position: absolute;
}

input, textarea {
	height: 30px;
	width: 250px;
	border-radius: 5px;
	text-align: center;
	font-size: 16px;
	margin-bottom: 10px;
	padding: 2px;
	color: blue;
	background-color: silver;
	border-radius: 20px;
	font-weight: bold;
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

form input[type="radio"] {
	width: 20px;
	margin-right: 0px;
}

form lable {
	float: left;
	width: 100%;
	margin-right: 30px;
	margin-left: 10px;
}

form input[type="submit"], [type="reset"] {
	height: 40px;
	width: 100px;
	margin-left: 40px;
	background-color:  orange;
	width: 100px;
	margin-left: 40px;
	border-radius: 40px;
}

.div {
	width: 120px;
	padding-left: 40px;
	padding-top: 10px;
}

footer {
	height: 20px;
	background-color:yellow;
	text-align: center;
	padding-top: 10px;
	padding-bottom: 10px;
	margin-top: 20% px;
	position: fixed;
	width: 98.5%;
	color: blue;
	border: dashed;
	border-color: red;
	font-weight: bold;
}
</style>
</head>
<body>
	<header>
		<div style="padding-left: 40px; padding-top:5px; font-size: 30px;font-weight:bold; color Navy;">Library Management System</div>
		<div class="div"><a href="#">Login</a></div>
	</header>
	<marquee
		style="font-size: 40px; font-weight: bold; margin-top: 10px; padding-top: 40px; color: red; font-style: italic;">Register
		Here</marquee>
	<form action="register.cm" method="post">
		<table>
			<div>
				<tr>
					<th><label>FullName :</label></th>
					<th><input type="text" name="fullname"
						placeholder="Enter the name"></th>
				</tr>
			</div>
			<div>
				<tr>
					<th><label>EmailId :</label></th>
					<th><input type="email" name="emailid"
						placeholder="Enter the email"></th>
				</tr>
			</div>
			<div>
				<tr>
					<th><label>Contact :</label></th>
					<th><input type="number" name="contact"
						placeholder="Enter the phone no"></th>
				</tr>
			</div>
			<div>
				<tr>
					<th><label>DateOfBirth :</label></th>
					<th><input type="date" name="dateofbirth"
						placeholder="Enter the DOB"></th>
				</tr>
			</div>
			<div>
				<tr>
					<th><label>Address :</label></th>
					<th><textarea name="address" rows="2" cols="20"
							placeholder="Enter the location"></textarea></th>
				</tr>
			</div>
			<div>
				<tr>
					<th><label>SelectGender :</label></th>
					 <th>
					 <input type="radio" name="gender" value="male">Male
					 <input type="radio" name="gender" value="female">Female
					 <input type="radio" name="gender" value="others">Others
					 </th>
				</tr>
			</div>
			<div>
				<tr>
					<th><label>CreatePassword :</label></th>
					<th><input type="password" name="createpassword"
						placeholder="Enter the password"></th>
				</tr>
			</div>
			<div>
				<tr>
					<th><label>ConfirmPassword :</label></th>
					<th><input type="password" name="confirmpassword"
						placeholder="Confirm the password"></th>
				</tr>
			</div>
		</table>
		<div>
			<input type="submit" value="Register"> <input type="reset"
				value="Reset">
		</div>
	</form>
	<marquee
		style="color:maroon; font-size: 40px; font-stretch: wider; font-weight: bolder; font-style: oblique; margin-top: 2px;"> ${message}</marquee>

	<footer>All right reserved @copyright X-workz 2021</footer>
</body>
</html>