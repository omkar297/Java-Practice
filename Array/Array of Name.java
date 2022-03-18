import java.util.*;

class Array_of_Name {
    public static void main(String[] args) {
        System.out.print("Enter Size : ");
        try (Scanner input = new Scanner(System.in)) {
            int size = input.nextInt();
            String name[] = new String[size];
            for(int i = 0;i < size;i++){
                System.out.print("List No "+i+" : ");
                name[i] = input.nextLine();
            }
            for(int i = 0;i < size;i++){
                System.out.println("Name On "+i+" is "+name[i]);
            }
        }
    }
}
