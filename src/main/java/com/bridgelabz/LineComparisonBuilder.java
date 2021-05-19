package com.bridgelabz;
import java.awt.*;
import java.util.Scanner;

public class LineComparisonBuilder {
    private static Scanner obj;
    public static void main(String[] arg){
        obj = new Scanner(System.in);
        int x1,x2,y1,y2,m1,m2,n1,n2;
        System.out.println("Enter the numbers x1,x2,y1,y2,tem1,m2,n1,n2");
        x1 = obj.nextInt();
        x2 = obj.nextInt();
        y1 = obj.nextInt();
        y2 = obj.nextInt();
        m1 = obj.nextInt();
        m2 = obj.nextInt();
        n1 = obj.nextInt();
        n2 = obj.nextInt();

        double first_line_length=Math.sqrt((x2-x1)^2 + (y2-y1)^2);
        double second_line_length=Math.sqrt((m2-m1)^2 + (n2-n1)^2);
        System.out.println("Length of first line = " + first_line_length);
        System.out.println("Length of second line = " + second_line_length);
        if (first_line_length == second_line_length)
        {
            System.out.println("Both lines are equal");
        }
        else if(first_line_length > second_line_length)
        {
            System.out.println("First line is grater than second line");
        }
        else
        {
            System.out.println("Second line is grater than first line");
        }
    }
}
