import java.lang.reflect.Array;

public class Lab2 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2},
                {3, 4, 5}
        };
//        int[] array = new int[2];
        int[] array = {1, 3};
//        int[][] matrix = new int[2][2];
        /*System.out.println(matrix[0][0]);
        System.out.println(array[1]);
        array[1] = 3;
        System.out.println(array[1]);*/
//        new Array();

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        int[][] matrix2 = new int[matrix.length][];

        for (int i = 0; i < matrix.length; i++) {
            matrix2[i] = new int[matrix[i].length];
        }

        /*for (int i = 0; i < matrix.length; i++) {

        }*/

        /*int[][] matrix = {
                {1, 2},
                {3, 4, 5},
                {3}
        };*/
    }
}
