import java.util.*;

public class Average {
    static void avg(int a,int b,int c){
        int avg = (a + b + c) / 3;
        System.out.println("Avg is "+avg);
        return;
    }
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter A :");
            int a = input.nextInt();
            System.out.print("Enter B :");
            int b = input.nextInt();
            System.out.print("Enter C :");
            int c = input.nextInt();
            avg(a, b, c);
        }
    }
}
