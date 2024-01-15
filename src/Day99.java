
public class Day99 {

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3},
        {1, 2, 3},
        {1, 2, 3}};
        int[][] c = {{1, 2, 3},
        {1, 2, 3},
        {1, 2, 3}};
        int[][] ac = new int[a.length][a[1].length];
        for (int i = 0; i < ac.length; i++) {
            for (int j = 0; j < ac[i].length; j++) {
                ac[i][j] = a[i][j] + c[i][j];
            }
        }

        for (int i = 0; i < ac.length; i++) {
            for (int j = 0; j < ac[i].length; j++) {
                System.out.print(ac[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
