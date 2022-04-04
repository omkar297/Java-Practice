import java.util.*;

class TilesofSize1XM {
    static int placeTiles(int n,int m){
        if(n == m){
            return 2;
        }
        if(n < m){
            return 1;
        }
        int verPlacement = placeTiles(n - m, m);
        int horiPlacement = placeTiles(n - 1, m);
        return verPlacement + horiPlacement;
    }
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter N : ");
            int n = input.nextInt();
            System.out.print("Enter M : ");
            int m = input.nextInt();
            System.out.println(placeTiles(n, m));
        }
    }
}
