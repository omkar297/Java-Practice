import java.util.*;

class Vote {
    static void CalVote(int age){
        if(age >= 18){
            System.out.println("Your Eligible of Voting");
        }else{
            System.out.println("Pogo time");
        }
    }
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter your Age :");
            int age = input.nextInt();
            CalVote(age);
        }
    }
}
