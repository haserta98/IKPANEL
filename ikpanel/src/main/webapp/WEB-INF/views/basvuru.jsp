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
    <title>İş Başvurusu</title>

    
  <!-- Bootstrap core JavaScript -->
  <script src="./../vendor/jquery/jquery.min.js"></script>
  <script src="./../vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <!-- Bootstrap core CSS -->
  <link href="./../vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="./../css/simple-sidebar.css" rel="stylesheet">
<script src="./../custom/basvuru.js"></script>
<script src="./../custom/isbasvurusu.js"></script>
</head>
<body>
  <br>
  <input type="text" hidden style="display: none;" value="${id}" id="id"/>

<div style="width: 60%;margin-left: 20%;" id="icerik">
 <h4 align=center id="isBaslik"> </h4>
<hr> 
 <p style="font-family: sans-serif" id="isAciklama"> </p>

<p style="font-family: sans-serif" >Alınacak kişi sayısı: <span id="isKisi"></span> </p>

<p style="font-family: sans-serif">Son başvuru tarihi : <span  id="isTarih"></span></p>
 
 <input type="text" hidden style="display: none;"  id="esas"/>
 
</div>


    <div style="width: 50%;font-size: 13px;margin-left: 25%" >
           
                  <label >Ad Soyad:</label>
                  <textarea class="form form-control" id="adi" style="height: 40px; width: 100%" ></textarea>
              
                  <label for="pwd">E-Posta:</label>
                  <textarea class="form form-control" id="epostasi" style="height: 40px; width: 100%" ></textarea>
              
                  <label for="pwd">Telefon:</label>
                  <textarea class="form form-control" id="telefonu" style="height: 40px; width: 100%" ></textarea>
                         
                  <label for="pwd">Adres:</label>
                  <textarea class="form form-control" id="adresi" style="height: 40px; width: 100%" ></textarea>
           
              <p>İş Hakkında Düşünceler</p>
              <textarea class="form form-control" id="dusunceleri" style="height: 100px; width: 100%" placeholder="Lütfen bu pozisyona neden başvuruduğunuzla ilgili bilgilendirici bir metin yazın."></textarea>
              <br>

              


              <button type="submit" class="btn btn-danger" style="margin-left: 90%" onclick="addApplicant()">Kaydet</button>

              <br>
              <br>

      </div>
   
        
</body>
</html>