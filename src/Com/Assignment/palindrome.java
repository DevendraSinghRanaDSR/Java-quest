package Com.Assignment;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = in.next();
        String reverse = new StringBuffer(str).reverse().toString();

        if(str.equals(reverse)){
            System.out.println("The string is a palindrome");
        }else{
            System.out.println("The string is not a palindrome");
        }
    }
}
