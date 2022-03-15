import java.util.*;
class day1 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter A : ");
            int a = input.nextInt();
            System.out.print("Enter B : ");
            int b = input.nextInt();
            System.out.print("Enter C : ");
            int c = input.nextInt();
            if(a <= b){
                if(a <= c){
                    System.out.println(a+" less then all");
                }else{
                    System.out.println(a+ " is higher then "+c);
                }
            }
        }
    }
}
