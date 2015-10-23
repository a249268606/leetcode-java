public class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int c = 0;
        while(i + c < nums.length){
            if(nums[i] != 0){
                i++;
            } else{
                moveZero(nums, i);
                c++;
            }
        }
    }
    
    private void moveZero(int[] nums, int n){
        for(int i = n; i < nums.length - 1; i++){
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = 0;
    }
}
