import java.util.*;

class ElseIf {
    public static void main(String[] args) {
        System.out.println("This is Day 1 for CODEVITA");
        System.out.println("------------------------------------");
        try (Scanner input = new Scanner(System.in)) {
            int a = input.nextInt();
            int b = input.nextInt();
            if(a == b){
                System.out.println("Both are Equal");
            }else if(a > b){
                System.out.println(a+" is greater then "+b);
            }else{
                System.out.println(a+" is lesser then "+b);
            }
        }
    }    
}
