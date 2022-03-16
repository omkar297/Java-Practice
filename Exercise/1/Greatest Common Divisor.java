import java.util.*;

class Divisor {
    static int GCD(int a,int b){
        int gcd = 1;
        for(int i = 1;i <= a && i <= b;i++){
            if(a % i == 0 && b % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter A : ");
            int a = input.nextInt();
            System.out.print("Enter B : ");
            int b = input.nextInt();
            System.out.println("Value "+a+" and "+b+" of GCD is "+GCD(a, b));
        }
    }
}
