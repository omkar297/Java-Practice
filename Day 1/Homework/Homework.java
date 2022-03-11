import java.util.*;

class Homework {
    public static void main(String args[]) {
        try (Scanner input = new Scanner(System.in)) {
            float pia = 3.147f;
            int radius = input.nextInt();
            float area = pia * (radius * radius);
            System.out.println("Area of Circle of "+radius+" is "+area);
        }
    }
}
