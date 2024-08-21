package Problems;

public class Magic_Squares_In_Grid {
    public static int numMagicSquaresInside(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int cursum=0;
        if(row < 3 || col < 3) return 0;

        else if(row == 3 && col == 3) {
            for(int n=0;n<row;n++){
                int val=0;
                for(int p=0;p<col;p++){
                    val+= grid[n][p];
                }
                if (n==1) cursum=val;
                if(n>0 && val == cursum){
                    return 1;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[][] gr={{4,3,8},{9,5,1},{2,7,6}};
        System.out.println(numMagicSquaresInside(gr));
    }

}