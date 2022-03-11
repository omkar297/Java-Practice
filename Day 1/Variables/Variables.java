import java.util.*;

class Variables {
    public static void main(String args[]){
        System.out.println("This is Day 1 for CODEVITA");
        System.out.println("-----------------------------------------");
        int a = 10;
        int b = 5;
        int solution= (a * b) / ( a - b);
        System.out.println("Solution of (a * b) / ( a - b) : "+solution);
        System.out.println("-----------------------------------------");
        try (Scanner input = new Scanner(System.in)) {
            String name=input.next();
            System.out.println("Your name is : "+name);
            System.out.println("-----------------------------------------");
            int input1 = input.nextInt();
            int input2 = input.nextInt();
            int newSum = input1 + input2;
            System.out.println("New Sum of two number : "+newSum);
        }
    }
}
