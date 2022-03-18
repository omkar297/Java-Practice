import java.util.*;

class SpiralOrder {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter Row and Colume : ");
            int r = input.nextInt();
            int c = input.nextInt();
            int mat[][] = new int[r][c];
            for(int  i = 0;i < r;i++){
                for(int j = 0;j < c;j++){
                    System.out.print("Enter Value for "+i+" , "+j+" : ");
                    mat[i][j] = input.nextInt();
                }
            }
            System.out.println("The Spiral Order : ");
            int r_Start = 0;
            int r_End = r - 1;
            int c_Start = 0;
            int c_End = c - 1;
            while(r_Start <= r_End && c_Start <= c_End){
                for(int i = c_Start;i <= c_End;i++){
                    System.out.print(mat[r_Start][i]+" ");
                }
                r_Start++;
                for(int i = r_Start;i <= r_End;i++){
                    System.out.print(mat[i][c_End]+" ");
                }
                c_End--;
                for(int i = c_End;i >= c_Start;i--){
                    System.out.print(mat[r_End][i]+" ");
                }
                c_End--;
            }
        }
    }
}
