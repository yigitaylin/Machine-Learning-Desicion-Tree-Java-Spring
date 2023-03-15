<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@page session="false" %>

<%@ page import="java.util.*" %>




<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <title>KAZA SONUCU TAHMİN SİSTEMİ</title>
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <meta name="description" content="Your page description here" />
  <meta name="author" content="" />

  <!-- css -->
  <link href="https://fonts.googleapis.com/css?family=Handlee|Open+Sans:300,400,600,700,800" rel="stylesheet">
  <link href="asset/css/bootstrap.css" rel="stylesheet" />
  <link href="asset/css/bootstrap-responsive.css" rel="stylesheet" />
  <link href="asset/css/flexslider.css" rel="stylesheet" />
  <link href="asset/css/prettyPhoto.css" rel="stylesheet" />
  <link href="asset/css/camera.css" rel="stylesheet" />
  <link href="asset/css/jquery.bxslider.css" rel="stylesheet" />
  <link href="asset/css/style.css" rel="stylesheet" />

  <!-- Theme skin -->
  <link href="asset/color/default.css" rel="stylesheet" />

  <!-- Fav and touch icons -->
  <link rel="apple-touch-icon-precomposed" sizes="144x144" href="asset/ico/apple-touch-icon-144-precomposed.png" />
  <link rel="apple-touch-icon-precomposed" sizes="114x114" href="asset/ico/apple-touch-icon-114-precomposed.png" />
  <link rel="apple-touch-icon-precomposed" sizes="72x72" href="asset/ico/apple-touch-icon-72-precomposed.png" />
  <link rel="apple-touch-icon-precomposed" href="asset/ico/apple-touch-icon-57-precomposed.png" />
  <link rel="shortcut icon" href="asset/img/logo1.png" />

  <!-- =======================================================
    Theme Name: Eterna
    Theme URL: https://bootstrapmade.com/eterna-free-multipurpose-bootstrap-template/
    Author: BootstrapMade.com
    Author URL: https://bootstrapmade.com
  ======================================================= -->
  
  
 <script type="text/javascript">
 
