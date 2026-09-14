
public class Demo2D1 {

    public static void main(String[] args) {

        //declare a 2D array
        //int[][] ary = new int[3][3]; -- First method to declare a 2D array
        int[][] ary = {{5, 6, 9}, {7, 8, 10}, {11, 12, 13}};

        //initialize the 2D array-element wise
        // ary[0][0] = 5;
        // ary[0][1] = 6;
        // ary[1][0] = 7;
        // ary[1][1] = 8;

        for (int i = 0; i < ary.length; i++) { //Outer loop reflects the rows
            for (int j = 0; j < ary[i].length; j++) { //Inner loop reflects the column
                System.out.print(ary[i][j] + " \t ");
            }
            System.out.println();
        }

        /*display the 2D array
        System.out.println("Elements: " + ary[0][0]);
        System.out.println("Elements: " + ary[0][1]);
        System.out.println("Elements: " + ary[1][0]);
        System.out.println("Elements: " + ary[1][1]);*/
    }
}
