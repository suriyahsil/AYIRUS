package guvihunter;

import java.util.Scanner;

public class ReverseOddWord {
     String ReverseWord(String sentence){
    	 String ReversedSentense="";
         String [] word = sentence.split(" ");
         for(int i=0;i<word.length;i++) {
        	 if(i%2!=0) {
        		 for(int j=word[i].length()-1;j>=0;j--) {
        			 ReversedSentense+=word[i].charAt(j);
        		 }
        		 ReversedSentense+=" ";
        	 }
        	 else {
        		 ReversedSentense+=word[i]+" ";
        	 }
         }
    	 return ReversedSentense;
    }
	public static void main(String[] args) {
		 ReverseOddWord rev = new ReverseOddWord();
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Enter the String:");
		 String sentense = new String(scan.nextLine());
		 System.out.print(rev.ReverseWord(sentense));
		 scan.close();
	}
}