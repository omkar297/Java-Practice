import java.util.*;

class PermutationString {
    static void printPerm(String string,String permutation){
        if(string.length() == 0){
            System.out.println(permutation);
            return;
        }
        for(int  i = 0;i < string.length();i++){
            char curChar = string.charAt(i);
            String newStr = string.substring(0, i) + string.substring(i + 1);
            printPerm(newStr, permutation + curChar);
        }
    }
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter String : ");
            String string = input.next();
            printPerm(string, "");
        }
    }
}
