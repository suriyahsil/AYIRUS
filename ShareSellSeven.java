package guvihunter;

import java.util.Scanner;

public class ShareSellSeven {
    public int ShareSell(int []shareprice,int limit) {
    	int maxShare=-9999999;
    	for(int i=0;i<limit;i++) {
    		if(shareprice[i]>maxShare) {
    			maxShare=shareprice[i];
    		}
    	}
    	maxShare = maxShare-1;
    	return maxShare;
    }
	public static void main(String[] args) {
		ShareSellSeven share = new ShareSellSeven();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Total Number of SharePrices:");
		int limit = scan.nextInt();
        System.out.println("Enter The Share Price in Digits considered to be as Thousands:");
        int []shareprice = new int [limit];
        for(int i=0;i<limit;i++) {
        	shareprice[i] = scan.nextInt();
        }
        System.out.println("Max Benefit = "+share.ShareSell(shareprice,limit)+" thousand");
        scan.close();
	}
}