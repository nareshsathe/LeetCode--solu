// User function Template for Java
class Solution {
    // Function to calculate the sum of squares of first 'number' natural numbers
    public int sumOfSquares(int number) {
        // code here

        int squr=0;


        for(int i=1;i<=number;i++){
            squr +=i*i;

        }
        return squr;
    }
}