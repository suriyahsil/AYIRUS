package guvihunter;
import java.util.Scanner;
public class Dogbarkten {
    public int dogmood(int barks) {
    	if(barks>0&&barks<3) {
    		if(barks==1) {
    			System.out.print("boww(Dog is Smiling)");
    		}
    		if(barks==2) {
    			System.out.print("bowwboww(Dog is Crying)");
    		}
    		if(barks==3) {
    			System.out.print("bowwbowwboww(Dog is Fearing)");
    		}
    	}
    	else {
    		return 0;
    	}
    	return 0;
    }
	public static void main(String[] args) {
		Dogbarkten dog=new Dogbarkten();
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the Number of Barking from 1 to 3 Barks:");
        int barks=scan.nextInt();
        scan.close();
        dog.dogmood(barks);
	}

}
