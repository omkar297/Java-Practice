import java.util.*;

class HalfNumberPyramid {
    public static void main(String[] args) {
        System.out.print("Enter the Length : ");
        try (Scanner input = new Scanner(System.in)) {
            int length = input.nextInt();
            for(int i = 0;i <= length;i++){
                for(int j = 0;j <= i;j++){
                    System.out.print(" "+j+" ");
                }
                System.out.println();
            }
        }
    }
}
