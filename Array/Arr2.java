import java.util.*;

class Arr2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Size : ");
            int size = input.nextInt();
            int arr[] = new int[size];
            for(int i = 0;i < size;i++){
                System.out.print("Enter arr["+i+"] : ");
                arr[i] = input.nextInt();
            }
            System.out.print("Find Number : ");
            int find = input.nextInt();
            for(int i = 0;i < size;i++){
                if(arr[i] == find){
                    System.out.println(i);
                }
            }
        }
    }
}
