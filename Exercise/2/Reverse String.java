import java.util.*;

class ReverseString {
    static void PintRev(String str,int index){
        if(index == 0){
            System.out.println(str.charAt(index));
            return;
        }
        System.out.println(str.charAt(index));
        PintRev(str,index - 1);
    }
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String str = input.next();
            PintRev(str, str.length() - 1);
        }

    }
}
