
/* 
public class ReverseAnArray {
    public static void main(String[] args){
        String name[]={"sam","ram","tom"};
        int start=0;
        int end=name.length-1;
        String name1[]=new String[1024];
        int j=0;
        for(int i=end;i>=start;i--){
            name1[j]=name[i];
            j=j+1;
        }
        for(int i=0;i<=end;i++){
            name[i]=name1[i];
        }
        System.out.println("reversed array : ");
        for(int i=0;i<=end;i++){
        System.out.println(name[i]);
        }
    }
    
} */

// without using the any second array OR two pointers approach
public class ReverseAnArray {
    public static void main(String[] args){
        String[] name={"sam","ram","tom"};
        int start=0;
        int end = name.length-1;
        while(start<end){
            String temp=name[start];
            name[start]=name[end];
            name[end]=temp;
            start++;
            end--;
        }
        System.out.println("reversed string : ");
        for(String str:name)
        {
            System.out.print(str+" ");
        }
    }
    
}
