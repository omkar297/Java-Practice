import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Range : ");
            int number = input.nextInt();
            int i = 0;
            while(i <= number){
                if(i % 2 == 0){
                    System.out.println(i);
                }
                i++;
            }
        }
    }
}
