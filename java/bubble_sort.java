public class bubble_sort{
    public static int[] bubble(int[] a){
        int n=a.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        return a;
    }
    public static void main(String[] args){
        int[] b={2,41,5,3,7,5};
        int[] c=bubble(b);
        for(int i=0;i<c.length;i++){
            System.out.println(c[i]);
        }
    }
}