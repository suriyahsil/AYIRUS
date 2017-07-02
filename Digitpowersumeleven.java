package guvihunter;
import java.util.Scanner;
public class Digitpowersumeleven {
	 public int Digitpower(int input)  {
	    	int count=0;
	    	int output=0;
	    	int remainder=0;
	    	int powersum=1;
	    	for(int i=input;i!=0;i/=10) {
			  count++;
	    	}
	    	for(int j=input;j!=0;j/=10) {
	    		remainder=j%10;
	    	    for(int i=0;i<count;i++) {
	    			powersum*=remainder;
	    		}
	    	    output+=powersum;
	    	    powersum=1;
	    	}
	    	return output;
    }
	 public static void main(String[] args) {
		 Digitpowersumeleven digit=new Digitpowersumeleven();
		 Scanner scan=new Scanner(System.in);
		 System.out.print("Enter the Number:");
		 int number=scan.nextInt();
		 scan.close();
		 System.out.print("The Sum of Power of the Digit is:"+digit.Digitpower(number));
	 }
}
