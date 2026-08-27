class Solution {



    static void rotateArr(int arr[], int d) {
        // code here

        int n=arr.length;
         d = d%n;

        int i=0;
        int j=d-1;

        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

        i=d;
        j=n-1;

         while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

        i=0;
        j=n-1;

         while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}