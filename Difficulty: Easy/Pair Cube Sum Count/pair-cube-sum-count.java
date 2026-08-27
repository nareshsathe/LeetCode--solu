class Solution {
    static int pairCubeCount(int n) {
        // code here
     int count = 0;
        for(int i=1;i<=Math.cbrt(n);i++){
            for(int j=0;j<=Math.cbrt(n);j++){
                if((i*i*i) +(j*j*j) == n) {
                    count++;
                }
            }
        }
        return count;
    
    }
};