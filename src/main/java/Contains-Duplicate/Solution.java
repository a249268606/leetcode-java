public class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean ret = false;
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(hashSet.contains(nums[i])){
                ret = true;
            } else {
                hashSet.add(nums[i]);
            }
        }
        return ret;
    }
}
