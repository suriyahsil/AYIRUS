package guvihunter;

import java.util.*;

public class ArrayListmarkSeven {

	ArrayList<String> marks = new ArrayList<String>();
	int maxMark = -999999;
	int sum = 0;
	String Topper = "";
	public String getArrayList(int limit,Scanner scan) {
		System.out.println("Enter the ArrayList Marks Of The Student:");
		for(int i=0;i<limit;i++) {
			marks.add(scan.next());
			String [] val = (marks.get(i).split("#"));
			for(int j=1;j<val.length;j++) {
				sum += Integer.parseInt(val[j]);
			}
			if(sum>maxMark) {
				maxMark = sum;
				Topper = val[0];
			}
			Arrays.fill(val, new String(""));
			sum = 0;
		}
		return Topper; 
	}
	public static void main(String[] args) {
		ArrayListmarkSeven mark = new ArrayListmarkSeven();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number of Students Marks:");
		int limit = scan.nextInt();
		System.out.println(mark.getArrayList(limit,scan));
		scan.close();
	}
}