package Com.Assignment;
import java.util.Scanner;
public class armstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a three digit number:");
        int n = in.nextInt();
        System.out.print("Enter a three digit number:");
        int m = in.nextInt();

        for(int i=n;i<=m;i++){
            int a=i/100;
            int b=(i/10)%10;
            int c=i%10;
            int d=(a*a*a)+(b*b*b)+(c*c*c);
           if(d==i){
               System.out.print(i+" ");
           }

        }
    }
}
