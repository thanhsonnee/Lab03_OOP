import java.util.Scanner;
public class Main_6_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter collumn number: ");
        int cols = input.nextInt();
        System.out.print("Enter row number: ");
        int rows = input.nextInt();
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] res = new int[rows][cols];
        
        System.out.println("Enter matrix 1:");
        Matrix_Inp(input, matrix1);
        System.out.println("Enter matrix 2:");
        Matrix_Inp(input, matrix2);
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                res[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        
        System.out.println("sum:");
        output(res);
        input.close();
    }
    
    public static void output(int[][] mt) {
      for (int i = 0; i < mt.length; i++) {
          for (int j = 0; j < mt[0].length; j++) {
              System.out.print(mt[i][j] + " ");
          }
          System.out.println();
      }
    }
    
    public static void Matrix_Inp(Scanner input, int[][] mt) {
        for (int i = 0; i < mt.length; i++) {
            for (int j = 0; j < mt[0].length; j++) {
                System.out.printf("Enter number [%d][%d]: ", i, j);
                mt[i][j] = input.nextInt();
            }
        }
    }
}