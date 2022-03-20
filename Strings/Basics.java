import java.util.*;

class Basics {
    public static void main(String[] args) {
        // String Storage type
        String name = "Omkar";
        String fullName = "Omkar R Rathod";
        String statement = "Hi! My name is Omkar Rathod!!";
        System.out.println(name);
        System.out.println(fullName);
        System.out.println(statement);
        try (// Take input from User
        Scanner input = new Scanner(System.in)) {
            name = input.next();
            System.out.println("Your name"+name);
            fullName = input.nextLine();
            System.out.println("Your full name"+fullName);
        }
    }
}