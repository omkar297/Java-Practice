import java.util.*;

class ToH{
    static void tower(int n,String src,String helper,String dest){
        if(n == 1){
            System.out.println("transfer disk"+ n +" from "+ src +" to "+ dest );
            return;
        }
        tower(n - 1, src, dest, helper);
        System.out.println("transfer disk "+ n +" from "+ src +" to "+ dest );
        tower(n - 1, helper, src, dest);
    }
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("N : ");
            int n = input.nextInt();
            tower(n, "s", "h", "d");
        }
    }
}