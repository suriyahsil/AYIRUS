package guvihunter;
import java.util.Scanner;
public class ReverseTwoword {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String word=scan.nextLine();
		char [] wordchar=word.toCharArray();
		int index=0;
		String Reversedword="";
		for(int i=0;i<wordchar.length;i++) {
			if(wordchar[i]==' ') {
				index=i;
			}
		}
		scan.close();
		for(int i=index+1;i<wordchar.length;i++) {
			Reversedword+=wordchar[i];
		}
		Reversedword+=" ";
		for(int i=0;i<=index;i++) {
		    Reversedword+=wordchar[i];
		}
		System.out.print(Reversedword);
	}
}