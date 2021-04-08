<?php
    $goodsid =$_GET['id'];
    $goodsName =$_GET['name'];
    $goodsPrice =$_GET['price'];
    $goodsQuantity =$_GET['quantity'];
    $hostname = "localhost";
    $username = "root";
    $password = "12345";
    $dbname = "departmentstore";
    $conn=mysqli_connect($hostname,$username,$password);
    echo '<center>';
    if(!$conn) die("Can't connect with mySQL");
    mysqli_select_db($conn,$dbname) or die("Cannot select departmentStore datadase");

    $sql ="insert into goods (goodsid,goodsName,goodsPrice,goodsQuantity) values ('$goodsid','$goodsName','$goodsPrice','$goodsQuantity')";

    mysqli_query($conn,$sql) or die("Inert into the goods table an error occurred".mysqli_error());

   /*echo "id: ",$id;
   echo "</br>name:",$name;
   echo "</br>price: ",$price;
   echo "</br>quantity: ",$quantity*/?>
   <a href='main.php'> Show goods </a>


