import java.util.*;

class Pattern9 {
    public static void main(String[] args) {
        System.out.print("Enter the Length : ");
        try (Scanner input = new Scanner(System.in)) {
            int length = input.nextInt();
            int temp = 0;
            for(int i = 0;i <= length;i++){
                for(int j = 0;j <= i;j++){
                    System.out.print(" "+temp+" ");
                    temp++;
                    if(temp == 2){
                        temp=0;
                    }
                }
                System.out.println();
            }
        }
    }
}
