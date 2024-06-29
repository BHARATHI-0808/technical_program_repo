public class even_number_while_29_6{
    static void PrintEvenNumber(int[] num){
        int n=num.length;
        int i=0;
        while(i<n){
            if(num[i]%2==0){
                System.out.println(num[i]);
            }
            i++;
        }
    }
    public static void main(String[] args) {
        int[] num={1,2,3,4,5,6};
        PrintEvenNumber(num);
    }
}