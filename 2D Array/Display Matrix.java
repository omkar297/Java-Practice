import java.util.*;

class DisplayMatrix {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int r = input.nextInt();
            int c = input.nextInt();
            int mat[][] = new int[r][c];
            for(int i = 0;i < r;i++){
                for(int j = 0;j < c;j++){
                    System.out.print("Enter value for Matrix["+i+"]["+j+"] : ");
                    mat[i][j] = input.nextInt();
                }
            }
            for(int i = 0;i < r;i++){
                for(int j = 0;j < c;j++){
                    System.out.print(" "+mat[i][j]);
                }
                System.out.println();
            }
        }
    }
}
