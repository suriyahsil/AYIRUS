package guvihunter;

import java.util.Scanner;

public class TallestStudentTwo {
    public int studentHeight(int [] height,Scanner scan) {
    	int tempheight=0;
    	for(int i=0;i<50;i++) {
    		for(int j=i+1;j<50;j++) {
    			if(height[i]<height[j]) {
    				tempheight=height[i];
    				height[i]=height[j];
    				height[j]=tempheight;
    			}
    		}
    	}
    	System.out.print("The Fourth Tallest Student in the Class is:"+height[3]+"\nEnter the Number To find 'K'th Student Height Between 1 to 50");
    	int k=scan.nextInt();
    	if(k>=1&&k<50) {
    		System.out.print("\n'K'th Student Height is "+height[k]);
    	}
    	else {
    		System.out.println("Class Member Range Out");
    	}
    	return 0;
    }
	public static void main(String[] args) {
		TallestStudentTwo tall = new TallestStudentTwo();
		Scanner scan = new Scanner(System.in);
	    System.out.print("Enter the Fifty members height in cms:");
	    int [] height = new int[50];
	    for(int i=0;i<50;i++) {
	    	height[i]=scan.nextInt();
	    }
	    tall.studentHeight(height,scan);
	    scan.close();
	}
}