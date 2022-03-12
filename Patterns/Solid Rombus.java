import java.util.*;

class Pattern11 {
    public static void main(String[] args) {
        System.out.print("Enter the Length : ");
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            for(int i = 0;i <= n;i++){
                int space = n - i;
                for(int j = 0;j <= space;j++){
                    System.out.print(" ");
                }
                for(int j = 0;j <= n;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
