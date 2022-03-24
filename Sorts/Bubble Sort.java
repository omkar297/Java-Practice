import java.util.*;

class BubbleSort {
    static void bubblesort(int[] array){
        for(int i = 0;i < array.length;i++){
            for(int j = 0;j < array.length - i -1;j++){
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter Size of array : ");
            int size = input.nextInt();
            int array[] = new int[size];
            for(int i = 0;i < size;i++){
                array[i] = input.nextInt();
            }
            System.out.println("Array is ");
            for(int i = 0;i < size;i++){
                System.out.print(array[i]+" , ");
            }
            bubblesort(array);
            System.out.println("\n Sorted Arra :");
            for(int i = 0;i < size;i++){
                System.out.print(array[i]+" , ");
            }
        }
    }
}
