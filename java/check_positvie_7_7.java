import java.util.*;
public class check_positvie_7_7 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("enter the number :");
        int n = scanner.nextInt();
        if (n==0){
            System.out.println("it is zero");
        }
        else if(n>0){
            System.out.println("it is positive value");
        }
        else{
            System.out.println("it is negative number");
        }
    }
    
}
