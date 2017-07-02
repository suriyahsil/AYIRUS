package guvihunter;
import java.util.Scanner;
public class Workingdaythirteen {
  public String Workingday(String day) {
	  if(day.equalsIgnoreCase("monday")||day.equalsIgnoreCase("tuesday")||day.equalsIgnoreCase("wednesday")||day.equalsIgnoreCase("thursday")||day.equalsIgnoreCase("friday")||day.equalsIgnoreCase("saturday")) {
	  System.out.print("true");
	  }
	  else if(day.equalsIgnoreCase("sunday")) {
	  System.out.print("false");
	  }
	  else {
      System.out.print("Invalid Day");
	  }
	  return null;
  }
  public static void main(String[] args) {
	  Workingdaythirteen work=new Workingdaythirteen();
	  Scanner scan=new Scanner(System.in);
	  String day=new String(scan.nextLine());
	  scan.close();
	  work.Workingday(day);
  }
}
