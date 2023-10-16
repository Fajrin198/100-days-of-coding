package day8;

public class main {
    public static void main(String[] args) {
        int[] arr1D = {1,2};
        int[][] arr2D = {{1,2},
                        {1,2}};
        int[][][] arr3D = {{{1,2},
                            {1,2}},
                            {{1,2},
                            {1,2}}};
        // Tampilkan
        System.out.println("Array 1D :");
        for (int i = 0; i < arr1D.length; i++) {
            System.out.print(arr1D[i]+" ");
        }
        System.out.println("");
        System.out.println("Array 2D");
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Array 3D");
        for (int i = 0; i < arr3D.length; i++) {
            System.out.println("Matrix "+(i+1));
            for (int j = 0; j < arr3D[i].length; j++) {
                for (int k = 0; k < arr3D[i][j].length; k++) {
                    System.out.print(arr3D[i][j][k]+" ");
                }
                System.out.println("");
            }
        }
    }
}
