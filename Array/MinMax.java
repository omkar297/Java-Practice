import java.util.*;

class MinMax {
    public static void main(String[] args) {
        System.out.print("Enter Size : ");
        try (Scanner input = new Scanner(System.in)) {
            int size = input.nextInt();
            int array[] = new int[size];
            for(int i = 0;i < array.length;i++){
                System.out.print("Enter Value for Array["+i+"] : ");
                array[i] = input.nextInt();
            }
            int min = Integer.MIN_VALUE;
            int max = 0;
            for(int i = 0;i < array.length;i++){
                if(array[i] < min){
                    min = array[i];
                }
                if(array[i] > max){
                    max = array[i];
                }
            }
            System.out.println("Min Value is "+min);
            System.out.println("Max Value is "+max);
        }
    }
}
