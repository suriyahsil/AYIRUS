package guvihunter;

import java.util.Scanner;

public class PowerSumNextDigitTen {
    public int SumPower(int number) {
    	int power = 0;
    	int length = 0;
    	for(int pow=number;pow!=0;pow/=10) {
    		length++;
    	}
    	int [] value= new int[length];
    	int index=0;
    	for(int pow=number;pow!=0;pow/=10) {
    		value[length-1-index++]=pow%10;
    	}
    	for(int i=0;i<length-1;i++) {
    		power+=Math.pow(value[i], value[i+1]);
    	}
    	power+=1;
    	return power;
    }
	public static void main(String[] args) {
		PowerSumNextDigitTen power = new PowerSumNextDigitTen();
		Scanner scan = new Scanner(System.in);
	    System.out.print("Enter the Number");
	    Integer number = new Integer(scan.nextInt());
	    System.out.print(power.SumPower(number));
	    scan.close();
	}

}
