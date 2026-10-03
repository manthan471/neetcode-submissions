class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0;
        int r=numbers.length-1;
        int arr[]=new int[2];
        while(l<r){
            int sum= numbers[l]+numbers[r];
            if(sum==target){
                arr[0]=l+1;
                arr[1]=r+1;
                break;
            }
            else if(sum>target){
                r--;
            }else{
                l++;
            }
        }

        return arr;
    }
}
