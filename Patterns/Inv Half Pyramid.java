import java.util.*;

class InvHalfPyramid {
    public static void main(String[] args) {
        System.out.print("Enter the Length : ");
        try (Scanner input = new Scanner(System.in)) {
            int length = input.nextInt();
            for(int i = length;i > 0;i--){
                for(int j = 0;j < i;j++){
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }
    }
}
