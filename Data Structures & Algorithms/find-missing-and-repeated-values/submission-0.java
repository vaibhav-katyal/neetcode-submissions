class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int [] ans = new int[2];
        int a = 0;

        // for(int i=0; i<grid.length; i++){
        //     for(int j=0; j<grid.length; j++){
        //         a ^= grid[i][j];
        //     }
        // }

        // ans[0] = a;
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid.length; j++){
                if(hs.contains(grid[i][j])) ans[0] = grid[i][j];
                hs.add(grid[i][j]);
            }
        }

        for(int i=1; i<=n*n; i++){
            if(!hs.contains(i)) ans[1] = i;
        }

        return ans;
    }
}