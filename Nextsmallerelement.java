package guvihunter;
import java.util.Scanner;
public class Nextsmallerelement {
    public int smallelement(int element[],int limit) {
    	for(int i=1;i<limit;i++) {
    		for(int j=i-1;j<i;j++) {
    			if(element[i]<element[j]) {
    				System.out.print(element[i]+" ");
    			}
    			else  {
    				System.out.print("-1 ");
    			}
    		}
    	}
    	if(element.length>element[0]) {
    		System.out.print(element[0]);
    	}
    	else {
    		System.out.print("-1 ");
    	}
    	return 0;
    }
	public static void main(String[] args) {
		Nextsmallerelement next=new Nextsmallerelement();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int limit=scan.nextInt();
        int [] element=new int[limit];
        System.out.println("Enter the elements in an array:");
        for(int i=0;i<limit;i++) {
        	element[i]=scan.nextInt();
        }
        scan.close();
        next.smallelement(element,limit);
	}
}