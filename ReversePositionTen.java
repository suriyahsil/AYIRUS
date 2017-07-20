package guvihunter;

import java.util.Scanner;

public class ReversePositionTen {
	public String ReversePosition(String word) {
		String reverse = "";
		String positionreversed= "";
		int [] upcase = new int[word.length()];
		int [] lowcase = new int[word.length()];
		for(int i=0;i<word.length();i++) {
			if(Character.isUpperCase(word.charAt(i))) {
				upcase[i]=i;
			}
			if(Character.isLowerCase(word.charAt(i))) {
				lowcase[i]=i;
			}
		}
		String [] words=word.split(" ");
		for(int i=0;i<words.length;i++) {
			for(int j=words[i].length()-1;j>=0;j--) {
				reverse+=String.valueOf(words[i].charAt(j));
			}
			reverse+=" ";
		}
		for(int i=0;i<reverse.length()-1;i++) {
			if(i==upcase[i]){
				positionreversed+=(String.valueOf(Character.toUpperCase(reverse.charAt(i))));
			}
			else if(i==lowcase[i]) {
				positionreversed+=(String.valueOf(Character.toLowerCase(reverse.charAt(i))));
			}
			else {
				positionreversed+=String.valueOf(reverse.charAt(i));
			}
		}
		return positionreversed;
	}
	public static void main(String[] args) {
		ReversePositionTen rev = new ReversePositionTen();
		Scanner scan =new Scanner(System.in);
        System.out.print("Enter The String:");
        String word = new String(scan.nextLine());
        System.out.print(rev.ReversePosition(word));
        scan.close();
	}
}