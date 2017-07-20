package guvihunter;
import java.util.Scanner;
public class CoprimeOrNot {

	void coprime() {
		int size=0;
		int count=0;
		int flag=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the First Number:");
		int firstnumber=scan.nextInt();
		System.out.print("Enter the Second Number:");
		int secondnumber=scan.nextInt();
		if(firstnumber>secondnumber) {
			size=firstnumber;
		}
		else {
			size=secondnumber;
		}
		scan.close();
		int [] firstarray=new int[size];
		int [] secondarray=new int[size];
		for(int i=1;i<firstnumber;i++) {
			if(firstnumber%i==0) {
				firstarray[i]=i;
			}
		}
		System.out.println();
		for(int i=1;i<secondnumber;i++) {
             if(secondnumber%i==0) {
            	 secondarray[i]=i;
			}
		}
		for(int i=0;i<size;i++) {
		  if(firstarray[i]>0&&secondarray[i]>0) {
			if(firstarray[i]==secondarray[i]) {
				count++;
				if(firstarray[i]==1&&secondarray[i]==1) {
				 flag=1;	
			    }	
			}
		  }	
		}
		if(flag==count) {
			System.out.print("The Given Numbers are Co-Prime To Each Other");
		}
		else {
			System.out.print("The Given Numbers aren't co-Prime");
		}
	}
	public static void main(String[] args) {
		CoprimeOrNot co=new CoprimeOrNot();
        co.coprime();
	}
}