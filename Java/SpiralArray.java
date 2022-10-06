import java.util.*;

public class SpiralArray 
{
    public static List<Integer> spiralTraversal(int[][] matrix) 
    {
        List<Integer> grid = new ArrayList<>();

        // Grabbing our matrix specific dimensions
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Shift variables keep track of the iterator path
        int upward_shift= 0;
        int left_shift = 0;

        int right_shift = cols - 1;
        int downward_shift = rows - 1;


        /* 
            Since we're doing a full traversal we need a list-type variable
            that will hold all of the members, rows x columns will give us the
            total # of slots in the matrix.
        */
        while (grid.size() < rows * cols)
        {

            // Left to right traversal
            for (int col = left_shift; col <= right_shift; col++)
            {
                grid.add(matrix[upward_shift][col]);
            }

            // Downward traversal
            for (int row = upward_shift + 1; row <= downward_shift; row++)
            {
                grid.add(matrix[row][right_shift]);
            }

            if (upward_shift != downward_shift)
            {
                // Right to left traversal
                for (int col = right_shift - 1; col >= left_shift; col--)
                {
                    grid.add(matrix[downward_shift][col]);
                }
            }

            // Making sure we are now on a different column.
            if (left_shift != right_shift) 
            {
                // Traverse upwards.
                for (int row = downward_shift - 1; row > upward_shift; row--) 
                {
                    grid.add(matrix[row][left_shift]);
                }
            }


            left_shift++;
            upward_shift++;

            downward_shift--;
            right_shift--;
        }

        return grid;

    }


public static void main(String[] args)
{
    int spiralArray[][] = 
    {
        {1,2,3,4,5,6,7,8},
        {9,10,11,12,13,14,15,16},
        {17,18,19,20,21,22,23,24},
        {25,26,27,28,29,30,31,32},
        {33,34,35,36,37,38,39,40},
        {41,42,43,44,45,46,47,48},
        {49,50,51,52,53,54,55,56},
        {57,58,59,60,61,62,63,64}
    };

    System.out.println(spiralTraversal(spiralArray));
}
}
