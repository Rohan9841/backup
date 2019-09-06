<?php
//insert.php will get the cutpoints from the phage database
$connect = mysqli_connect("localhost", "Rohan", "", "contacts");

if(isset($_POST["name"]) && isset($_POST["email"]) && isset($_POST["subject"]) && isset($_POST["message"]))
{
    alert("everything is filled");
}
else
{
    alert("Please fill all the following blank");
}
?>
