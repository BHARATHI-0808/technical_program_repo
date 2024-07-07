
import java.util.Scanner;

public class getting_input_7_7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the number :");
        int n = scanner.nextInt();
       
        if(n%2==0){
            System.out.println("it is even number");
        }
        else{
            System.out.println("it is not an even number");
        }
    }
    
}
