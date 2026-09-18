package Com.Assignment;

import java.util.Scanner;
public class basicCurrencyConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter INR:");
        float inr = in.nextFloat();
        float usd = inr/95.87F;
        System.out.println("In USD:"+usd);
    }
}
