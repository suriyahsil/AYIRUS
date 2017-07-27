package guvihunter;
import java.util.Scanner;
public class DiamondGapThirteen {
	     	public int printDiamind(int length,char[]charact) {
	     		int count = 0;
	    		for(int i=0;i<=length;i++) {
				    for(int j=length;j>=i;j--) {
						System.out.print(charact[j]);
					}
					for(int k=1;k<i*2;k++) {
						System.out.print(" ");
						if(i==length-1) {
							count++;
						}
					}
					for(int l=i;l<=length;l++) {
						if(l==0&&i==0) {
						    System.out.print("");
						}
						else {
							System.out.print(charact[l]);
						}
					}
					System.out.println();
			   }
				for(int i=0;i<length;i++) {
					for(int j=length;j>=length-(i+1);j--) {
						System.out.print(charact[j]);
					}
					for(int k=i*2+1;k<=count;k++) {
						System.out.print(" ");
						
					}
				   for(int l=length-(i+1);l<=length;l++) {
					if(l==0&&i==length-1) {
						System.out.print("");
					}
					else {
					System.out.print(charact[l]);
					}
				  }
					System.out.println();
			  }
				return 0;
		}
			public static void main(String [] args) {
	     		DiamondGapThirteen gap = new DiamondGapThirteen();
				Scanner scan=new Scanner(System.in);
				String str=scan.nextLine();
				scan.close();
				char [] charact=str.toCharArray();
				int length=charact.length-1;
				gap.printDiamind(length,charact);
   }
}