package guvihunter;
import java.util.Scanner;
public class Spendmoneybudget {

	public int priceinbudget(int price[],int budget){
		int temprice=0;
	    for(int i=0;i<4;i++) {
	    	for(int j=i+1;j<4;j++) {
	    		if(price[i]>price[j]) {
	    			temprice=price[i];
	    			price[i]=price[j];
	    			price[j]=temprice;	
	    		}
	    	}
	    }
	    if(price[0]+price[1]+price[2]<budget) {
	    	System.out.println("The Minimal amount spend to buy 3 gifts is:"+(price[0]+price[1]+price[2]));
	    }
	    if(price[1]+price[2]+price[3]<budget) {
	    	System.out.print("The Maximal amount spend to buy 3 gifts is:"+(price[1]+price[2]+price[3]));
	    }
		return 0;
	}
	public static void main(String[] args) {
		Spendmoneybudget gift=new Spendmoneybudget();
		Scanner scan=new Scanner(System.in);
		int [] price=new int[4];
		for(int i=0;i<4;i++) {
		    System.out.print("Enter the "+(i+1)+" gift price:");
		    price[i]=scan.nextInt();
		}
		System.out.print("Enter the budget that sita have:");
		int budget=scan.nextInt();
		scan.close();
		gift.priceinbudget(price,budget);   
	}
}
