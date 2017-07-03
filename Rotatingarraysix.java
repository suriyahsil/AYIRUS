package guvihunter;

import java.util.Scanner;

public class Rotatingarraysix {
    public int Arrayrotate(int size,int rotat,int []element) {
    	for(int i=rotat;i<size;i++) {
    		System.out.print(element[i]+" ");
    	}
    	for(int i=0;i<rotat;i++) {
    		System.out.print(element[i]+" ");
    	}
    	return 0;
    }
	public static void main(String[] args) {
		Rotatingarraysix rotate=new Rotatingarraysix();
		Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Array Size:");
        int size=scan.nextInt();
        System.out.print("Enter the Rotating Index:");
        int rotat=scan.nextInt();
        System.out.print("Enter the Array Elements:");
        int [] element=new int[size];
        for(int i=0;i<size;i++) {
        	element[i]=scan.nextInt();
        }
        scan.close();
        rotate.Arrayrotate(size,rotat,element);
	}

}
