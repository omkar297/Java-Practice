import java.util.*;

class NotoNo{
    static void notono(int start,int end){
        if(end  == start){
            return;
        }else{
            System.out.println(end);
        }
        notono(start, end - 1);
    }
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("End : ");
            int s = input.nextInt();
            System.out.println("Start : ");
            int e = input.nextInt();
            notono(s, e);
        }
    }
}