package guvipro;
import java.util.Scanner;
public class Checksquare {
  
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("X1 = ");
		int  x1= scan.nextInt();
		System.out.print("Y1 = ");
		int  y1= scan.nextInt();
		System.out.print("X2 = ");
		int  x2= scan.nextInt();
		System.out.print("Y2 = ");
		int  y2= scan.nextInt();
		System.out.print("X3 = ");
		int  x3= scan.nextInt();
		System.out.print("Y3 = ");
		int  y3= scan.nextInt();
		System.out.print("X4 = ");
		int  x4= scan.nextInt();
		System.out.print("Y4 = ");
		int  y4= scan.nextInt();
		scan.close();
		if(x1==x2&&y2==y3&&x3==x4&&y4==y1) {
			System.out.print("Square");
		}
		else {
			System.out.println("Not Square");
		}
	}
}
