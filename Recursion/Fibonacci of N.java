import java.util.*;

class FibonacciOfN{
    static void PrintFib(int n,int current,int pri){
        if(current == n+1){
            return;
        }
        int c = current + pri;
        System.out.print(c+" ");
        PrintFib(n, c, current);
        
    }
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            PrintFib(n, 1, 0);
        }
    }
}