class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int n=arr.length;
        
        if(n<k) return 0;
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
         
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        
        maxSum=sum;
        
        for(int i=k;i<n;i++){
            sum+=arr[i]-arr[i-k];
            maxSum=Math.max(sum,maxSum);
        }
        
        return maxSum;
    }
}