package guvipro;
import java.util.Scanner;
public class Chocolate {
    public int pieces(int row,int column,int unitpieces) {
    	int minimumcuts=0;
    	for(int i=0;i<row;i++) {
    		for(int j=0;j<column;j++) {
    			unitpieces++;
    		}
    	}
    	minimumcuts=unitpieces-1;
    	return minimumcuts;
    }
	public static void main(String[] args) {
		Chocolate choco=new Chocolate();
		Scanner scan=new Scanner(System.in);
		int row=scan.nextInt();
		int column=scan.nextInt();
		int unitpieces=0;
		scan.close();
		System.out.print("The Minimum cuts to the unit pieces of chocolate is:"+choco.pieces(row,column,unitpieces));
	}

}
