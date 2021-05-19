package com.bridgelabz;
import java.util.Scanner;

public class LineComparisonBuilder {
    private static Scanner obj;
    public static void main(String[] arg){
        obj = new Scanner(System.in);
        int x1,x2,y1,y2;
        System.out.println("Enter the numbers x1,x2,y1,y2 ");
        x1 = obj.nextInt();
        x2 = obj.nextInt();
        y1 = obj.nextInt();
        y2 = obj.nextInt();
        double length=Math.sqrt((x2-x1)^2 + (y2-y1)^2);
        System.out.println("Length of line = " + length);
    }
}
