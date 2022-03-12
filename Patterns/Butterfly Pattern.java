import java.util.*;

class Pattern10 {
    public static void main(String[] args) {
        System.out.print("Enter the Length : ");
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            for(int i = 0; i <= n;i++){
                for(int j = 0;j <= i;j++){
                    System.out.print("* ");
                }
                int space = 2 * (n - i);
                for(int j = 0;j <= space;j++){
                    System.out.print("  ");
                }
                for(int j = 0;j <= i;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            for(int i = n; i >= 0;i--){
                for(int j = 0;j <= i;j++){
                    System.out.print("* ");
                }
                int space = 2 * (n - i);
                for(int j = 0;j <= space;j++){
                    System.out.print("  ");
                }
                for(int j = 0;j <= i;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
