package guvihunter;
import java.util.Scanner;
public class Indexequalsvalue {
  public int searchvalue(int element[],int limit) {
      int tempvalue=0;
      int endlimit=limit;
	  for(int i=0;i<limit;i++) {
			for(int j=i+1;j<limit;j++) {
				if(element[i]>element[j]) {
					tempvalue=element[i];
					element[i]=element[j];
					element[j]=tempvalue;
				}
			}
		}
	  for(int i=0;i<limit;i++) {
   	   for(int j=i+1;j<limit;){
   		   if(element[i]==element[j]) {
   			   for(int k=j;k<limit-1;k++) {
   				   element[k]=element[k+1];
   			   }
   			   limit--;
   		   }
   		   else {
   			   j++;
   		   }
   	   }
      }
	  for(int i=0;i<endlimit;i++) {
		  if(i==element[i]) {
			  System.out.println("Index "+i+" equals "+"Element "+element[i]);
		  }
	  }
		return 0;
	}
  public static void main(String[] ayirus) {
	  Indexequalsvalue index=new Indexequalsvalue();
	  Scanner scan =new Scanner(System.in);
	  int limit=scan.nextInt();
	  int [] element=new int[limit];
	  for(int i=0;i<limit;i++) {
		  element[i]=scan.nextInt();
	  }
	  index.searchvalue(element,limit);
	  scan.close();
  }
}
