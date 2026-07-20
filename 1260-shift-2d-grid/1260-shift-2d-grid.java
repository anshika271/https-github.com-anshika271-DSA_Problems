class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        ArrayList<Integer>list=new ArrayList<>();
         ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                list.add(grid[i][j]);
            }
        }
        int n=list.size();
        k=k%n;
        for(int i=n-k;i<n;i++){
            ans.add(list.get(i));
        }
        for(int i=0;i<n-k;i++){
            ans.add(list.get(i));
        }
        int indx=0;
    List<List<Integer>>anss=new ArrayList<>();
    for(int i=0;i<grid.length;i++){
        ArrayList<Integer>p=new ArrayList<>();
        for(int j=0;j<grid[0].length;j++){
            p.add(ans.get(indx));
            indx++;
        }
        anss.add(p);
    }
       return anss;
    }
}