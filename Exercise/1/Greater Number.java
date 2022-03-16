import java.util.*;

class Greater_Number {
    static void GreaterNumber(int a,int b){
        if(a <= b){
            System.out.println(b+" is Greater then "+a);
        }else{
            System.out.println(a+" is Greater then "+b);
        }
    }
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter A :");
            int a = input.nextInt();
            System.out.print("Enter B :");
            int b = input.nextInt();
            GreaterNumber(a, b);
        }
    }
}
