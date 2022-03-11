// New Solution for Pattern5.java

import java.util.*;

class Pattern5new {
    public static void main(String[] args) {
        System.out.print("Enter Length : ");
        try (Scanner input = new Scanner(System.in)) {
            int length = input.nextInt();
            for(int i = 0; i <= length;i++){
                for(int j = 0;j <= (length - i);j++){
                    System.out.print("   ");
                }
                for(int j = 0;j <= i;j++){
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }
    }
}
