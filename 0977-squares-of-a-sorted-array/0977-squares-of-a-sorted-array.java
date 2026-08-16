class Solution {
    public int[] sortedSquares(int[] nums) {

        List<Integer> pos=new ArrayList<>();
        List<Integer> neg=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                neg.add(nums[i]);
            }
            else{
                pos.add(nums[i]);
            }
        }

        if(neg.size()==0){
            for(int i=0;i<pos.size();i++){
                pos.set(i,pos.get(i)*pos.get(i));
            }
            return pos.stream().mapToInt(Integer::intValue).toArray();
        }

        if(pos.size()==0){
            for(int i=0;i<neg.size();i++){
                neg.set(i,neg.get(i)*neg.get(i));
            }
            Collections.reverse(neg);

            return neg.stream().mapToInt(Integer::intValue).toArray();
        }

        int i,j,id=0;
        int n1=neg.size();
        int n2=pos.size();
        // int sum=n+p;

        int[] res=new int[n1+n2];

        for (i = 0; i < n1; i++){
            neg.set(i, neg.get(i) * neg.get(i));
        }
         Collections.reverse(neg);

        for(i=0;i<n2;i++){
            pos.set(i,pos.get(i)*pos.get(i));
        }

        i=0;
        j=0;

        while(i<n1&&j<n2){
            if(neg.get(i)<=pos.get(j)){
                res[id++]=neg.get(i);
                i++;
            }
            else{
                res[id++]=pos.get(j);
                j++;

            }
        }

        while(i<n1){
            res[id++]=neg.get(i);
            i++;

        }

        while(j<n2){
            res[id++]=pos.get(j);
            j++;
        }

        return res;
        
    }
}