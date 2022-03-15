import java.util.*;

class Func3 {
    static int CalMul(int a, int b){
        int mul = a * b;
        return mul;
    }
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter A :");
            int a = input.nextInt();
            System.out.print("Enter B :");
            int b = input.nextInt();
            System.out.println("Multiplacation of 2 number is "+CalMul(a, b));
        }
    }
}
