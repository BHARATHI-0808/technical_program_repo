
import java.util.Scanner;
public class palindrome_14_7 {
    
    static boolean is_Palindrome(String str){
        String reversed = new StringBuilder(str).reverse().toString();
        if(reversed.equals(str)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the string to check for palindrome: ");   
        String str=scanner.nextLine();
        if(is_Palindrome(str)){
            System.out.println("\""+str+"\" "+"a palindrome? true");
        }
        else{
            System.out.println("\""+str+"\" "+"a palindrome? false");
        }
    }
}
