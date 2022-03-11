import java.util.*;

class HalfPyramid {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter Length of Pyramid : ");
            int length = input.nextInt();

            for(int i = 0;i < length;i++){
                for(int j = 0; j <= i;j++){
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }
    }
}
