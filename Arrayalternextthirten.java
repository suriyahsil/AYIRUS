package guvihunter;
import java.util.Scanner;
public class Arrayalternextthirten {
	public int alternative(int []element,int size) {
		int tempvalue=0;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(element[i]>element[j]) {
				tempvalue=element[i];
				element[i]=element[j];
				element[j]=tempvalue;
				}
			}
		}
		for(int i=0;i<=size/2;i++){
			if((element[element.length-1-i])!=element[i]) {
			System.out.print(element[element.length-1-i]+","+element[i]+",");
			}
			else {
				System.out.print(element[i]);
			}
		}
		return 0;
	}
    public static void main(String[] args) {
    	Arrayalternextthirten alter =new Arrayalternextthirten();
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Enter the Array Size:");
    	int size=scan.nextInt();
    	int []element=new int[size];
    	System.out.println("Enter the Element of an Array:");
    	for(int i=0;i<size;i++) {
    		element[i]=scan.nextInt();
    	}
    	scan.close();
    	alter.alternative(element,size);
    }
}
