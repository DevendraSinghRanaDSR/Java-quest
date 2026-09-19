package Com.Assignment2;

import java.util.Scanner;
public class areaOfRectangle {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the  length of the rectangle: ");
        double length = in.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = in.nextDouble();

        double area = length*breadth;
        System.out.print("The area of the rectangle is: " + area);

        in.close();
    }
}
