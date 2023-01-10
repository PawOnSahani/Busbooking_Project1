<%@ page language="java" contentType="text/html; charset=UTF-8"

    pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>Route</title>

</head>

<style>

body{

background-image:url('https://media-exp1.licdn.com/dms/image/C5612AQFOEuMCdHxCvA/article-cover_image-shrink_600_2000/0/1520140521229?e=2147483647&v=beta&t=7Kyc36XG35Z_AVgDQybx37ffPJeWbSyq8gzyFxllovQ');

background-repeat: no-repeat;

  background-attachment: fixed;

  background-size: 100% 100%;}



.signup-form{

    height:500px;

    width:600px;

    margin-top:5%;

    margin-left:25%;

}

.Signup-head{

    padding:8px;

}

.signup-content .radio{

    margin:10px 10px;

}

.signup-content2 .input{

    width:400px;

    padding:10px;

    margin:10px;

    color:black;

}

.signup-content2 .tarikh{

    margin:10px;

    padding:10px;

    color:black;

}

.signup-content2  .person{

    padding:10px;

    margin:10px;

    color:black;

}

.signup-content2 .travel{

    margin:20px 20px;

}

.signup-content2 .travel2{

    padding:5px;

}

.signup-content2 .submit-btn{

    border:none;

    outline:none;

    width:200px;

    padding:10px;

    margin-left:200px;

}</style>

<body>

    <form>



        <div class="signup-form bg-dark" style="background-color:white;padding-left:5%;width:40%">



            <div class="Signup-head bg-warning">

                <h1>Reserve Your Ticket</h1>

            </div>



            <div class="signup-content">

                <input type="radio" class="radio" name="r">

                <label class="text-white">One Way</label>

                <input type="radio" class="radio" name="r">

                <label class="text-white">Return</label>

            </div>



            <div class="signup-content2">

              

                 <label placeholder="From" class="input bg-dark">From</label>

            <select type="text"class="input bg-dark" placeholder="From">

                <option></option>

                <option>Kathmandu</option>

                <option>Pokhara</option>

                <option>Chitwan</option>

                <option>Jhapa</option>

                <option>Dhangadi</option>

                <option>Biratnagar</option>

                <option>Mustang</option>

                <option>Nepalgunj</option>

            </select> </br>

<label placeholder="From" class="input bg-dark">To</label>

             <select type="text"class="input bg-dark" placeholder="To">

                <option></option>

                <option>Kathmandu</option>

                <option>Pokhara</option>

                <option>Chitwan</option>

                <option>Jhapa</option>

                <option>Dhangadi</option>

                <option>Biratnagar</option>

                <option>Mustang</option>

                <option>Nepalgunj</option>

            </select></br>



            <label class="text-white" style="margin-left:10px;">Depart</label>

            <input type="date" class="tarikh bg-dark text-white">

            <label class="text-white" style="margin-left:10px;">Return</label>

            <input type="date" class="tarikh bg-dark">



            <input type="number" class="bg-dark person" placeholder="Adults">

            <input type="number" class="bg-dark person" placeholder="Children"><br>



            <label class="text-white travel">Travel Class</label>

            <select class="bg-dark text-white travel2">

                <option></option>

                <option>First Class/1A</option>

                <option>AC 2tier/2A</option>

                <option>AC 3tier/3A</option>

                <option>Executive class chair car/Economy Class</option>

                <option>AC Chair Car</option>

                <option>Sleeper Class</option>

                <option>Second Class</option>

                <option>General</option>

            </select>



            <input type="submit" value="Check Availability" class="submit-btn bg-warning">

        </div>

        </div>

    </form>

</body>

</html>

<body>



</body>

</html>