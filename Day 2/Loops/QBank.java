import java.util.*;

class QBank {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the Number : ");
            int number = input.nextInt();
            for(int i = 1;i <= 10;i++){
                System.out.println(number+" * "+i+" = "+number * i);
            }
        }
    }
}
