package guvihunter;
import java.util.Scanner;
public class Stringreversetwo {
    public String Reverse(String word) {
    	String revert="";
    	int length=word.length();
    	while(length>0) {
    		revert+=word.charAt(length-1);
    		length--;
    	}
    	return revert;
    }
	public static void main(String[] args) {
		Stringreversetwo reverse=new Stringreversetwo();
        Scanner scan=new Scanner(System.in);
        String word=new String(scan.nextLine()); 
        System.out.print("The Reversed String is "+reverse.Reverse(word));
        scan.close();
	}

}
