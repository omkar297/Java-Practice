import java.util.*;

class SumofNNumber {
    static void sumofNNumber(int number,int curSum){
        if(number == 0){
            System.out.println(curSum);
            return;
        }
        int sum = curSum;
        sum += number;
        curSum = sum;
        sumofNNumber(number - 1, curSum);
    }
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter N : ");
            int number = input.nextInt();
            sumofNNumber(number,0);
        }
    }
}
