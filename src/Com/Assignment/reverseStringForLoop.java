package Com.Assignment;
import java.util.Scanner;
public class reverseStringForLoop {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String reversed ="";

        int b = str.length();
        for(int i=(b-1);i>=0;i--){
            reversed = reversed + str.charAt(i);
        }
        System.out.println(reversed);
    }
}
