package guvihunter;

import java.util.Scanner;

public class PrimeNumberEndingThirteen {
    public int PrimeEnd(int number) {
    	int flag = 0;
    	int sum = 0;
    	for(int i=2;i<=number;i++) {
    		for(int j=2;j<i;j++) {
    			if(i%j==0) {
    				flag=1;
    			}
    		}
    		if(flag==0) {
    			if(i==3||i%10==3) {
    			  sum+=i;
    			}
    		}
    		flag=0;
    	}
    	return sum;
    }
	public static void main(String[] args) {
		PrimeNumberEndingThirteen prime = new PrimeNumberEndingThirteen();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter The Ending Limit:");
        int number = scan.nextInt();
        System.out.print("The Sum is "+prime.PrimeEnd(number));
        scan.close();
	}
}