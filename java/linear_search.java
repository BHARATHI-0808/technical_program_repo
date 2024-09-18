
import java.util.*;
public class linear_search {
    public static int elementIndexOf(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr=new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the no of elements in array : ");
        int n=scanner.nextInt();
        System.out.print("enter array elements : ");
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        System.out.println("enter the target value : ");
        int target = scanner.nextInt();
        if(elementIndexOf(arr,target)!= -1){
            System.out.println("element found at "+elementIndexOf(arr,target));
        }
        else{
            System.out.println("element not found ...");
        }
    }
}
