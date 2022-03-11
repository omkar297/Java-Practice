import java.util.*;

class IfElse {
    public static void main(String args[]) {
        System.out.println("This is Day 1 for CODEVITA");
        System.out.println("------------------------------------");
        try (Scanner input = new Scanner(System.in)) {
            int age = input.nextInt();
            if(age >= 18){
                System.out.println("Your a Adult");
            }else{
                System.out.println("Your PoGo time");
            }
            System.out.println("------------------------------------");
            int number=input.nextInt();
            if(number%2 == 0){
                System.out.println(number+" is Even.");
            }else{
                System.out.println(number+" is odd.");
            }
        }
    }
}
