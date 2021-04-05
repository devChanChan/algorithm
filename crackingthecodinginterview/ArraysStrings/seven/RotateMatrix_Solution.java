package ArraysStrings.seven;

public class RotateMatrix_Solution {
  public static void main(String[] args) {

    int[][] matrix = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
    System.out.println("Original Array");
    printArray(matrix);

    rotateMatrixSolution(matrix);

    System.out.println("Rotated Array");
    printArray(matrix);
  }

  public static boolean rotateMatrixSolution(int[][] matrix) {
    if (matrix.length == 0 || matrix.length != matrix[0].length) {
      return false;
    }

    int n = matrix.length;

    for (int layer = 0; layer < n / 2; layer++) {
      int first = layer;
      int last = n - 1 - layer;

      for (int i = first; i < last; i++) {
        int offset = i - first;
        int top = matrix[first][i]; // save top

        // left -> top
        matrix[first][i] = matrix[last-offset][first];

        // bottom -> left
        matrix[last-offset][first] = matrix[last][last - offset];

        // right -> bottom
        matrix[last][last - offset] = matrix[i][last];

        // top -> right
        matrix[i][last] = top; // right<- saved top
      }
    }
    return true;
  }

  public static void printArray(int[][] matrix) {
    for (int row = 0; row < matrix.length; row++) {
      for (int col = 0; col < matrix[row].length; col++) {
          System.out.print(matrix[row][col] + "\t");
      }
      System.out.println();
    }
  }
}