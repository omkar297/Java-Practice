import java.util.*;

class HollowRectangle {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the Length : ");
            int length = input.nextInt();
            for(int i = 0;i <= length;i++){
                for(int j = 0;j <= length;j++){
                    if(i == 0 || i == length || j == 0 || j == length){
                        System.out.print(" * ");
                    }else{
                        System.out.print("   ");
                    }
                }
                System.out.println();
            }
        }
    }
}
