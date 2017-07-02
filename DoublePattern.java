package guvihunter;
import java.util.Scanner;
public class DoublePattern {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        int starlimit=scan.nextInt();
        for(int i=0;i<starlimit;i++) {
        	for(int j=i;j<starlimit;j++) {
        		System.out.print("*");
        	}
        	System.out.print(" ");
     	    for(int j=i;j<starlimit;j++) {
    		    System.out.print("*");
    	    }
     	    System.out.print("\n");
	    }
        scan.close();
   }
}

