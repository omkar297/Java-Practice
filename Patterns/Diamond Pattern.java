import java.util.*;

class Pattern14 {
    public static void main(String[] args) {
        System.out.print("Enter the Length : ");
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            for(int i = 0;i <= n;i++){
                for(int j = 0;j <= n-i;j++){
                    System.out.print(" ");
                }
                for(int j = 0;j <= 2*i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i = n;i >= 0;i--){
                for(int j = 0;j <= n-i;j++){
                    System.out.print(" ");
                }
                for(int j = 0;j <= (2 * i );j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
