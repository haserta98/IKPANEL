<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page session="false" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Admin Girişi</title>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

</head>
<body style="background-color:whitesmoke; font-family: Arial">

<div style=  "max-width: 400px; z-index: 100;margin: 0 auto;padding-top: 40px;" > 
        <div align=center>
                <span><img id="imageLogo" class="img-circle" style="max-width: 168px; max-height: 168px;" src="login/assets/images.jpg" /></span>
            </div>
            
            <br/>
            <br/>

            <div align=center><p style="font-size: 22px;font-family: Calibri;color: black"><b> İnsan Kaynakları Yönetici Girişi</b></p></div>
            <br/>


        <form>
                <div class="input-group">
                  <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                  <input id="email" type="text" class="form-control" name="email" placeholder="E-Posta Adresi">
                </div>
                <br/>
                
                <div class="input-group">
                  <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                  <input id="pass" type="password" class="form-control" name="password" placeholder="Parola">
                </div>
               
              </form>
              <br/>
              <br/>
             <div align=center>
        <button type="button" class="btn btn-danger" style="width: 300px;" onclick="controlHRM()"> Giriş Yap</button>
        <br/>
        <br/>
    
 
       
            <br/>
            <br/>
            <br/>
            
        <div><p><b>Sefa Mert Kaya ©</b></p>  </div>
    
    </div> 
    </div>
    <script src="login/js/login.js"></script>

</body>
</html>