function sonuc() {
 
var il = document.getElementById("il").value;
var aracadeti=document.getElementById("aracadeti").value;
var havatipi=document.getElementById("havatipi").value;
var aractipi=document.getElementById("aractipi").value;
var mevsim=document.getElementById("mevsim").value;
var günler=document.getElementById("günler").value;
var hour=parseInt(document.getElementById("hour").value);
var minute=parseInt(document.getElementById("minute").value);

var ölümlü;
var büyüksehir=0,ay=0,gün=0,araccinsi=0,aracsayisi=1,havadurumu=0,saat=0;



if(il=="ADANA" || il=="ANKARA" ||  il=="ANTALYA" ||  il=="BURSA" ||  il=="İSTANBUL" ||  il=="İZMİR" || il=="KONYA" ){büyüksehir=1;}
else{büyüksehir=0;}


 
if(günler=="CUMARTESİ" || günler=="PAZAR") {gün=1;}
else{gün=0;}


if(aractipi=="5-Otomobil"){araccinsi=1; }
else{araccinsi=0;}


if(aracadeti=="1-Tek Araçlı") {aracsayisi=1;}
else if(aracadeti=="2-İki Araçlı") {aracsayisi=2;}
else if(aracadeti=="3-Çok Araçlı") {aracsayisi=3;}

if(havatipi=="1-Açık"){havadurumu=1;}
else{havadurumu=0;}
	
if(mevsim=="İLKBAHAR") {ay=0;}
else if(mevsim=="YAZ") {ay=1;}
else if(mevsim=="SONBAHAR") {ay=2;}
else if(mevsim=="KIŞ") {ay=3;}


if(hour>=00 && hour<04) {saat=0;}
else if(hour>=04 && hour<08) {saat=1;}
else if(hour>=08 && hour<12) {saat=2;}
else if(hour>=12 && hour<16) {saat=3;} 
else if(hour>=16 && hour<20) {saat=4;}
else if(hour>=20 && hour<24) {saat=5;}
	


if (havadurumu == 0)
{
 if (ay>=0 && ay<3)  {ölümlü='F';}
 else if(ay==3)
    {
   if   (aracsayisi == 1)
    {
         if (gün == 0) 
      {
            
          if  (saat == 1) 
         {
              if  (araccinsi == 0)  {ölümlü ='F';}
              else { ölümlü ='T';}
         }
          else if (saat == 2)
            { 
                 
                 if  (büyüksehir == 1)
                 {  
                    if  (araccinsi == 0)  {ölümlü ='T';}
                    else {ölümlü='F';}
                 }
                 else  {ölümlü='F';}
            }
            
          else  if  (saat == 5)
       { 
               if (büyüksehir == 0)  {ölümlü ='T';}
               else {ölümlü ='F';}
       }
          
          else {ölümlü ='F';}                           
   }
         else  {ölümlü ='F';}
  }
   else   {ölümlü ='F';}
         
   }
}  





else if (havadurumu == 1)
{
if   (büyüksehir == 0)  
 {
    if  (aracsayisi == 1)  
   {
        if (gün == 0)  
       {
           if  (ay == 0) 
            {
               
               if (saat == 1) 
                 { 
                  if (araccinsi == 0)  {ölümlü ='F';}
                  else  {ölümlü ='T';}
                 }
               else if(saat == 3)  
               {
                 if  (araccinsi == 0) { ölümlü='F';}
                 else  { ölümlü ='T';}
               }
               else   {ölümlü='F';}
            }
           else if  (ay == 1)  
           {
              if (saat == 1) 
                { 
               if  (araccinsi == 0)   {ölümlü ='T';}
               else  {ölümlü='F';}
                }
              else if (saat>=3 && saat<=5 )
               {  
                if  (araccinsi == 0)  {ölümlü='T';}
                else  {ölümlü ='F';}
               }
              else  {ölümlü='T';}
              
           }
          else  if  (ay == 2) 
           { 
             if (saat == 0)
                 {  
                if  (araccinsi == 0)  {ölümlü ='F';}
                else  { ölümlü='T';}
                 }
             else if (saat == 1) { ölümlü ='F';}
             else if  (saat == 2)  {ölümlü='T';}
             else if (saat == 3) 
                { 
                if  (araccinsi == 0)  {ölümlü ='T';}
                else  { ölümlü ='F';}
                }
             else if (saat == 4)  
               {
                if  (araccinsi == 0)  {ölümlü='F';}
                else  { ölümlü ='T';}
               }
             else if (saat == 5)   {ölümlü ='T';}
           }
        
          else if  (ay == 3)  
           {
             if  (saat == 0)  
                {
                if (araccinsi == 0)  {ölümlü ='F';}
                else {ölümlü='T';}
                }
             else if (saat>=1 && saat<=2)  {ölümlü ='F';}
             else if   (saat == 3)
               {  
                 if (araccinsi == 0)  {ölümlü ='T';}
                 else  {ölümlü ='F';}
               }
             else if (saat == 4) { ölümlü ='F';}
             else if (saat == 5)
              {  
                if  (araccinsi == 0)  {ölümlü='T';}
                else { ölümlü='F';}
              }
         }
     }
   
       else
       {  
            if  (ay == 1) 
              { 
               if  (saat >=0 && saat<=2)  { ölümlü='F';}
               else if (saat>3 && saat<=5)  {ölümlü ='F';}
               else {ölümlü ='T';}
             }
           else   { ölümlü='F';}    
       }
  }
     
   else  if (aracsayisi == 2)  
       {
       if  (ay == 0) 
         { 
          if  (saat == 0)  
              {
            if  (gün == 0)  {ölümlü='T';}
            else  {ölümlü ='F';}
             }
          else if (saat == 1)  {ölümlü='F';}
          else if  (saat == 2)
             {  
            if  (gün == 1)
               {  
                if  (araccinsi == 0)  {ölümlü='T';}
                else  {ölümlü='F';}
               }
            else  {ölümlü ='F';}
             }
          else if (saat == 3) 
            { 
            if  (gün == 0)  
              {
                if  (araccinsi == 0)  {ölümlü ='T';}
                else { ölümlü='F';}
               }
            else  {ölümlü ='T';}
             }
          else if (saat == 4)  
          {
            if  (araccinsi == 0)
             {  
               if  (gün == 0)  {ölümlü='T';}
               else  {ölümlü ='F';}
             }
            else  {ölümlü ='F';}
          }
          else if (saat == 5)  {ölümlü='F';}
         }
       else if  (ay == 1)  
         {
         if  (araccinsi == 0)  
            {
       	  if  (saat >=0 && saat<=2)  { ölümlü='F';}
             else if (saat>3 && saat<=5)  {ölümlü ='F';}
             else {ölümlü ='T';}
           }
         else  {ölümlü ='F';}
         }
      else if  (ay == 2) 
         {
          if (saat == 0)  
             {
            if  (gün == 0)  
              {
               if  (araccinsi == 0)  {ölümlü ='F';}
               else { ölümlü ='T';}
              }
            else   {ölümlü='F';}
            }
          else { ölümlü ='F';}
        }
      else   {ölümlü ='F';}
     }
   else  {ölümlü='F';}
  }
  
  
else 
{ 
 if (saat == 0)  
   {
     if (ay==0)   
       {
       if (aracsayisi == 2)  
          {
        if   (gün == 0)  
           {
           if   (araccinsi == 0)  {ölümlü='F';}
           else { ölümlü ='T';}
           }
        else { ölümlü ='F';}
         }
       else  {ölümlü='F';}
      }
     else if (ay == 1) { ölümlü='F';}
     else if (ay == 2)  
       {
        if (aracsayisi == 2)  
         {
         if  (gün == 0)   {ölümlü ='T';}
         else  {ölümlü='F';}
         }
        else  {ölümlü='F';}
      }
     else if (ay == 3) 
        { 
      if   (aracsayisi == 1) 
          {
           if (araccinsi == 0)  {ölümlü ='T';}
           else {ölümlü ='F';}
         } 
      else if  (aracsayisi>=2 && aracsayisi<=3)  {ölümlü ='F';}
     }
  }
 else if (saat == 1)
    {  
     if (gün == 0) { ölümlü ='F';}
     else if(gün == 1) 
       { 
        if (ay==0)  
           {
           if (aracsayisi == 1) { ölümlü='T';}
           else { ölümlü ='F';}
           }
        else if (ay == 2) 
            { 
           if (aracsayisi == 2)  {ölümlü='F';}
           else  {ölümlü ='T';}
            }
        else { ölümlü='F';}
       }
     }
 else if (saat == 2)  
    {
    if  (ay == 0)  
      {
       if  (araccinsi == 0)  
           {
           if (aracsayisi == 1)  
             {
              if (gün == 0)  {ölümlü ='T';}
              else  {ölümlü='F';}
             }
           else if (aracsayisi == 2)  {ölümlü ='T';}
           else  {ölümlü ='F';}
         }
       else  {ölümlü='F';}
       }
    else if  (ay == 2)  
      {
        if (aracsayisi == 1)  
           {
          if (araccinsi == 1) 
             { 
            if  (gün == 0)  {ölümlü='T';}
            else  {ölümlü='F';}
             }
          else { ölümlü ='F';}
          }
        else  {ölümlü='F';}
     }
    else  {ölümlü ='F';}
    }
 else if  (saat == 3) 
  {  
     if (gün == 1)  
       {
       if  (ay == 0)  
         {
          if  (aracsayisi == 1) 
            { 
             if (araccinsi == 0)  {ölümlü='T';}
             else  {ölümlü='F';}
             }
          else { ölümlü ='F';}
           }
       else  {ölümlü ='F';}
      }
     else  {ölümlü ='F';}
    }

 else if (saat == 5)  
    {
     if (aracsayisi == 1)  
       {
       if  (ay == 2) 
          { 
           if (gün == 0)  {ölümlü='T';}
           else {ölümlü ='F';}
          }
       else  {ölümlü ='F';}
      }
     else  {ölümlü ='F';}
   }
 else  {ölümlü ='F';}
 }    
}
  
	

if(il=="İl Seçiniz" || aracadeti=="Araç Sayısı Seçiniz" || havatipi=="Hava Durumu Seçiniz" || aractipi=="Araç Tipi Seçiniz" || mevsim=="Mevsim Seçiniz" || günler=="Gün Seçiniz" || hour=="Saat Seçiniz" || minute=="Dakika Seçiniz")
{
	alert("Lütfen doğru seçim  yapınız!!!")
}


else if(ölümlü=='T')
{
  
	document.getElementById("demo").innerHTML = "ÖLÜMLÜ"; 
}
 
else
{
 
	document.getElementById("demo").innerHTML = "ÖLÜMLÜ DEĞİL";
}


}


 
</script>
 
 
 <style>

