package guvipro;
import java.util.Scanner;
public class Givenseedsettwo {
    public int seedornot(int number,int value) {
    	int seednumber=number;
    	for(int i=number;i!=0;i/=10) {
    		seednumber*=i%10;
    	}
    	if(seednumber==value){
    		System.out.print(number+" is a seed of "+value);
    	}
    	else {
    		System.out.print(number+" is not a seed of "+value);
    	}
    	return 0;
    }
	public static void main(String[] args) {
		Givenseedsettwo seed=new Givenseedsettwo();
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the Seed Element:");
		int number=scan.nextInt();
		System.out.print("Enter the Container Element:");
		int value=scan.nextInt();
		scan.close();
		seed.seedornot(number,value);
	}

}
