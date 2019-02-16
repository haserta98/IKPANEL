<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page session="false" %>

<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>İnsan Kaynakları Paneli</title>

  <!-- Bootstrap core CSS -->
  <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="css/simple-sidebar.css" rel="stylesheet">

</head>

<body>

  <div class="d-flex" id="wrapper">

    <!-- Sidebar -->
    <div class="bg-light border-right" id="sidebar-wrapper">
      <div class="sidebar-heading">İnsan Kaynakları Paneli</div>
      <div class="list-group list-group-flush">
        <a href="index" class="list-group-item list-group-item-action bg-light" >İş İlanı Ekle</a>
        <a href="ilanliste.html" class="list-group-item list-group-item-action bg-light" >İş İlanları</a>
        <a href="basvurankisi" class="list-group-item list-group-item-action bg-light">Başvuran Kişiler</a>
		 <a href="duyurular" class="list-group-item list-group-item-action bg-light">Duyurular</a>
        <a href="duyuruekle" class="list-group-item list-group-item-action bg-light">Duyuru Ekle</a>
  <div style="position: fixed; bottom: 0px; padding-left: 60px"> <p align=center id="dateDemo"></p> </div>
      </div>
    </div>
    <!-- /#sidebar-wrapper -->

    <!-- Page Content -->
    <div id="page-content-wrapper">

      <nav class="navbar navbar-expand-lg navbar-light bg-light border-bottom">
        <button class="btn btn-primary" id="menu-toggle">Menüyü Gizle</button>

        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
          <ul class="navbar-nav ml-auto mt-2 mt-lg-0">
            <li class="nav-item active">
              <a class="nav-link" href="isilanlari">İş İlanları<span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="https://kodgemisi.com/">Kod Gemisi</a>
            </li>
           
          </ul>
        </div>
      </nav>

      <div class="container-fluid">
        <div>
          <br>
        
          <h5 class="fh5co-article-title animate-box" style="">Duyuru : </h5>
          <p ><span style="color: red">**</span> Duyurular ileriki tarihte yapmanız gerekenler için kendinize bir not niteliği taşır.</p>
        <textarea class="form form-control" id="duyuruekleme" rows="6" style="width: 60%;"></textarea>
        <br>
     
        
        <button class="btn btn-primary" style="margin-left: 54%" onclick="addAnno()">Kaydet</button>

      </div>
      </div>
    </div>
    <!-- /#page-content-wrapper -->

  </div>
  <!-- /#wrapper -->

  <!-- Bootstrap core JavaScript -->
  <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <script src="custom/duyuruekle.js"></script>

  <!-- Menu Toggle Script -->
  <script>
    $("#menu-toggle").click(function(e) {
      e.preventDefault();
      $("#wrapper").toggleClass("toggled");
    });
  </script>
<script>

var d = new Date();
var months = ["Ocak", "Şubat", "Mart", "Nisan", "Mayıs", "Haziran", "Temmuz", "Ağustos", "Eylül", "Ekim", "Kasım", "Aralık"];
document.getElementById("dateDemo").innerHTML = d.getDate()+" "+months[d.getMonth()]+" "+d.getFullYear();  
</script>

</body>

</html>
