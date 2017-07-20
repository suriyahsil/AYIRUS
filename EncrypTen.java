package guvihunter;

import java.util.Arrays;
import java.util.Scanner;

public class EncrypTen {
	public String encrypString(String input) {
	int k = 0;
	int keyvalue=0;
	int tempvalue=0;
	String Encrypt="";
	int length=input.length();
	Integer []wordcase = new Integer[length];
	Arrays.fill(wordcase,new Integer(-1));
	char [] values = new char[26];
	char key = Character.toLowerCase(input.charAt(input.length()-1));
	for (char c='a';c<='z';c++) {
	  values[k++] = c;
	  if(key==c) {
		  keyvalue=k;
	  }
	}
	for(int i=0;i<length-1;i++) {
		if(Character.isUpperCase(input.charAt(i))) {
			wordcase[i]=i;
		}
	}
	for(int i=0;i<length-1;i++) {
		k=0;
		for(char c='a';c<='z';c++) {
			k++;
			if(Character.toLowerCase((input.charAt(i)))==c) {
				tempvalue=k-keyvalue-1;
				if(tempvalue<=0) {
					tempvalue+=26;
					if(wordcase[i]==i) {
						Encrypt+=String.valueOf(Character.toUpperCase(values[tempvalue]));
					}
					else {
					  Encrypt+=String.valueOf(values[tempvalue]);
					}
				}
				else if(tempvalue>0) {
					if(wordcase[i]==i) {
						Encrypt+=String.valueOf(Character.toUpperCase(values[tempvalue]));
					}
					else {
					  Encrypt+=String.valueOf(values[tempvalue]);
					}
				}
			}
		}
	}
	System.out.print(Encrypt+input.substring(length-1));
	return null;
}
	public static void main(String[] args) {
		EncrypTen en = new EncrypTen();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String to Encrypt");
		String word = new String(scan.nextLine());
		en.encrypString(word);
        scan.close();
	}
}