class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Arrays.sort(strs);
        //   List<List<String>>ans=new ArrayList<>();
        //     boolean[]used=new boolean[strs.length];
        // for(int i=0;i<strs.length;i++){
        //     if(used[i]){
        //         continue;
        //     }
        //   HashMap<Character,Integer>mp=new HashMap<>();
        //   ArrayList<String>list=new ArrayList<>();
        //     String p=strs[i];
        //     list.add(p);
        //     used[i]=true;
        //    for(int k=0;k<p.length();k++){
        //     mp.put(p.charAt(k),mp.getOrDefault(p.charAt(k),0)+1);
        //    }
        //     for(int j=i+1;j<strs.length;j++){
        //        HashMap<Character,Integer>mpp=new HashMap<>(mp);
               
        //        if(used[j]){
        //         continue;
        //        }
        //        String ss=strs[j];
        //        if(p.length()!=ss.length()){
        //        continue;
        //        }
        //        boolean f=true;
        //        for(int k=0;k<ss.length();k++){

        //         if(!mpp.containsKey(ss.charAt(k))){
        //            f=false;
        //            break;

                    
        //         }
        //         mpp.put(ss.charAt(k),mpp.get(ss.charAt(k))-1);
        //         if(mpp.get(ss.charAt(k))==0){
        //             mpp.remove(ss.charAt(k));
        //         }
        //         }
        //         if(f && mpp.size()==0){
        //          list.add(ss);
        //          used[j]=true;
        //        }
        //        }
              
        //          ans.add(list);
        //     }
    
        //   return ans;
     HashMap<String,ArrayList<String>>mp=new HashMap<>();
      
        for(int i=0;i<strs.length;i++){
            char[]arr=strs[i].toCharArray();
            Arrays.sort(arr);
            String s=new String(arr);
        mp.putIfAbsent(s,new ArrayList<>());
        mp.get(s).add(strs[i]);
        }
return new ArrayList<>(mp.values());
        }
        
}

