package Com.Assignment2;
import java.sql.SQLOutput;
import java.util.Scanner;
public class areaOfCircle {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter the radius of the circle: ");
       double radius = sc.nextDouble();
       double area = Math.PI*Math.pow(radius,2);
       System.out.println("Enter the area of the circle: "+area);

       sc.close();
    }

}
