class Solution {
    public int leastInterval(char[] tasks, int n) {
       int[]frq=new int[26];
       int time=0;
       for(char ch:tasks){
        frq[ch-'A']++;
       }
       PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
       for(int num:frq){
        if(num>0){
            pq.add(num);
        }
       }

       while(!pq.isEmpty()){
        int cycle=n+1;
        ArrayList<Integer>list=new ArrayList<>();

        while(cycle>0 && !pq.isEmpty()){
            int count=pq.poll();
            count--;
            if(count>0){
                list.add(count);
            }
            cycle--;
            time++;
        }
        for(int num:list){
        pq.add(num);
        }

        if(!pq.isEmpty()){
            time=time+cycle;
        }
       }
return time;

    }
}