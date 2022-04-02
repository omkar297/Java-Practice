import java.util.*;

class LogNXtoN{
    static int CalPower(int x,int n){
        if(n == 0){ return 1; }
        if(x == 0){ return 0; }
        if(n % 2 == 0){
            return CalPower(x, n/2) * CalPower(x, n/2);
        }else{
            return CalPower(x, n/2) * CalPower(x, n/2) * x;
        }
    }
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("X : ");
            int x = input.nextInt();
            System.out.print("N : ");
            int n = input.nextInt();
            int ans = CalPower(x, n);
            System.out.println(ans);
        }
    }
}