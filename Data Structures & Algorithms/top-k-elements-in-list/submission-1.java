class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         
         HashMap<Integer,Integer> map = new HashMap<>();
         for(int i=0; i<nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
         }
         Map<Integer, Integer> sortedMap = map.entrySet()
        .stream()
        .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
        .collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (a, b) -> a,
                LinkedHashMap::new
        ));
        
        List<Integer> list = new ArrayList<>();
        for(int num:sortedMap.keySet()){
            if(k>0){
            list.add(num);
            k--;
        }
        }

        int ans[]=new int[list.size()];
        for(int j=0; j<list.size(); j++){
            ans[j]=list.get(j);
        }

        return ans;



        
    }
}
