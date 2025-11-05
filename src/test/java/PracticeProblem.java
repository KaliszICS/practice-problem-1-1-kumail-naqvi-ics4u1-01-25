public class PracticeProblem {

    public static void main(String[] args) {

    }

  
    public static int sum2D(int[][] a) {
        if (a == null) return 0;
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == null) continue;    
            for (int j = 0; j < a[i].length; j++) {
                sum += a[i][j];
            }
        }
        return sum;
    }


    public static int sumRow(int[][] a, int row) {
        if (a == null || row < 0 || row >= a.length || a[row] == null) return 0;
        int sum = 0;
        for (int v : a[row]) sum += v;
        return sum;
    }


    public static int sumColumn(int[][] a, int col) {
        if (a == null || col < 0) return 0;
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != null && col < a[i].length) {
                sum += a[i][col];
            }
        }
        return sum;
    }

}
