// Questions:
// 1. Declare an array of 2x2
// and addition of all elements in the array
// int a[][]
// int b[][]
//int c[][]

//c[i][j] = a[i][j] + b[i][j];
public class Demo2D3 {

    public static void main(String[] args) {

        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};
        int[][] c = new int[2][2];

        // Addition of all elements in the array
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        // Display elements in matrix form
        System.out.println("Result matrix before addition:");
        System.out.println("-----------------------------------");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(a[i][j] + " \t ");
            }
            System.out.println();
        }

        // Display elements in matrix form
        System.out.println("Result matrix after addition:");
        System.out.println("-----------------------------------");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(c[i][j] + " \t ");
            }
            System.out.println();
        }
    }
}
