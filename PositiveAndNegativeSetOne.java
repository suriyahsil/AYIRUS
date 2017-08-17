package guvihunter;
import java.util.*;
public class PositiveAndNegativeSetOne {
  public static void main(String [] args) {
	  Scanner scan = new Scanner(System.in);
	  int limit = scan.nextInt();
	  int arrayi=0;
	  int arrayj=0;
	  int lessin = 9999;
	  int greatin = -9999 ;
	  int sum = 0 ;
	  int [] element = new int[limit];
	  for(int i=0;i<limit;i++) {
		  element[i]=scan.nextInt();
	  }
	  for(int i=0;i<limit;i++) {
		  for(int j=0;j<limit;j++) {
			  if(i!=j) {
			    sum=element[i]+element[j];
			    if((sum<lessin)&&(-(sum)>greatin)) {
				  lessin=sum;
				  greatin=-sum;
				  arrayi=element[i];
				  arrayj=element[j];
			   }
			  sum=0;
			 }
		  }
	  }
	  System.out.print("Two Elements of array close to Zero "+arrayi+" "+arrayj);
	  scan.close();
  }
}
