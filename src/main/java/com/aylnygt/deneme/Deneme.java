package com.aylnygt.deneme;

import java.time.LocalTime;
import java.util.Scanner;


public class Deneme {
	public static void main(String[] args) {    
		Scanner scanner=new Scanner(System.in);
		
		
		int büyüksehir,ay=0,saat=0,gün,araccinsi,aracsayisi=1,havadurumu;
		char ölümlü='T';
		String il,günler,aractipi,aracadeti,havatipi,mevsim,time="";
	
	    
		
		
		
		System.out.println("İl:");
		il=scanner.nextLine();
		

		System.out.println("Gün:");
		günler=scanner.nextLine();
		

		System.out.println("Araç Cinsi:");
		aractipi=scanner.nextLine();
		
		System.out.println("Araç Sayısı:");
		aracadeti=scanner.nextLine();
		
		System.out.println("Hava Durumu:");
		havatipi=scanner.nextLine();
		

		System.out.println("Ay:");
		mevsim=scanner.nextLine();
		
	
		
	    System.out.println("Saat:");
	    time=scanner.nextLine();
	    
	    LocalTime lt=LocalTime.parse(time);
	    int hour=lt.getHour();
	    int minute=lt.getMinute();
				
		
	 
		büyüksehir=(il.equals("Adana") || il.equals("Ankara") ||  il.equals("Antalya") ||  il.equals("Bursa") ||  il.equals("İstanbul") ||  il.equals("İzmir")|| il.equals("Konya"))?1:0;
		System.out.println("Büyüksehir:"+büyüksehir +"\t" +"İl:"+il +"\n");
		
		
		gün=(günler.equals("Cumartesi") || günler.equals("Pazar"))?1:0;
		System.out.println("Gün:"+gün +"\t" +"Günler:"+günler +"\n");
		
		
		araccinsi=(aractipi.equals("Otomobil"))?1:0;
		System.out.println("Arac Cinsi:"+araccinsi +"\t" +"Arac Tipi:"+aractipi);
		

		if(aracadeti.equals("Tek Araçlı")) {aracsayisi=1;}
		else if(aracadeti.equals("İki Araçlı")) {aracsayisi=2;}
		else if(aracadeti.equals("Çok Araçlı")) {aracsayisi=3;}
			
		System.out.println("Arac Sayısı:"+aracsayisi +"\t" +"Arac Adeti:"+aracadeti);
	
		
		havadurumu=(havatipi.equals("Açık"))?1:0;
		System.out.println("Hava Durumu:"+havadurumu +"\t" +"Hava Tipi:"+havatipi +"\n");
		
		
		if(mevsim.equals("İlkbahar")) {ay=0;}
		else if(mevsim.equals("Yaz")) {ay=1;}
		else if(mevsim.equals("Sonbahar")) {ay=2;}
		else if(mevsim.equals("Kış")) {ay=3;}
		System.out.println("Ay:"+ay +"\t" +"Mevsim:"+mevsim +"\n");
		
		
		
		  if(hour>=0 && hour<4) {saat=0;}
		  else if(hour>=4 && hour<8) {saat=1;}
		  else if(hour>=8 && hour<12) {saat=2;}
		  else if(hour>=12 && hour<16) {saat=3;} 
		  else if(hour>=16 && hour<20) {saat=4;}
		  else if(hour>=20 && hour<24) {saat=5;}
		  	
		  
		  System.out.println("Hour:"+hour);
		  System.out.println("Minute:"+minute);
		  System.out.println("Saat:"+saat +"\t" +"Time:"+time +"\n"); 
		
		
		
		
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

 
else if  (büyüksehir == 1) 
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
        if  (gün == 1) 
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
   
     if  (saat == 5)  
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
  

System.out.println("Sonuç:" +"\t" +"Ölümlü:"+ölümlü);

if(ölümlü=='T')
      {
	System.out.println("Ölümlü");
      }
else {
	System.out.println("Ölümlü Değil");
     }

	
	}
	
}

