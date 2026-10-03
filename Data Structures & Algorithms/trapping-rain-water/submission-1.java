class Solution {
    public int trap(int[] nums) {

        int leftmax[]=new int[nums.length];
        int sum=0;
        leftmax[0]=nums[0];
        for(int i=1; i<nums.length; i++){
             leftmax[i]= Math.max(nums[i],leftmax[i-1]);
        }
        int rightmax[]=new int[nums.length];
        rightmax[nums.length-1]=nums[nums.length-1];
        for(int j=nums.length-2; j>0; j--){
            rightmax[j] = Math.max(nums[j],rightmax[j+1]);
        }
        for(int k=0; k<nums.length; k++){
            int min = Math.min(leftmax[k],rightmax[k]);
            int waterlevel = min-nums[k];
            if(waterlevel<0){
                waterlevel=0;
            }
            sum=sum+waterlevel;
        }

        return sum;
        
    }
}
