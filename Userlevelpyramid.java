package guvihunter;
import java.util.Scanner;
public class Userlevelpyramid {
    public int printpyramid(int level) {
    	for(int i=0;i<=level;i++) {
    		for(int j=1;j<=level-i;j++) {
    			System.out.print(" ");
    		}
    		for(int k=0;k<i;k++){
    			System.out.print("* ");
    		}
    		System.out.print("\n");
    	}
    return 0;	
    }
	public static void main(String[] args) {
		Userlevelpyramid pyramid=new Userlevelpyramid();
		Scanner scan=new Scanner(System.in);
        System.out.print("Enter the base level of the Pyramid:");
        int level=scan.nextInt();
        scan.close();
        pyramid.printpyramid(level);
	}

}
