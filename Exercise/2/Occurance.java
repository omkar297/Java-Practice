import java.util.*;

class Occurance {
    public static void main(String[] args) {
        int first = -1,last = 0;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter String : ");
            String string = input.nextLine();
            char search = input.next().charAt(0);
            for(int i = 0;i < string.length() ;i++){
                if(string.charAt(i) == search){
                    if(first == -1){
                        first = i;
                    }else{
                        last = i;
                    }
                }
            }
        }
        System.out.println("First : "+first+" Last : "+last);
    }
}