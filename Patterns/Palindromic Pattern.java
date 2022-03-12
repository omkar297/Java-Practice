import java.util.*;

class Pattern13 {
    public static void main(String[] args) {
        System.out.print("Enter the Length : ");
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            for(int i = 0;i <= n;i++){
                for(int j = 1;j <= n-i;j++){
                    System.out.print("  ");
                }
                for(int j = i;j >= 0;j--){
                    System.out.print(j+" ");
                }
                for(int j = 1;j <= i;j++){
                    System.out.print(j+" ");
                }
                System.out.println();
            }
        }
    }
}