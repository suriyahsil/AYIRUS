package guvihunter;

import java.util.Scanner;

public class Verticaleleven {
	public String printVertical(String word1,String word2) {
	   int longword=0;
	   int shortword=0;
	   int loop=0;
	   if(word1.length()>=word2.length()) {
		   longword=word1.length();
		   shortword=word2.length();
		   loop=1;
		   System.out.println(longword+" "+shortword);
	   }
	   else {
		   longword=word2.length();
		   shortword=word1.length();
		   System.out.println(longword+" word "+shortword);
		   loop=2;
	   }
	   for(int i=0;i<shortword;i++) {
		   System.out.println(word2.substring(i,i+1)+word1.substring(i,i+1));
	       if(i==shortword-1) {
	    	   if(loop==1) {
	    	     for(int j=0;j<(longword-shortword);j++) {
	    		   System.out.println(" "+word1.charAt(shortword+j));
	    	     }
	    	  }
	    	   else if(loop==2) {
	    		 for(int j=0;j<(longword-shortword);j++) {
		    	   System.out.println(word2.charAt(shortword+j)+" ");
		    	 }  
	    	   }
	       }
	   }
		return null;	
	}
	public static void main(String[] args) {
		Verticaleleven vertical =new Verticaleleven();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the First String:");
		String word1=new String(scan.nextLine());
		System.out.println("Enter the Second String:");
		String word2=new String(scan.nextLine());
		vertical.printVertical(word1,word2);
		scan.close();
	}
}