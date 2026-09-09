class Solution {
    public int totalFruit(int[] fruits) {
        int left=0;
        int maxfruit=0;

        HashMap <Integer, Integer> freq=new HashMap<>();


        for(int right=0;right<fruits.length;right++){
            int fruit=fruits[right];

            freq.put(fruit, freq.getOrDefault(fruit, 0)+1);

            while(freq.size()>2){
                int leftfruit=fruits[left];
                freq.put(leftfruit,freq.get(leftfruit)-1);
                if(freq.get(leftfruit)==0){
                    freq.remove(leftfruit);

                }
                left++;

            }

            maxfruit=Math.max(maxfruit,right-left+1);
        }


        return maxfruit;
    }
}