import java.util.*;

class SONumber {
    static int solution(int number){
        int sum = 0;
        for(int i = 1;i <= number;i++){
            if(i % 2 == 1){
                sum = sum + i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter Range : ");
            int range = input.nextInt();
            System.out.println("Sum of All odd number is "+solution(range));
        }
    }
}
