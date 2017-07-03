package guvihunter;
import java.util.Scanner;
public class Digitsumseleven {

	public int Sumdigit(int input) {
			int sum=0;
			for(int i=input;i!=0;i/=10) {
				for(int j=i;j!=0;j/=10) {
					sum+=j%10;
				}
			}
		    return sum;
	}
	public static void main(String[] args) {
		Digitsumseleven digit=new Digitsumseleven();
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the number:");
		int number=scan.nextInt();
		scan.close();
        System.out.print("The Sum is "+digit.Sumdigit(number));
	}

}
