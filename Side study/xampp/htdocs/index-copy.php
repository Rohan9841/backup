
<?php
function insert_cutpoints ($cutpoints){
 include('connection.php');
    $phase_name='Alatin'; 
    $enzyme='HinP1I';
foreach ($cutpoints as $element ){   
    
 $in= $conn->prepare("INSERT INTO cutpoints(phase_name,enzyme, cutpoints) VALUES (?,?,?)");

 			$in->bind_param ('ssi',$phase_name,$enzyme,$element);
            
 			if($in->execute())    
 			{  
 				echo "It's working";
 			}
    else {
        
        echo "Its not<br>";
    }
    
}
}


// Calling the $insert_cutpoints function

//$cutpoints=array(17159,17241,32550,42357);
//insert_cutpoints("Alatin",$cutpoints);

$posOfCuts = array();

//CALL THIS FUNCTION TO INSERT THE CUTPOINTS IN THE DATABSE cutpoints TABLE
//insert_cutpoints($posOfCuts);

 /*

   $enzyme_name = "Rohan";
   $phage_name = "Alatin";
   $base_pair = NULL;
 include('connection.php');
 $insert= $conn->prepare("INSERT INTO data(phase_name,enzyme_name,base_pair) VALUES (?,?,?)");

 			$insert->bind_param ('ssi', $phage_name,$enzyme_name,$base_pair);

			

 			if($insert->execute())

 			{

                
 				//echo "It's working";

				

 			}

$out="";
$count_string=0;
$count_int=0;

$handle = fopen("C:/xampp/htdocs/dashboard/hello/AatII.txt", "r");
if ($handle) {
    while (($line = fgets($handle)) !== false) {
        // process the line read.
        echo $line;
           echo "<br>";   
        if (is_string($line)){
        //    $count_string++;
        }
        
        if (is_numeric($line)){
       //      $count_string++;
         }
         
     
     
    }
    
    //  echo $count_string;
    //      echo $count_int;
    fclose($handle);
} 
else {
    // error opening the file.
} 
	*/	
?>

		