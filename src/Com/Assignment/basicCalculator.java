package Com.Assignment;
import java.sql.SQLOutput;
import java.util.Scanner;
public class basicCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("enter num1: ");
        float num1 =in.nextFloat();
        System.out.print("enter operation: ");
        String op = in.next();
        System.out.print("enter num2: ");
        float num2 =in.nextFloat();

        if(op.equals("+")) {
            System.out.printf("Result:"+(num1+num2));
        } else if (op.equals("-")){
            System.out.println("Result:"+(num1-num2));

        }else if (op.equals("*")){
            System.out.println("Result: "+(num1*num2));
        }else if (op.equals("/")){
            System.out.println("result:"+(num1/num2));
        }else if(op.equals("%")){
            System.out.println("result:"+(num1%num2));
        }

        in.close();


    }


}
