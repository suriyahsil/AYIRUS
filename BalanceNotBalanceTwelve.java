package guvihunter;

import java.util.Scanner;

public class BalanceNotBalanceTwelve {
    public String checkBalance(String word) {
    	int count=0;
    	int countie=0;
    	if(word.length()%2!=0) {
    		System.out.print(word+" is Not Balanced");
    	}
    	else {
    		for(int i=0;i<word.length();i++) {
    				if((word.charAt(i)>='a'&&word.charAt(i)<='m')||(word.charAt(i)>='A'&&word.charAt(i)<='M')) {
    					count++;
    				}
    				else if((word.charAt(i)>='N'&&word.charAt(i)<='Z')||(word.charAt(i)>='n'&&word.charAt(i)<='z')) {
    			        countie++;
    				}
    		}
    		if(count==countie) {
    			System.out.print(word+" is Balanced");
    		}
    		else {
    			System.out.print(word+" is Not Balanced");
    		}
    	}
    	return null;
    }
	public static void main(String[] args) {
		BalanceNotBalanceTwelve bal =new BalanceNotBalanceTwelve();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter The String:");
	    String word = new String(scan.nextLine());
	    bal.checkBalance(word);
	    scan.close();
	}

}
