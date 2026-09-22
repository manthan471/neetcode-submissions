class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int a=0;
        int b=0;
        List<Integer> list = new ArrayList<>();
        while(a<m && b<n){
            if(nums1[a]<=nums2[b]){
                 list.add(nums1[a]);
                 a++;
            }
           else{
            list.add(nums2[b]);
            b++;
           }
        }
        while(a<m){
            list.add(nums1[a]);
            a++;
        }
        while(b<n){
            list.add(nums2[b]);
            b++;
        }

        for(int i=0; i<list.size(); i++){
            nums1[i]=list.get(i);
        }

        
        
    }
}