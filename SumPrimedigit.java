package guvihunter;
import java.util.Scanner;
public class SumPrimedigit {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the Number to be Searched:");
		int search=scan.nextInt();
		System.out.print("Enter the Starting Number:");
		int starting=scan.nextInt();
		System.out.print("Enter the Ening Number:");
		int ending=scan.nextInt();
		int flag=0;
		int count=0;
		scan.close();
		if(starting>9&&ending>9) {
        for(int i=starting;i<=ending;i++) {
        	for(int j=2;j<i;j++) {
        		if(i%j==0) {
        			flag=1;
        		}
        	}
        	if(flag==0) {
        		//System.out.print(i+" ");
        		for(int k=i;k!=0;k/=10)
        		if(search==k%10) {
        			count++;
        		}
        	}
        	flag=0;
        }
        System.out.print("The Number of Time Digit "+search+" Occurs in Two Digit Prime Numbers is "+count);
	  }
		else {
			System.out.print("Invalid Staring or Ending Range");
		}
  }
}
