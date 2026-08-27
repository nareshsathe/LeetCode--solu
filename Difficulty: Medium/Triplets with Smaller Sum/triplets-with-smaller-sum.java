class Solution {
    int countTriplets(int sum, int arr[]) {
        // code here
       
       Arrays.sort(arr);
       int ans =0;
       
       for(int i =0;i<arr.length-2;i++){
           int left=i+1;
           int right=arr.length-1;
           
           while(left<right){
               int triSum=arr[i]+arr[left]+arr[right];
               
               if(triSum>=sum){
                   right--;
               }
               else if(triSum<sum){
                   ans=ans+(right-left);
                   left++;
               }
           }
       }
       return ans;
    }
}