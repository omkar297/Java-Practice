import java.util.*;

class ReversString {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter String : ");
            StringBuilder sb = new StringBuilder(input.next());
            for(int i = sb.length() - 1;i >= 0;i--){
                System.out.print(sb.charAt(i));
            }
        }
    }
}