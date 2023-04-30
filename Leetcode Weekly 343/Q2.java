public class Q2 {
    // TLE
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int[] rowPainted = new int[mat.length];
        int[] colPainted = new int[mat[0].length];
        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            for (int j = 0; flag && j < mat.length; j++) {
                for (int k = 0; k < mat[j].length; k++) {
                    if (mat[j][k] == arr[i]) {
                        flag = false;
                        if (++rowPainted[j] == mat[0].length || ++colPainted[k] == mat.length)
                            return i;
                        break;
                    }
                }
            }
        }
        return -1;
    }
}
