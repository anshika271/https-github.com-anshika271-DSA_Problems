class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length%groupSize!=0){
            return false;
        }
        TreeMap<Integer,Integer>mp=new TreeMap<>();
        for(int i=0;i<hand.length;i++){
            mp.put(hand[i],mp.getOrDefault(hand[i],0)+1);
        }
        
        while(!mp.isEmpty()){
           int start=mp.firstKey();

           for(int i=0;i<groupSize;i++){
             if(!mp.containsKey(start+i)){
                return false;
             }
             mp.put(start+i,mp.get(start+i)-1);
             if(mp.get(start+i)==0){
                mp.remove(start+i);
             }
           }

        }
        return true;
    }
}