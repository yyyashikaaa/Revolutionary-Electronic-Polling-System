<?php

    $host='localhost';
    $user='root';
    $password='';
    $dbname='reps';
    
    $dbconn=mysqli_connect($host,$user,$password,$dbname);

    if(isset($_POST['submitted']))
    {
    
        $target = "upload/".basename($_FILES['fileupload']['name']);
    
        $fname = $_POST['fname'];
        $lname = $_POST['lname'];
        $acn = $_POST['acn'];
        $c_id = $_POST['c_id'];
        $address = $_POST['address'];
        $constituency = $_POST['constituency'];
        $gender=$_POST['gender'];
        $dob = $_POST['dob'];
        $number = $_POST['number'];
        $mail = $_POST['mail'];
        $pname = $_POST['pname'];
        $pic = $_FILES['fileupload']['name'];
        $string = 'abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ';
                $string_shuffled = str_shuffle($string);
                $password = substr($string_shuffled, 1, 7);
        $sql= "insert into c_register(fname,lname,acn,c_id,address,constituency,gender,dob,number,mail,pname,pic,password)values('$fname','$lname','$acn','$c_id','$address','$constituency','$gender','$dob','$number','$mail','$pname','$pic','$password')";
     $q=mysqli_query($dbconn, $sql);
     if(mysqli_query($dbconn, $sql))
     {
            move_uploaded_file($_FILES['fileupload']['tmp_name'], $target);
            if($q)
            {
                    // ---------------- SEND MAIL FORM ----------------       
	               $to = "$mail";
                   $subject = "REPS";
                   $message = "<h4>VOTING DETAILS </h4><br><p> username:$c_id</p> <br> </p>password:$password</p><br><p>Happy Voting!</p>";
                   $header = "From:reps815@gmail.com \r\n";
         
                    $header  = "MIME-Version: 1.0\r\n";
                    $header  = "Content-type: text/html\r\n";
         
                    $retval = mail ($to,$subject,$message,$header);
         
                    if( $retval == true ) 
                    {
                        echo "<script> alert('Check Your Mail-id for Voting Details.')</script>";;
                    }
                    else 
                    {
                        echo "Error!";
                    }
	   
                    echo "<script>alert('Successfully registered');</script>";
        }
     }
}
        else
        {
            echo "<script>alert('Error Could't registered');</script>";
        }
?>



