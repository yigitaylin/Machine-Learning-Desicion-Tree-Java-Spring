package com.aylnygt.deneme;

import java.time.LocalTime;
import java.util.Scanner;


public class Deneme {
	public static void main(String[] args) {    
		Scanner scanner=new Scanner(System.in);
		
		
		int b�y�ksehir,ay=0,saat=0,g�n,araccinsi,aracsayisi=1,havadurumu;
		char �l�ml�='T';
		String il,g�nler,aractipi,aracadeti,havatipi,mevsim,time="";
	
	    
		
		
		
		System.out.println("�l:");
		il=scanner.nextLine();
		

		System.out.println("G�n:");
		g�nler=scanner.nextLine();
		

		System.out.println("Ara� Cinsi:");
		aractipi=scanner.nextLine();
		
		System.out.println("Ara� Say�s�:");
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
				
		
	 
		b�y�ksehir=(il.equals("Adana") || il.equals("Ankara") ||  il.equals("Antalya") ||  il.equals("Bursa") ||  il.equals("�stanbul") ||  il.equals("�zmir")|| il.equals("Konya"))?1:0;
		System.out.println("B�y�ksehir:"+b�y�ksehir +"\t" +"�l:"+il +"\n");
		
		
		g�n=(g�nler.equals("Cumartesi") || g�nler.equals("Pazar"))?1:0;
		System.out.println("G�n:"+g�n +"\t" +"G�nler:"+g�nler +"\n");
		
		
		araccinsi=(aractipi.equals("Otomobil"))?1:0;
		System.out.println("Arac Cinsi:"+araccinsi +"\t" +"Arac Tipi:"+aractipi);
		

		if(aracadeti.equals("Tek Ara�l�")) {aracsayisi=1;}
		else if(aracadeti.equals("�ki Ara�l�")) {aracsayisi=2;}
		else if(aracadeti.equals("�ok Ara�l�")) {aracsayisi=3;}
			
		System.out.println("Arac Say�s�:"+aracsayisi +"\t" +"Arac Adeti:"+aracadeti);
	
		
		havadurumu=(havatipi.equals("A��k"))?1:0;
		System.out.println("Hava Durumu:"+havadurumu +"\t" +"Hava Tipi:"+havatipi +"\n");
		
		
		if(mevsim.equals("�lkbahar")) {ay=0;}
		else if(mevsim.equals("Yaz")) {ay=1;}
		else if(mevsim.equals("Sonbahar")) {ay=2;}
		else if(mevsim.equals("K��")) {ay=3;}
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
		 if (ay>=0 && ay<3)  {�l�ml�='F';}
		 else if(ay==3)
		    {
		   if   (aracsayisi == 1)
		    {
		         if (g�n == 0) 
		      {
		            
		          if  (saat == 1) 
		         {
		              if  (araccinsi == 0)  {�l�ml� ='F';}
		              else { �l�ml� ='T';}
		         }
		          else if (saat == 2)
		            { 
		                 
		                 if  (b�y�ksehir == 1)
		                 {  
		                    if  (araccinsi == 0)  {�l�ml� ='T';}
		                    else {�l�ml�='F';}
		                 }
		                 else  {�l�ml�='F';}
		            }
		            
		          else  if  (saat == 5)
		       { 
		               if (b�y�ksehir == 0)  {�l�ml� ='T';}
		               else {�l�ml� ='F';}
		       }
		          
		          else {�l�ml� ='F';}                           
		   }
		         else  {�l�ml� ='F';}
		  }
		   else   {�l�ml� ='F';}
		         
		   }
		}		
		
else if (havadurumu == 1)
{
if   (b�y�ksehir == 0)  
 {
    if  (aracsayisi == 1)  
   {
        if (g�n == 0)  
       {
           if  (ay == 0) 
            {
               
               if (saat == 1) 
                 { 
                  if (araccinsi == 0)  {�l�ml� ='F';}
                  else  {�l�ml� ='T';}
                 }
              
               else if(saat == 3)  
               {
                 if  (araccinsi == 0) { �l�ml�='F';}
                 else  { �l�ml� ='T';}
               }
               else   {�l�ml�='F';}
          }
           else if  (ay == 1)  
            {
               if (saat == 1) 
                 { 
                if  (araccinsi == 0)   {�l�ml� ='T';}
                else  {�l�ml�='F';}
                 }
               else if (saat>=3 && saat<=5 )
                {  
                 if  (araccinsi == 0)  {�l�ml�='T';}
                 else  {�l�ml� ='F';}
                }
               else  {�l�ml�='T';}
               
            }
           else  if  (ay == 2) 
            { 
              if (saat == 0)
                  {  
                 if  (araccinsi == 0)  {�l�ml� ='F';}
                 else  { �l�ml�='T';}
                  }
              else if (saat == 1) { �l�ml� ='F';}
              else if  (saat == 2)  {�l�ml�='T';}
              else if (saat == 3) 
                 { 
                 if  (araccinsi == 0)  {�l�ml� ='T';}
                 else  { �l�ml� ='F';}
                 }
              else if (saat == 4)  
                {
                 if  (araccinsi == 0)  {�l�ml�='F';}
                 else  { �l�ml� ='T';}
                }
              else if (saat == 5)   {�l�ml� ='T';}
            }
         
           else if  (ay == 3)  
            {
              if  (saat == 0)  
                 {
                 if (araccinsi == 0)  {�l�ml� ='F';}
                 else {�l�ml�='T';}
                 }
              else if (saat>=1 && saat<=2)  {�l�ml� ='F';}
              else if   (saat == 3)
                {  
                  if (araccinsi == 0)  {�l�ml� ='T';}
                  else  {�l�ml� ='F';}
                }
              else if (saat == 4) { �l�ml� ='F';}
              else if (saat == 5)
               {  
                 if  (araccinsi == 0)  {�l�ml�='T';}
                 else { �l�ml�='F';}
               }
          }
      }
    
        else
        {  
             if  (ay == 1) 
               { 
                if  (saat >=0 && saat<=2)  { �l�ml�='F';}
                else if (saat>3 && saat<=5)  {�l�ml� ='F';}
                else {�l�ml� ='T';}
              }
            else   { �l�ml�='F';}    
        }
   }
      
    else  if (aracsayisi == 2)  
        {
        if  (ay == 0) 
          { 
           if  (saat == 0)  
               {
             if  (g�n == 0)  {�l�ml�='T';}
             else  {�l�ml� ='F';}
              }
           else if (saat == 1)  {�l�ml�='F';}
           else if  (saat == 2)
              {  
             if  (g�n == 1)
                {  
                 if  (araccinsi == 0)  {�l�ml�='T';}
                 else  {�l�ml�='F';}
                }
             else  {�l�ml� ='F';}
              }
           else if (saat == 3) 
             { 
             if  (g�n == 0)  
               {
                 if  (araccinsi == 0)  {�l�ml� ='T';}
                 else { �l�ml�='F';}
                }
             else  {�l�ml� ='T';}
              }
           else if (saat == 4)  
           {
             if  (araccinsi == 0)
              {  
                if  (g�n == 0)  {�l�ml�='T';}
                else  {�l�ml� ='F';}
              }
             else  {�l�ml� ='F';}
           }
           else if (saat == 5)  {�l�ml�='F';}
          }
        else if  (ay == 1)  
          {
          if  (araccinsi == 0)  
             {
        	  if  (saat >=0 && saat<=2)  { �l�ml�='F';}
              else if (saat>3 && saat<=5)  {�l�ml� ='F';}
              else {�l�ml� ='T';}
            }
          else  {�l�ml� ='F';}
          }
       else if  (ay == 2) 
          {
           if (saat == 0)  
              {
             if  (g�n == 0)  
               {
                if  (araccinsi == 0)  {�l�ml� ='F';}
                else { �l�ml� ='T';}
               }
             else   {�l�ml�='F';}
             }
           else { �l�ml� ='F';}
         }
       else   {�l�ml� ='F';}
      }
    else  {�l�ml�='F';}
   }

 
else if  (b�y�ksehir == 1) 
    { 
     if (saat == 0)  
       {
         if (ay==0)   
           {
           if (aracsayisi == 2)  
              {
            if   (g�n == 0)  
               {
               if   (araccinsi == 0)  {�l�ml�='F';}
               else { �l�ml� ='T';}
               }
            else { �l�ml� ='F';}
             }
           else  {�l�ml�='F';}
          }
         else if (ay == 1) { �l�ml�='F';}
         else if (ay == 2)  
           {
            if (aracsayisi == 2)  
             {
             if  (g�n == 0)   {�l�ml� ='T';}
             else  {�l�ml�='F';}
             }
            else  {�l�ml�='F';}
          }
         else if (ay == 3) 
            { 
          if   (aracsayisi == 1) 
              {
               if (araccinsi == 0)  {�l�ml� ='T';}
               else {�l�ml� ='F';}
             } 
          else if  (aracsayisi>=2 && aracsayisi<=3)  {�l�ml� ='F';}
         }
      }
     else if (saat == 1)
        {  
         if (g�n == 0) { �l�ml� ='F';}
        if  (g�n == 1) 
           { 
            if (ay==0)  
               {
               if (aracsayisi == 1) { �l�ml�='T';}
               else { �l�ml� ='F';}
               }
            else if (ay == 2) 
                { 
               if (aracsayisi == 2)  {�l�ml�='F';}
               else  {�l�ml� ='T';}
                }
            else { �l�ml�='F';}
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
                  if (g�n == 0)  {�l�ml� ='T';}
                  else  {�l�ml�='F';}
                 }
               else if (aracsayisi == 2)  {�l�ml� ='T';}
               else  {�l�ml� ='F';}
             }
           else  {�l�ml�='F';}
           }
        else if  (ay == 2)  
          {
            if (aracsayisi == 1)  
               {
              if (araccinsi == 1) 
                 { 
                if  (g�n == 0)  {�l�ml�='T';}
                else  {�l�ml�='F';}
                 }
              else { �l�ml� ='F';}
              }
            else  {�l�ml�='F';}
         }
        else  {�l�ml� ='F';}
        }
     else if  (saat == 3) 
      {  
         if (g�n == 1)  
           {
           if  (ay == 0)  
             {
              if  (aracsayisi == 1) 
                { 
                 if (araccinsi == 0)  {�l�ml�='T';}
                 else  {�l�ml�='F';}
                 }
              else { �l�ml� ='F';}
               }
           else  {�l�ml� ='F';}
          }
         else  {�l�ml� ='F';}
        }
   
     if  (saat == 5)  
        {
         if (aracsayisi == 1)  
           {
           if  (ay == 2) 
              { 
               if (g�n == 0)  {�l�ml�='T';}
               else {�l�ml� ='F';}
              }
           else  {�l�ml� ='F';}
          }
         else  {�l�ml� ='F';}
       }
     else  {�l�ml� ='F';}
    }
}
  

System.out.println("Sonu�:" +"\t" +"�l�ml�:"+�l�ml�);

if(�l�ml�=='T')
      {
	System.out.println("�l�ml�");
      }
else {
	System.out.println("�l�ml� De�il");
     }

	
	}
	
}

