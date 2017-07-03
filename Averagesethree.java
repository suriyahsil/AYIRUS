package guvipro;
import java.util.Scanner;
public class Averagesethree {
    public int arrayaverage(int element[],int limit) {
    	int averagevalue=0;
    	int averagenumber=0;
    	int countvalue=0;
    	int countnumber=0;
    	for(int i=0;i<limit;i++) {
    			if(i<=limit/2) {
    				averagevalue+=element[i];
    				countnumber++;
    			}
    			else {
    				averagenumber+=element[i];
    				countvalue++;
    			}
    	}
    	//System.out.print(averagevalue+" "+averagenumber);
    	if((averagevalue)/countnumber==averagenumber/(countvalue)) {
    		for(int i=0;i<=limit/2;i++) {
    				System.out.print(element[i]+" ");
    			}
    		System.out.print("\n");
    		for(int i=(limit/2)+1;i<limit;i++) {
    				System.out.print(element[i]+" ");
    			}
    	}
    	else{
    	System.out.print("Not Possible");	
    	}
    	return 0;
    }
	public static void main(String[] args) {
		Averagesethree average=new Averagesethree();
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the array limit:");
		int limit=scan.nextInt();
		System.out.print("Enter the array elements:");
		int []element=new int[limit];
		for(int i=0;i<limit;i++) {
			element[i]=scan.nextInt();
		}
		scan.close();
        average.arrayaverage(element,limit);
	}

}
