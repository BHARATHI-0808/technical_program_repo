
import java.util.Scanner;
public class fact_14_7 {
    static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number : ");
        int n=scanner.nextInt();
        System.out.println("Factorial of "+n+" is "+factorial(n));
    }
    
}
