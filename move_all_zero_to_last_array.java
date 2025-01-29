public class move_all_zero_to_last_array {
    public static void moveZeroes(int[] nums) {
        int non_zero = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[non_zero];
                nums[non_zero]=temp;
                non_zero++;
            }
        }
        for(int i:nums){
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        int[] nums={0,1,0,3,12};
        moveZeroes(nums);
    }
}
