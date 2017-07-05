package guvihunter;

import java.util.Scanner;

public class Adduptotargethree {



	public int  TargetAdd(int size,int []element,int target) {

		int flag=0;

		int addcount=0;

	    if(size>1) {

		  for(int i=0;i<size;i++) {

			for(int j=i+1;j<size;j++) {

				flag=0;

				if(element[i]+element[j]==target) {

					System.out.print("The Value which Addsup to give a Target are: "+element[i]+" "+element[j]);

				    addcount=1;

				}

				else {

					flag=1;

				}

			}

		  }

		if(flag==1&&addcount==0) {

			System.out.print("No Two Elements Addup to the Target");

		}

	    }

	    else {

	    	System.out.print("No Two Elements Avail to Addup to the Target");

	    }

		return 0;

	}

	public static void main(String[] args) {

		Adduptotargethree tar=new Adduptotargethree();

		Scanner scan=new Scanner(System.in);

		System.out.println("Enter the Array Size:");

		int size=scan.nextInt();

		System.out.println("Enter the Array Elements:");

		int []element=new int[size];

		for(int i=0;i<size;i++) {

			element[i]=scan.nextInt();

		}

		System.out.println("Enter the Target:");

		int target=scan.nextInt();

		scan.close();

		tar.TargetAdd(size,element,target);

	}



}