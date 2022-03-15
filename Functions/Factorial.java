import java.util.*;

class Factorial {
    static int CalFacto(int a){
        int facto = 1;
        for(int i = 1;i<=a;i++){
            facto = facto * i;
        }
        return facto;
    }
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter number : ");
            int number = input.nextInt();
            System.out.println("Factorial of "+number+" is "+CalFacto(number));
        }
    }
}