<html>
<head>
	<title>Revolutionary Electronic Polling System/Resistration</title>
	<link rel="stylesheet" type="text/css" href="style.css">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	<style type="text/css">
		body
		{
			margin:0;
			padding:0;
		}
		
		.ECI h1
		{
			color: white;

		}
		.register
		{
			margin:200px 5px 15px 250px;
			width:400px;
			height: 650px;
			box-shadow:0px 8px 16px 0px rgba(0,0,0,0.9);
			padding:80px 40px;
			padding-top: 70px;
			margin-top:150px;
			background-color: (0,0,0,0.4);
			border-radius:15px;
			-webkit-border-radius:15px;
			-o-border-radius:15px;
			-moz-border-radius:15px;
			box-shadow: inset -4px -4px rgba(0,0,0,0.5);
			background: linear-gradient(to left, #36486b 1%, #000066 90%); 
		}

		.user
		{
			width: 150px;
			height: 150px;
			position: absolute;
			top:calc(-100px/2);
			top:calc(50% -50px);
			margin-top: 392px;
			margin-left: 125px;
		}
		
		h1
		{
			margin:0 0 30px 0;
			padding:15px;
			color:#ff267e;
			text-align:center;
		}
		
		input
		{
			width:100%;
			margin-bottom:10px;
		}
		
		input[type=text],input[type=text],input[type=number],input[type=text],input[type=text],input[type=text],input[type=date],input[type=number],input[type=email],input[type=text],input[type=text],input[type=file],input[type=tel]
		{
			border:none;
			outline:none;
			border:2px #fff dotted;
			background:transparent;
			border-radius:20px;
			box-sizing:border-box;
			color:#FEFFFF;
			font-size:14px;
			font-weight: bolder;
			padding:5px;
			text-align:center;
		}
		input[type="radio"]
		{
			opacity:100%;
			width:10px;
			margin-left: 80px;
			color:#FEFFFF;
			padding-left: 50px;
		}
		label[for="male"],label[for="female"]
		{
			margin-bottom:10px;
			display:inline-block;
			padding-left: 0px;
			padding-right: 30px;
			/*background: url(check.png) no-repeat;
			background-position: 0 -32px;*/
			line height:24px;
			color:#FEFFFF;
			cursor:pointer;
			/*text-align: center;*/
		}
		
		{
		
			color:#ce1010;
		}

		*::-webkit-input-placeholder 
		{
    		color: white;
		}
		*:-moz-placeholder 
		{
    		color: white;
		}
		*::-moz-placeholder 
		{
    		color: white;
		}
		*:-ms-input-placeholder {
   			color: white;
		}

		input[type=Submit]
		{
			border:none;
			outline:none;
			padding:10px;
			margin-top: 10px;
			color:#fff;
			font-size:20px;
			font-family:Arial;
			background:#ff267e;
			cursor:pointer;
			border-radius:20px;
		}
		
		input[type=Submit]:hover
		{
			bakground:#efed40;
			color:#262626;
		}

		<div style="border:1px solid red;float:left">
	   		<input type="radio" />
		</div>

		
	</style>
</head>
<body>
	<div id="grad1">
	
	<div class="image">
		<img src="image\REPS img2.png" 
		alt="ECI logo" style="width:175px;height:146px;">
	</div>
	<div class="ECI">
		<center>
		<h1><font face="Times New Roman">Revolutionary Electronic Polling System </font></h1>
		</center>
	</div>
</div>

	<header>
		<nav>
			<ul id="nav">
				<li><a class="homeblack" href="process.php">Home</a></li>
				<li><a class="homeblack" href="profile.php">Profile</a></li>
				<li><a class="homered" href="Candidate_Registration.php">Candidate Registration</a></li>
				<li><a class="homeblack" href="#">Upload Result</a></li>
			</ul>
		</nav>
	</header>
	<div class="divider"></div>

<!-- log strip ends..............................-->
	<tr>
	<td height="53">
		<img src="image/eci_logostrip.jpg" style="width: 100%;">
	</td>
 </tr>

 <!-- log strip ends..............................-->


<div class="register">
	<img src="image/register1.png" class="user">
	<h1>Register Here</h1>
	<form action="#" method="post" enctype="multipart/form-data" >
	
		<input type="text" name="fname" placeholder="First Name" required >
		<input type="text" name="lname" placeholder="Last Name" required >
		<input type="number" name="acn" placeholder="Aadhar Card Number" maxlength="12" required >
		<input type="text" name="c_id" placeholder="Candidate ID" required >
		<input type="text" name="address" placeholder="Permanent Address" required >
		<input type="text" name="constituency" placeholder="Constituency" required >
		<input type="radio" id="male" name="gender" required value="male"  >Male
		<!--<label for="male" >Male</label>-->
		<input type="radio" id="female" name="gender" required value="female" >Female
		<!--<label for="female">Female</label>-->
		<input type="date" name="dob" placeholder="Date of Birth" required >
		<input type="tel" name="number" placeholder="Contact Number" required pattern="[789][0-9]{9}" >
		<input type="email" name="mail" placeholder="Email ID" required >	
		<input type="text" name="pname" placeholder="Party Name" required >
		<input type="file" name="fileupload" value="fileupload" id="fileupload" required>
				<label for="fileupload">Select a emblem to upload</label>
				<!--<input type="image">-->	
		<input type="Submit" value="Submit" name="submitted"> 
		
	</form>
</div>
<div id="message">
<?php include 'uploadphp.php';?>
</div>
<!--footer starts-->
<footer>
	<div id="footer-inner">
		<!--<section class="one-third" id="footer-third">
			<h3>contact</h3>
			<p class="footercontent">The reps is revolutioanry electronic polling system</s><br>
			</p>
		</section>-->
		<section class="one-third" id="footer-third">
			<h3>social</h3>
			<br>
			<ul class="social">
				<li><a href="https://www.facebook.com/Revolutionary-Electronic-Polling-System-247817965747003/" target="_blank"><i class="fa fa-facebook"></i></a></li>
				<li><a href="http://www.youtube.com/eci" target="_blank"><i class="fa fa-youtube"></i></a></li>
			</ul>
		</section>

		<section class="one-third" id="footer-third-last">
			<h3>Pages</h3>
			<br>
			<h5>
				<a href="process.php">Home</a> -
				<a href="profile.php">Profile</a> -
				<a href="Candidate_Registration.php">Candidate Registration</a> -
				<a href="#">Upload Result</a> 
				
			</h5>

		</section>
	</div>
</footer>
<footer class="second">
	<p>&copy REVOLUTIONARY ELECTRONIC POLLING SYSTEM, 2017</p>
</footer>
</body>
</html>