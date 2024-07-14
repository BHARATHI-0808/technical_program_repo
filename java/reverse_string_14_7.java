
import java.lang.*;
import java.util.Scanner;
public class reverse_string_14_7 {
    static String reverse_string(String str){
        char[] charArray = str.toCharArray();
        char[] reverse=new char[1000];
        int n=charArray.length-1;
        int i=0;
       while(n>=0){
        reverse[i]=charArray[n];
        i++;
        n--;
       }
       return new String(reverse);
    }
    static String another_reverse(String str){
        String reverse=new StringBuilder(str).reverse().toString();
        return reverse;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        System.out.println("enter the string : ");
        String str = scanner.nextLine();
        System.out.println("reverse string : "+another_reverse(str));   
    }
    
}
