package guvihunter;
import java.util.Scanner;
public class Stringnumbermultiplicationsix {
    public String NumberMultiple(String word1,String word2) {
    	long Multiple=0;
    	Multiple=Long.parseLong(word1)*Long.parseLong(word2);
    	String MultipliedString=String.valueOf(Multiple);
    	return MultipliedString;
    }
	public static void main(String[] args) {
		Stringnumbermultiplicationsix mul=new Stringnumbermultiplicationsix();
		Scanner scan=new Scanner(System.in);
        System.out.print("Enter the First Number as a String:");
        String word1=new String(scan.nextLine());
        System.out.print("Enter the Second Number as a String:");
        String word2=new String (scan.nextLine());
        scan.close();
        System.out.print("The Multiplied String Numbers are:"+mul.NumberMultiple(word1,word2));
	}
}