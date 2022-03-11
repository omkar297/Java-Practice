import java.util.*;

class pattern1 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the length : ");
            int length = input.nextInt();
            for(int i = 0;i < length;i++){
                for(int j = 0;j <= length;j++){
                    System.out.print(" * ");
                }
                System.out.println("");
            }
        }
    }
}
