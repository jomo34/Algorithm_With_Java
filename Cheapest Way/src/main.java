public class main {
    static int[] dy = new int[]{-1,0,1};
    static int[] dx = new int[]{1,1,1};
    static int INT_MAX = 100;
    static int maxRow = 5;
    static int maxColumn = 6;

    static int[][] mtx = {{3,4,1,2,8,6},{6,1,8,2,7,4},{5,9,3,9,9,5},{8,4,1,3,2,6},{3,7,2,8,6,4}};

    public static int findMin(int i, int j){
        if (i == maxRow)
            return findMin(0, j);
        if (i == -1)
            return findMin(maxRow - 1, j);
        if (j + 1 == maxColumn)
            return mtx[i][j];

        int min = INT_MAX;
        for (int k = 0; k < 3; k++) {
            min = Math.min(min, findMin(i + dy[k], j + dx[k]));
        }
        return mtx[i][j] + min;
    }

    static int compute(){
        int min = INT_MAX;
        for (int i = 0; i < maxRow; i++)
            min = Math.min(min, findMin(i, 0));
        return min;
    }

    public static void main(String[] args) {
        System.out.println(compute());
    }
}