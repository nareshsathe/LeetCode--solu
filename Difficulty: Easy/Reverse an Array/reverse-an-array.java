class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int left=0;
        int right=arr.length-1;
        // int temp=0;

        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            left++;
            right--;

        }


    }
}