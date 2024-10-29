public class selection_sort{
    public static void main(String[] args) {
        int[] num={7,3,8,1,9,4};
        int min=num[0];
        for(int i=0;i<num.length;i++){
            int index=i;
            min=num[i];
            for(int j=i+1;j<num.length;j++){
                if(num[j]<min){
                    index=j;
                    min=num[j];
                }
            }
            if(index!=i){
                int temp=num[i];
                num[i]=num[index];
                num[index]=temp;
            }
        }
        for(int i:num){
            System.out.print(i);
        }
    }
}