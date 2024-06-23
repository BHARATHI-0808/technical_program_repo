public class EvenNumber {
    static void print_even_number(int[] num){
        for(int i=0;i<num.length;i++){
            if(num[i]%2==0){
                System.out.println(num[i]);
            }
        }
    }
    public static void main(String[] args){
        int[] num={1,2,3,4,5,6};
        print_even_number(num);
    }
}