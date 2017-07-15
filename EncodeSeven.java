package guvipro;

import java.util.Scanner;

public class EncodeSeven {
    public String EncodingString(String word1,String word2) {
        int k=0;
        String code ="";
        char []alpha = new char[26];
    	for (char c='a';c<='z';c++) {
  		  alpha[k++] = c;
  		}
    	for(int i=0;i<word1.length();i++) {
    		k=0;
    		for(char c='a';c<='z';c++) {
    		   if(word1.charAt(i)==alpha[k]) {
    			   if(k>16) {
    				   code+=String.valueOf(alpha[k-16]);
    			   }
    			   else {
    				   code+=String.valueOf(alpha[k+10]);
    			   }
    			   break;
    		   }
    		   k++;
    		}
    	}
    	code+=" "+word2.charAt(0);
    	for(int i=1;i<word2.length()-1;i++) {
    		k=0;
    		for(char c='a';c<='z';c++) {
     		   if(word2.charAt(i)==alpha[k]) {
     			   if(k>16) {
     				   code+=String.valueOf(alpha[k-16]);
     			   }
     			   else {
     				   code+=String.valueOf(alpha[k+10]);
     			   }
     			   break;
     		   }
     		  k++;
    		}
    	}
    	code+=word2.charAt(word2.length()-1);
    	return code;
    }
	public static void main(String[] args) {
		EncodeSeven encode = new EncodeSeven();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter The First String:");
		String word1 = new String(scan.nextLine());
		word1.toLowerCase();
		System.out.print("Enter The Second String:");
		String word2 = new String(scan.nextLine());
		word2.toLowerCase();
		System.out.print("The Encoded String:"+encode.EncodingString(word1,word2));
		scan.close();
	}
}
