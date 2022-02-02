<!--Final.jsp will display Group Members Names  -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Final Page - Logo and Name of Members</title>
<link rel="stylesheet" href="style.css">
</head>
<body>

<img src="https://d1yjjnpx0p53s8.cloudfront.net/styles/logo-thumbnail/s3/112014/lambton_college_logo.png?XeoOJ1YMaGp71yuVdJ6HOc70eIEv222Y&itok=7gutb30X"/>
<section>
<h3> Hi <%=request.getSession().getAttribute("userName") %></h3>
<p> Group E Members Name: </p><br>
<p> Pooja Bala  </p>
<p> Jaspal Kaur Bhuller </p>
<p> Gagandeep Kaur </p>
<p> Harpreet Kaur </p>
<p> Grace Tashimoa </p>
<br>
</section>
<p>@ Date: 31/01/2022  </p>
<p>@ Assignment 1 Created By: Group E </p>
</body>
</html>
