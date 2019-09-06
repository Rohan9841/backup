<?php
$days	=	array("Monday",	"Tuesday",	"Wednesday",	"Thursday",	"Friday",	
"Saturday",	"Sunday");
$highs	=	array(20,30,26,30,30,29,25);
$lows	=		array(10,11,15,18,20,13,11);

function	outputForecast($day,$high,$low)	{
   echo	'<div	class="panel	panel-default	col-lg-3	col-md-3	col-sm-6">';
   echo	'<div	class="panel-heading">';
   echo	'<h3	class="panel-title">'	.	$day	.	'</h3>';
   echo	'</div>';
   echo	'<div	class="panel-body">';
   echo	'<table	class="table	table-hover">';
   echo	'<tr><td>High:</td><td>'	.	$high	.	'</td></tr>';
   echo	'<tr><td>Low:</td><td>'	.	$low	.	'</td></tr>';
   echo	'</table>';
   echo	'</div>';
   echo	'</div>';
}
?>
<html lang="en">
<head>
   <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
   <title>Exercise 12-1 Weather Forecast</title>   
   
   <!-- Latest compiled and minified Bootstrap Core CSS -->
   <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
</head>

<body>
<header>
   <div class="jumbotron">
      <h1>Weather Forecast!</h1>
         <p>Coming soon...</p>
   </div>
</header>

<div class="container theme-showcase" role="main">  
   <?php
      // you will be replacing the <div> below with a function call
      for	($i=0;	$i<count($days);	$i++)	{
         outputForecast($days[$i],	$highs[$i],	$lows[$i]);
   }  
   ?>
   <div class="panel panel-default col-lg-2 col-md-4 col-sm-6">
      <div class="panel-heading">
         <h3 class="panel-title">Monday</h3>
      </div>
      <div class="panel-body">
         <table class="table table-hover">
            <tr>
               <td>High:</td><td>100&deg;??</td>
            </tr>
            <tr><td>Low:</td><td>100&deg;??</td></tr>
         </table>
      </div>
   </div>
</div>
</body>
</html>