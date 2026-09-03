class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        HashMap <Character, Integer> freq=new HashMap<>();
        int left=0;
        int maxlen=0;
        
        
        for(int right=0;right<s.length();right++){
            char c =s.charAt(right);
            
            freq.put(c,freq.getOrDefault(c,0)+1);
            
            while(freq.size()>k){
                char leftchar=s.charAt(left);
                freq.put(leftchar,freq.get(leftchar)-1);
                
                if(freq.get(leftchar)==0){
                     freq.remove(leftchar);
                }
                
                left++;
                
            }
               if(freq.size()==k){
                    maxlen=Math.max(maxlen,right-left+1);
                }
               
        }
        return maxlen == 0 ? -1 : maxlen;

    }
}