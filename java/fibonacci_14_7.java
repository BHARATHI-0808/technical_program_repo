
import java.util.Scanner; 
public class fibonacci_14_7 {
    static void fibonacci(int n){
        int a=0;
        int b=1;
        int i=3;
        int c;
        System.out.print(n+" sample output: ");
        System.out.print(a +" "+ b+" ");
        while (i<=n) { 
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the n value for fibonacci : ");
        int n=scanner.nextInt();
        fibonacci(n);
    }
}
