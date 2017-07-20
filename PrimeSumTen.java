package guvihunter;

import java.util.Scanner;

public class PrimeSumTen {
    public int PrimeSum(int number) {
    	int flag=0;
    	int count=0;
    	int [] twodigitprimelement = new int[] {11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97};
    	for(int i=0;i<twodigitprimelement.length;i++) {
    		for(int j=i+1;j<twodigitprimelement.length;j++) {
    			if(twodigitprimelement[i]+twodigitprimelement[j]==number) {
    				System.out.println("Adding Prime Numbers "+twodigitprimelement[i]+" and "+twodigitprimelement[j]+" gives "+number);
    				flag=0;
    				count=1;
    			}
    			else {
    				flag=1;
    			}
    		}
    	}
    	if(flag==1&&count==0) {
    		System.out.print("No Two prime Numbers Can AddUp to give The Number "+number);
    	}
    	return 0;
    }
	public static void main(String[] args) {
		PrimeSumTen prime = new PrimeSumTen();
		Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number:");
        Integer number = new Integer(scan.nextInt());
        prime.PrimeSum(number);
        scan.close();
	}
}