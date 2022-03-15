import java.util.*;

class Func2 {
    public static int Sum(int a,int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter A : ");
            int a = input.nextInt();
            System.out.print("Enter B : ");
            int b = input.nextInt();
            System.out.println(Sum(a, b));
        }
    }
}
