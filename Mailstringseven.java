package guvihunter;
import java.util.Scanner;
public class Mailstringseven {
    public String mailvalidation(StringBuffer mailid) {
    	int atindex=0;
    	int atcount=0;
    	int dotindex=0;
    	int dotcount=0;
    	if(mailid.length()>=12&&mailid.length()<20) {
    	  for(int i=0;i<mailid.length();i++) {
    		if(mailid.charAt(i)=='@') {
    			atcount++;
    			atindex=i;
    		}
    		if(mailid.charAt(i)=='.') {
    			dotcount++;
    			dotindex=i;
    		}
    	  }
    	  if((dotcount==1)&&(atcount==1)&&((dotindex-atindex)>=4)&&(dotindex>atindex)&&(atindex>=4)&&(mailid.substring(mailid.length()-4).equals(".com"))) {
    		  System.out.print("Valid Mail Address");
    	  }
    	  else {
    		  System.out.print("Invalid Mail Address");
    	  }
    	}
    	else {
    		System.out.print("Invalid Mail Address");
    	}
    	return null;
    }
	public static void main(String[] args) {
		Mailstringseven mail=new Mailstringseven();
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the MailId:");
        StringBuffer mailid=new StringBuffer(scan.nextLine());
        scan.close();
        mail.mailvalidation(mailid);
	}

}
