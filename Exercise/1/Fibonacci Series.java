import java.util.*;

class Fibonacci_Series {
    static void FS(int a){
        int printable = 1;
        int temp = 0;
        for(int i = 0;i <= a;i++){
            int sum = printable + temp;
            temp = printable;
            printable = sum;
            System.out.print(printable+" , ");
        }
    }
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter Range : ");
            int range = input.nextInt();
            FS(range);
        }
    }
}
