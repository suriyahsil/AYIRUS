package guvipro;

import java.util.Scanner;

public class HourGlassSetFour {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max=-9999999;
        int sum =  0;
        int [][]element = new int[6][6];
        for(int i=0;i<6;i++) {
            for(int j=0;j<6;j++) {
                element[i][j]=scan.nextInt();
            }
        }
        scan.close();
        for(int i=0;i<=3;i++) {
            for(int j=0;j<=3;j++) {
                sum=element[i][j]+element[i][j+1]+element[i][j+2]+element[i+1][j+1]+element[i+2][j]+element[i+2][j+1]+element[i+2][j+2];
                if(sum>max) {
                    max=sum;
                }
            }
        }
        System.out.print(max);
    }
}
