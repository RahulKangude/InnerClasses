package inner.com;

import java.util.Scanner;

public class TestC {
   public static void main(String[] args) {
	//   write a c program  to accept a character and checkif is uppercase or no
//	  Scanner Sc =new Scanner(System.in);
//	  System.out.println("enter alphabet");
//	  char  C  = Sc. next().charAt(0);
//	  
//	   if(Character.isAlphabetic(C))
//	   {
//		  if(Character.isUpperCase(C)){
//		  System.out.println("letter is upper case");
//		  }
//		  else {
//			  System.out.println("not valid >>>");
//		  }
//		  
//	   }
	   
	   int n1=0,n2=1,n3,i,count=50;    
	   System.out.print(n1+" "+n2);//printing 0 and 1    
	      
	   for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
	   {    
	    n3=n1+n2;    
	    n1=n2;    
	    n2=n3;    
	    System.out.println(" "+n3);    
	   }    
	    
	  
	   
	   
}}