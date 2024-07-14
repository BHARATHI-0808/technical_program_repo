
import java.util.Scanner;
public class isPrime_14_7 {

    static boolean is_prime(int num){
        boolean is_prime=true;
        for(int i=2;i<10;i++){
            if(num==i){
                continue;
            }
            else{
                if(num%i==0){
                    is_prime=false;
                }
            }
        }  
        return is_prime;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number : ");
        int num = scanner.nextInt();
       
        if(num==1){
            System.out.println("1 prime? false");
        }
        else if(is_prime(num)){
            System.out.println(num+" prime? true");
        }
        else{
            System.out.println(num+" prime? false");
        }
    }
}
