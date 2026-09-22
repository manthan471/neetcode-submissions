class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        for(int i=0; i<strs.length; i++){
            String s = strs[i];
            char ch[] = s.toCharArray();
            Arrays.sort(ch);
            String sortedString = new String(ch);

            if(map.containsKey(sortedString)){
                map.get(sortedString).add(s);
            }else{
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(sortedString,list);
            }
        }
        for(String num:map.keySet()){
             result.add(map.get(num));
        }

        return result;
    }
}
