public class min_max_in_array {
    public static void main(String[] args) {
        int[] arr = {2,4,6,3,1,7};
        int min=arr[0];
        int max=arr[0];
        for(int i:arr){
            if(i<min){
                min=i;
            }
            if(i>max){
                max=i;
            }
        }   
        System.out.println("min : "+min+"\nmax : "+max);
    }
}
