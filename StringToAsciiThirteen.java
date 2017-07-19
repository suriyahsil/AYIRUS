package guvihunter;

import java.util.Scanner;

public class StringToAsciiThirteen {

	public char ConvertString(String word) {
		int [] charact = new int[word.length()];
		int sum = 0;
		for(int i=0;i<word.length();i++) {
			charact[i]=(int)(word.charAt(i));
		}
		for(int i=0;i<word.length()-1;i++) {
			sum+=charact[i+1]-charact[i];
		}
		sum=Math.abs(sum-charact[0]);
		return (char)(sum);
	}
	public static void main(String[] args ){
		StringToAsciiThirteen ask = new StringToAsciiThirteen();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the String:");
		String word = new String(scan.nextLine());
		System.out.print(ask.ConvertString(word));
		scan.close();
	}

}