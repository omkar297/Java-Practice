import java.util.*;

class Func1 {
    public static String PrintName(String name){
        return name;
    }
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter your name : ");
            String name = input.nextLine();
            System.out.println("Entered Name is "+PrintName(name));
        }
    }
}
