package guvihunter;
import java.util.Scanner;
public class Digitpowersum {
	public int power(int number) {
		int powersum=0;
		int numberlength=0;
		int value=number;
		int remainder=0;
		while(value!=0) {
			remainder=value%10;
			numberlength++;
			value/=10;
		}
		remainder=0;
		for(int i=number;i!=0;i/=10){
			remainder=i%10;
			powersum+=Math.pow(remainder,--numberlength);
		}
		return powersum;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the number:");
		int number=scan.nextInt();
		scan.close();
        Digitpowersum digit=new Digitpowersum();
        System.out.print("The Sum of the Power of the digits is "+digit.power(number));
	}
}