package guvihunter;
import java.util.Scanner;
public class PossiblePalindromeThirteen {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String:");
		StringBuffer word = new StringBuffer(scan.nextLine());
		scan.close();
		for(int i=0;i<word.length();i++) {
			for(int j=i+2;j<=word.length();j++) {
				String check = new String("");
				int length = 0;
				length = word.substring(i,j).length();
				while(length>0) {
					check+=word.substring(i,j).charAt(length-1);
					length--;
				}
				if(word.substring(i,j).equals(check)) {
					System.out.println(word.substring(i,j));
				}
			}
		}
	}
}