#demo{

border-radius: 25px;

border: 2px solid #FF4500;

background:#FF4500 ;

padding: 20px; 
  
width: 125px;
  
height: 30px;  
 
font-size:22px;
 
color:black;

font-family : "Arial Black", Gadget, sans-serif



}









</style>
 
  
</head>



<body>

  <div id="wrapper">

    <!-- start header -->
    <header>
      <div class="top">
        <div class="container">
          <div class="row">
            <div class="span6">
              
            </div>
            <div class="span6">

              
            </div>
          </div>
        </div>
      </div>
      <div class="container">


        <div class="row nomargin">
          <div class="span4">
            <div class="logo">
              <a href="index.html"><img src="asset/img/logo.png" alt="" /></a>
            </div>
          </div>
          <div class="span8">
            <div class="navbar navbar-static-top">
              <div class="navigation">
                <nav>
                  <ul class="nav topnav">
                  
                      <li>
                      <a href="anasayfa"><i class="icon-home"></i>Anasayfa</a>
                      </li>
                   
                      <li class="active">
                      <a href="sonuc">Kaza Sonucu Tahmin Sistemi</a>
                      </li>
                      
                   
                  </ul>
                </nav>
              </div>
              <!-- end navigation -->
            </div>
          </div>
        </div>
      </div>
    </header>
    <!-- end header -->

    <section id="inner-headline">
      <div class="container">
        <div class="row">
          <div class="span12">
            <div class="inner-heading">
             
             <ul class="breadcrumb">
                <li><h2>KAZA SONUCUNUN ÖLÜMLÜ OLUP OLMADIĞINI TAHMİN EDEN SİSTEM</h2></li>
              </ul>
           </div>
      </section>
            
            
             <section id="content">
      <div class="container">
        <div class="row">
          <div class="span30">
                       
                <div class="span4">
                     <label for="il"><font face="Times New Roman" size="3" color="black">İL:</font></label>
                     <select  class="form-control"  data-rule="minlen:4" name="il" id="il">
                           <option>İl Seçiniz</option>
                           <option>ADANA</option>
                           <option>ADIYAMAN</option>
                           <option>AFYON</option>
                           <option>AĞRI</option>
                           <option>AMASYA</option>
                           <option>ANKARA</option>
                           <option>ANTALYA</option>
                           <option>ARTVİN</option>
                           <option>AYDIN</option>
                           <option>BALIKESİR</option>
                           <option>BİLECİK</option>
                           <option>BİNGÖL</option>
                           <option>BİTLİS</option>
                           <option>BOLU</option>
                           <option>BURDUR</option>
                           <option>BURSA</option>
                           <option>ÇANAKKALE</option>
                           <option>ÇANKIRI</option>
                           <option>ÇORUM</option>
                           <option>DENİZLİ</option>
                           <option>DİYARBAKIR</option>
                           <option>EDİRNE</option>
                           <option>ELAZIĞ</option>
                           <option>ERZİNCAN</option>
                           <option>ERZURUM</option>
                           <option>ESKİŞEHİR</option>
                           <option>GAZİANTEP</option>
                           <option>GİRESUN</option>
                           <option>GÜMÜŞHANE</option>
                           <option>HAKKARİ</option>
                           <option>HATAY</option>
                           <option>ISPARTA</option>
                           <option>İÇEL</option>
                           <option>İSTANBUL</option>
                           <option>İZMİR</option>
                           <option>KARS</option>
                           <option>KASTOMONU</option>
                           <option>KAYSERİ</option>
                           <option>KIRKLARELİ</option>
                           <option>KIRŞEHİR</option>
                           <option>KOCAELİ</option>
                           <option>KONYA</option>
                           <option>KÜTAHYA</option>
                           <option>MALATYA</option>
                           <option>MANİSA</option>
                           <option>KAHRAMANMARAŞ</option>
                           <option>MARDİN</option>
                           <option>MUĞLA</option>
                           <option>MUŞ</option>
                           <option>NEVŞEHİR</option>
                           <option>NİĞDE</option>
                           <option>ORDU</option>
                           <option>RİZE</option>
                           <option>SAKARYA</option>
                           <option>SAMSUN</option>
                           <option>SİİRT</option>
                           <option>SİNOP</option>
                           <option>SİVAS</option>
                           <option>TEKİRDAĞ</option>
                           <option>TOKAT</option>
                           <option>TRABZON</option>
                           <option>TUNCELİ</option>
                           <option>ŞANLIURFA</option>
                           <option>UŞAK</option>
                           <option>VAN</option>
                           <option>YOZGAT</option>
                           <option>ZONGULDAK</option>
                           <option>AKSARAY</option>
                           <option>BAYBURT</option>
                           <option>KARAMAN</option>
                           <option>KIRIKKALE</option>
                           <option>BATMAN</option>
                           <option>ŞIRNAK</option>
                           <option>BARTIN</option>
                           <option>ARDAHAN</option>
                           <option>IĞDIR</option>
                           <option>YALOVA</option>
                           <option>KARABÜK</option>
                           <option>KİLİS</option>
                           <option>OSMANİYE</option>
                           <option>DÜZCE</option>
                       </select>
                  <div class="validation"></div>
                </div></br></br>
          
          
                
                 <div class="span4">
                <label for="havadurumu"><font face="Times New Roman" size="3" color="black">HAVA DURUMU:</font></label>
                 <select class="form-control"  data-rule="minlen:4" name="havatipi" id="havatipi" >
                
                    <option>Hava Durumu Seçiniz</option>
                    <option>1-Açık</option>
                    <option>2-Sis/Duman</option>
                    <option>3-Yağmur</option>
                    <option>4-Kar</option>
                    <option>5-Sulusepken</option>
                    <option>6-Dolu</option>
                    <option>7-Tipi</option>
                    <option>8-Kuvvetli Rüzgar</option>
                    <option>9-Toz/Kum Fırtınası</option>    
                 </select>
                  <div class="validation"></div>
                </div></br></br>
              
          
          
          
                 <div class="span4">
                <label for="aracadeti"><font face="Times New Roman" size="3" color="black">ARAÇ SAYISI:</font></label>
                 <select class="form-control"  data-rule="minlen:4" name="aracadeti" id="aracadeti" >
                 
                    <option>Araç Sayısı Seçiniz</option>
                    <option>1-Tek Araçlı</option>
                    <option>2-İki Araçlı</option>
                    <option>3-Çok Araçlı</option>   
                 </select>
               
                  <div class="validation"></div>
                </div></br></br>
          
            <div class="span4"> 
               <label for="aractipi"><font face="Times New Roman" size="3" color="black">ARAÇ TİPİ:</font></label>
                 <select class="form-control"  data-rule="minlen:4" name="aractipi"  id="aractipi">
                 
                    <option>Araç Tipi Seçiniz</option>
                    <option>1-Bisiklet</option>
                    <option>2-At Arabasi</option>
                    <option>3-Motorlu Bisiklet</option>
                    <option>4-Motosiklet</option>   
                    <option>5-Otomobil</option>   
                    <option>6-Minibüs</option>   
                    <option>7-Kamyonet</option>   
                    <option>8-Kamyon</option>   
                    <option>9-Çekici </option>   
                    <option>10-Otobüs</option>   
                    <option>11-Traktör</option>   
                    <option>12-Arazi Tasiti</option>   
                    <option>13-Özel Amaçli</option>   
                    <option>14-Is Makinesi</option>  
                    <option>15-Ambulans</option>  
                    <option>16-Tanker</option>  
                    <option>17-Tren</option>  
                    <option>18-Tramvay</option>  
                    <option>19-Diğer</option>  
                        
                 </select>
                  <div class="validation"></div>
                </div></br></br>
          
          
            
                 <div class="span4">
                 <label for="ay"><font face="Times New Roman" size="3" color="black">MEVSİM:</font></label>
                 <select class="form-control"  data-rule="minlen:4" name="mevsim" id="mevsim">
                
                    <option>Mevsim Seçiniz</option>
                    <option>İLKBAHAR</option>
                    <option>YAZ</option>
                    <option>SONBAHAR</option> 
                    <option>KIŞ</option> 
                       
                 </select>
                  <div class="validation"></div>
                  </div></br></br>
                  
                 
                <div class="span4">
               <label for="gün"><font face="Times New Roman" size="3" color="black">GÜN:</font></label>
                 <select class="form-control"  data-rule="minlen:4" name="günler" id="günler" >
                    
                    <option>Gün Seçiniz</option>
                    <option>PAZARTESİ</option>
                    <option>SALI</option>
                    <option>ÇARŞAMBA</option> 
                    <option>PERŞEMBE</option> 
                    <option>CUMA</option> 
                    <option>CUMARTESİ</option> 
                    <option>PAZAR</option>    
                 </select>
                  <div class="validation"></div>
                  </div></br></br>
                  
             
                   <div class="span4">
                     <label for="saat"><font face="Times New Roman" size="3" color="black">SAAT:</font></label>
                 <select class="hour"  data-rule="minlen:4" name="hour" id="hour">
                    
                     <option>Saat Seçiniz</option>
                     <option>00</option>
                     <option>01</option>
                     <option>02</option>
                     <option>03</option>
                     <option>04</option>
                     <option>05</option>
                     <option>06</option>
                     <option>07</option>
                     <option>08</option>
                     <option>09</option>
                     <option>10</option>
                     <option>11</option>
                     <option>12</option>
                     <option>13</option>
                     <option>14</option>
                     <option>15</option>
                     <option>16</option>
                     <option>17</option>
                     <option>18</option>
                     <option>19</option>
                     <option>20</option>
                     <option>21</option>
                     <option>22</option>
                     <option>23</option>  
                 </select>
                 
            
                  
                  </select>&nbsp;:&nbsp;
                 
                 <select class="minute " style="width: auto;" name="minute" id="minute">
                 <option>Dakika Seçiniz</option>
                 <option>00</option>
                 <option>01</option>
                 <option>02</option>
                 <option>03</option>
                 <option>04</option>
                 <option>05</option>
                 <option>06</option>
                 <option>07</option>
                 <option>08</option>
                 <option>09</option>
                 <option>10</option>
                 <option>11</option>
                 <option>12</option>
                 <option>13</option>
                 <option>14</option>
                 <option>15</option>
                 <option>16</option>
                 <option>17</option>
                 <option>18</option>
                 <option>19</option>
                 <option>20</option>
                 <option>21</option>
                 <option>22</option>
                 <option>23</option>
                 <option>24</option>
                 <option>25</option>
                 <option>26</option>
                 <option>27</option>
                 <option>28</option>
                 <option>29</option>
                 <option>30</option>
                 <option>31</option>
                 <option>32</option>
                 <option>33</option>
                 <option>34</option>
                 <option>35</option>
                 <option>36</option>
                 <option>37</option>
                 <option>38</option>
                 <option>39</option>
                 <option>40</option>
                 <option>41</option>
                 <option>42</option>
                 <option>43</option>
                 <option>44</option>
                 <option>45</option>
                 <option>46</option>
                 <option>47</option>
                 <option>48</option>
                 <option>49</option>
                 <option>50</option>
                 <option>51</option>
                 <option>52</option>
                 <option>53</option>
                 <option>54</option>
                 <option>55</option>
                 <option>56</option>
                 <option>57</option>
                 <option>58</option>
                 <option>59</option>
         </select></span>
        <div class="validation"></div>
                  </div></br></br></br></br>
                  
                  
       
             
       <button class="btn btn-theme" onclick="sonuc()">SONUÇ</button>
       </br></br>

        <p id="demo"></p>
        
              </section>

            </div>
          </div>
        </div>
      </div>
    </section>
                   
            </div>
          </div>
        </div>
      </div>
    </section>

    <section id="content">
      
      <div class="container">
        <div class="row">
          <div class="span8">
            
            
        
          </div>
          <div class="span4">
            <div class="clearfix"></div>
            <aside class="right-sidebar">

              <div class="widget">
                

              </div>
            </aside>
          </div>
        </div>
      </div>
    </section>

    <footer>
      <div class="container">
        <div class="row">
          <div class="span4">
            <div class="widget">
       
                </div>
              </form>
            </div>
          </div>
        </div>
      </div>

    </footer>
  </div>
  

  <!-- javascript
    ================================================== -->
  <!-- Placed at the end of the document so the pages load faster -->
  <script src="asset/js/jquery.js"></script>
  <script src="asset/js/jquery.easing.1.3.js"></script>
  <script src="asset/js/bootstrap.js"></script>

  <script src="asset/asset/js/modernizr.custom.js"></script>
  <script src="asset/js/toucheffects.js"></script>
  <script src="asset/js/google-code-prettify/prettify.js"></script>
  <script src="asset/js/jquery.bxslider.min.js"></script>

  <script src="asset/js/jquery.prettyPhoto.js"></script>
  <script src="asset/js/portfolio/jquery.quicksand.js"></script>
  <script src="asset/js/portfolio/setting.js"></script>

  <script src="asset/js/jquery.flexslider.js"></script>
  <script src="asset/js/animate.js"></script>
  <script src="asset/js/inview.js"></script>

  <!-- Contact Form JavaScript File -->
  <script src="asset/contactform/contactform.js"></script>

  <!-- Template Custom JavaScript File -->
  <script src="asset/js/custom.js"></script>


</body>
</html>
