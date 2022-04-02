import java.util.*;

class XtoN{
    static int CalPower(int x,int n){
        if(n == 0){ return 1; }
        if(x == 0){ return 1; }
        int xPowernm1 = CalPower(x, n -1 );
        int xPower = x * xPowernm1;
        return xPower;
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