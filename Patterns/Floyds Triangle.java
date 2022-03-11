// Floyd's Trangle

import java.util.*;

class Pattern8 {
    public static void main(String[] args) {
        System.out.print("Enter the Hight : ");
        try (Scanner input = new Scanner(System.in)) {
            int height = input.nextInt();
            int temp = 1;
            for(int i = 0;i <= height;i++){
                for(int j = 0;j <= i;j++){
                    System.out.print(" "+temp+" ");
                    temp++;
                }
                System.out.println();
            }
        }
    }
}
