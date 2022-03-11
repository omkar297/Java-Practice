import java.util.*;

class SwitchCase {
    public static void main(String[] args) {
        System.out.println("This is Day 1 for CODEVITA");
        System.out.println("------------------------------------");
        try (Scanner input = new Scanner(System.in)) {
            int option = input.nextInt();
            switch (option) {
                case 1:{
                    System.out.println("Hello");
                }break;
                case 2:{
                    System.out.println("Namaste");
                }break;
                case 3:{
                    System.out.println("Pranam");
                }break;
                default:{
                    System.out.println("Invalid Input");
                }break;
            }
        }
    }    
}