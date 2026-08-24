class Solution {
    public void sortColors(int[] nums) {
         
        for(int i=0;i<nums.length;i++){
            int low=0;
            int high=nums.length-1;
            int mid=0;
            int temp=0;



            while(mid<=high){

                if(nums[mid]==0){
                    temp=nums[low];
                    nums[low]=nums[mid];
                    nums[mid]=temp;

                    mid++;
                    low++;
                }
                else if(nums[mid]==1){
                    mid++;
                }
                else{
                    temp=nums[mid];
                    nums[mid]=nums[high];
                    nums[high]=temp;

                    high--;
                }
            }

        }
    }
}