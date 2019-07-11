<?php

include 'dbconfig1.php';

 $con = mysqli_connect($servername,$username,$password,$dbname);
 
 $name = $_POST['name'];
 $city = $_POST['city'];
 $mobile = $_POST['mobile'];
 $email = $_POST['email'];
 $quali = $_POST['quali'];
 $interest = $_POST['interest'];
 $country = $_POST['country'];
 $fcm_id = $_POST['fcm_id'];
 $created_at = NOW();
 
 $Sql_Query = "select * from crosslandtable where email = '$email' OR mobile= '$mobile'";
 
 $check = mysqli_fetch_array(mysqli_query($con,$Sql_Query));
if(isset($check)) {
    echo "User Already in Exists";
}
else{
$Sql_Query = "insert into crosslandtable (name,city,mobile,email,quali,interest,country,fcm_id,created_at) 
 values ('$name','$city','$mobile','$email','$quali','$interest','$country','$fcm_id','$created_at')";
 
 if(mysqli_query($con,$Sql_Query)){
 
 echo 'Data Inserted Successfully';
 
 }
 else{
 
 echo 'Try Again';
 
 }
}
 
 mysqli_close($con);
?>