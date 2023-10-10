public class RotateImage {

  public static void main(String[] args) {
    int[][] matrix = new int[][]{
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };
    rotate(matrix);

    for (int[] ints : matrix) {
      for (int anInt : ints) {
        System.out.print(anInt + " ");
      }
      System.out.println();
    }
  }

  public static void rotate(int[][] matrix) {
    int copyLength = matrix.length;
    for (int i = 0; i < copyLength; i++) {
      for (int j = i; j < copyLength; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
      }
    }

    for (int i = 0; i < copyLength; i++) {
      for (int j = 0; j < copyLength / 2; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[i][copyLength - 1 - j];
        matrix[i][copyLength - 1 - j] = temp;
      }
    }
  }
}

