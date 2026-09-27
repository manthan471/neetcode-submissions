class Solution {
    public int[] productExceptSelf(int[] nums) {
        
       int prod=1;
       int count=0;
       int arr[] = new int[nums.length];
       for(int i=0; i<nums.length; i++){
        if(nums[i]==0){
            count++;
        }
        prod = prod*nums[i];
       }
       int ans = 1;
       for(int k=0; k<nums.length; k++){
             if(nums[k]!=0){
                ans = ans*nums[k];
             }
       }
      if(count>1){
        ans = 0;
      }

       for(int j=0; j<nums.length; j++){
        if(nums[j]==0){
            arr[j]=ans;
        }else{
          arr[j]=prod/nums[j];
       }
       }

       return arr;


           

    }
}  
