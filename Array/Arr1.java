import java.util.*;

class Arr1{
    public static void main(String[] args) {
        int[] arr = new int[3];
        try (Scanner input = new Scanner(System.in)) {
            for(int i = 0;i <= 2;i++){
                System.out.print("Enter marks for : "+i+" ");
                arr[i] = input.nextInt();
            }
        }
        for(int i = 0;i <= 2;i++){
            System.out.println("Entered marks for : "+i+" is "+arr[i]);
        }
    }
}