import java.util.*;

class Homework3 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int a = input.nextInt();
            String symbal = input.next();
            int b = input.nextInt();
            switch (symbal) {
                case "+":{
                    System.out.println("Sum : "+(a + b));
                }break;
                case "-":{
                    System.out.println("Sub : "+(a - b));
                }break;
                case "*":{
                    System.out.println("Mul : "+(a * b));
                }break;
                case "/":{
                    System.out.println("Div : "+(a / b));
                }break;
            
                default: System.out.println("Invalid Data");
                    break;
            }
        }
    }
}
