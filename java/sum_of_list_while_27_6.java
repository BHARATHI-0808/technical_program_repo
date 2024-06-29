public class sum_of_list_while_27_6{
    static int SumOfList(int[] num){
        int n=num.length;
        int sum=0;
        while(n>0){
            sum+=num[n-1];
            n--;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] num={1,2,3,4,5};
        System.out.println("sum = "+ SumOfList(num)); 
    }
}