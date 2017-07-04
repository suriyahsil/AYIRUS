package guvihunter;
import java.util.Scanner;
public class Differencemaxseven {

	public int ElementDifference(int size,int []element) {
		int maxdifference=-999999;
		int index=0;
		int value=0;
		int[] difference=new int[size];
		for(int i=0;i<size-1;i++) {
				difference[i]=Math.abs(element[i]-element[i+1]);
			if(difference[i]>maxdifference) {
				maxdifference=difference[i];
				index=i;
				value=element[i];
			}
		}
		System.out.print("The Index of "+value+"("+maxdifference+")"+" is "+index);
		return 0;
	}
	public static void main(String[] args) {
		Differencemaxseven diff=new Differencemaxseven();
	    Scanner scan=new Scanner(System.in);
	    System.out.print("Enter the Size of an Array:");
	    int size=scan.nextInt();
	    System.out.print("Enter the Array Elements:");
	    int []element=new int [size];
	    for(int i=0;i<size;i++) {
	    	element[i]=scan.nextInt();
	    }
	    scan.close();
	    diff.ElementDifference(size,element);
	}

}
