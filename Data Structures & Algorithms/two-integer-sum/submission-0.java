class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> map = new HashMap<>();
        int arr[]=new int[2];
        for(int i=0; i<nums.length; i++){
             int ans = target-nums[i];
             if(map.containsKey(ans)){
                arr[0]=map.get(ans);
                arr[1]=i;
             }

             map.put(nums[i],i);
        }

        return arr;
    }
}
