package guvihunter;

import java.util.Scanner;

public class Numbertwocount {
    public int counting(int limit) {
        int count=0;
        int tempvalue=0;
        int remainder=0;
        for(int i=0;i<=limit;i++) {
        		if(i==2) {
        			count++;
        			//System.out.println(count+" "+i);
        		}
               	if(i>9){
        			tempvalue=i;
        			while(tempvalue!=0) {
        				remainder=tempvalue%10;
        				if(remainder==2) {
        					count++;
        					//System.out.println(count+" "+i);
        		        }
        				tempvalue/=10;
        				remainder=0;
        			}
        			tempvalue=0;
        		}
        }
        System.out.print("The count of 2's Between o and the Limit is:"+count);
    	return 0;
    }
	public static void main(String[] args) {
		Numbertwocount counts=new Numbertwocount();
		Scanner scan=new Scanner(System.in);
		Integer limit=new Integer(scan.nextInt());
		counts.counting(limit);
        scan.close();
	}
}