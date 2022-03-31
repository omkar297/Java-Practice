import java.util.*;

class FactorialofN {
    private static void printFact( int i,int n,int sum) {
        if(i == n + 1){
            System.out.println(sum);
            return;
        }
        sum *= i;
        printFact(i + 1, n, sum);
    }
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter N :");
            int n = input.nextInt();
            printFact(1,n,1);
        }
    }
}
