package guvihunter;
import java.util.Scanner;
public class Palindigitsumfour {
    public int Sumdigitpalindrome(int number) {
    	int numbereverse=0;
    	int sumdigit=0;
    	for(int i=number;i!=0;i/=10) {
    		sumdigit+=i%10;
    	}
    	for(int i=sumdigit;i!=0;i/=10) {
    		numbereverse=numbereverse*10+i%10;
    	}
    	if(sumdigit==numbereverse) {
    		System.out.print("The Sum of the Digits of a Number is a Palindrome ");
    	}
    	else {
    		System.out.print("The Sum of the Digits of a Givan Number is not a Palindrome");	
    	}
    	return 0;
    }
	public static void main(String[] args) {
		Palindigitsumfour palin=new Palindigitsumfour();
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the Number:");
		int number=scan.nextInt();
		scan.close();
		palin.Sumdigitpalindrome(number);
	}

}
