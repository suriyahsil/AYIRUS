package guvihunter;

import java.util.Scanner;

public class Stringsubstringfive {
    public int Substringcheck(String word1,String word2) {
    	int i=0;
    	int index=0;
    	int flag=0;
    	int word1length=word1.length();
    	int word2length=word2.length();
    	while(word1length>=word2length) {
    		flag=0;
    		if(word2.equals(word1.substring(i,i+word2length))) {
    			index=i;
    			break;
    		}
    		else {
    			flag=1;
    		}
    		i++;
    		word1length--;
    	}
    	if(flag==1) {
    		return -1;
    	}
    	else {
    	    return index;
    	}
    }
	public static void main(String[] args) {
		Stringsubstringfive word=new Stringsubstringfive();
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the String which might contains Substring:");
        String word1=scan.nextLine();
        System.out.print("Enter the String which migth be the Substring in an above String:");
        String word2=scan.nextLine();
        scan.close();
        System.out.print("The Index is "+word.Substringcheck(word1,word2));
	}

}
