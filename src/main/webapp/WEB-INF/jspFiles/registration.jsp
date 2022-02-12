<!DOCTYPE html>
<html lang="en">
<head>
  <title>Registration Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>




<div class="container">
<h1> Registration Page</h1>
 
  <form action="register"  method="post">
  
    
    <div class="form-group">
      <label >Name:</label>
      <input type="text" class="form-control"  name="employeeName">
    </div>
    
     <div class="form-group">
      <label >Salary:</label>
      <input type="text" class="form-control"  name="salary">
    </div> 
  
  
    <div class="form-group">
      <label >Email:</label>
      <input type="email" class="form-control" name="emailId">
    </div>
    
    <div class="form-group">
      <label >Password:</label>
      <input type="password" class="form-control"  name="password">
    </div>
   
    <button type="submit" class="btn btn-primary">Register</button>
  </form>
</div>

</body>
</html>
