import java.util.*;

class day2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the Length : ");
            int length = input.nextInt();
            System.out.print("Enter the Number : ");
            int number = input.nextInt();
            for(int i = 1;i <= length;i++){
                System.out.println(number+" * "+i+" = "+number*i);
            }
        }
    }
}