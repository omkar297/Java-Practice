import java.util.*;

class ReverseStringNew {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter String : ");
            StringBuilder string = new StringBuilder(input.next());
            for(int i = 0;i < string.length() / 2;i++){
                int front = i;
                int back = string.length() - 1 - i;
                char fchar = string.charAt(front);
                char bchar = string.charAt(back);
                string.setCharAt(front, bchar);
                string.setCharAt(back, fchar);
            }
            System.out.println(string);
        }
    }
}
