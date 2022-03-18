import java.util.*;

class SearchonMatrix {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter Row and Collome : ");
            int r = input.nextInt();
            int c = input.nextInt();
            int mat[][] = new int[r][c];
            for(int i = 0;i < r;i++){
                for(int j = 0;j <c;j++){
                    System.out.print("Enter Value for mat["+i+"]["+j+"] : ");
                    mat[i][j] = input.nextInt();
                }
            }
            System.out.println("Your Matrix :");
            for(int i = 0;i < r;i++){
                for(int j = 0;j <c;j++){
                    System.out.print(mat[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("Enter Search Number : ");
            int search = input.nextInt();
            for(int i = 0;i < r;i++){
                for(int j = 0;j <c;j++){
                    if(mat[i][j] == search){
                        System.out.println("Row : "+i+" Colume : "+j);
                    }
                }
            }
        }
    }
}
