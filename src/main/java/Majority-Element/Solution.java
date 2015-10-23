public class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> set = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(set.containsKey(nums[i])){
                set.replace(nums[i], set.get(nums[i]) + 1);
            } else {
                set.put(nums[i], 1);
            }
        }
        return (sortMapByValues(set).get(0));
    }

    private ArrayList<Integer> sortMapByValues(Map<Integer, Integer> map) {
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer,Integer> o1,
                               Map.Entry<Integer,Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        ArrayList<Integer> ret = new ArrayList<>();
        for (Map.Entry<Integer, Integer> aList : list) {
            ret.add(aList.getKey());
        }
        return ret;
    }
}
