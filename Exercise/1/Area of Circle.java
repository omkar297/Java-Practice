import java.util.*;

class Area_of_Circle {
    static float Circumference(int a){
        float fere = 2 * 3.14f * a;
        return fere;
    }
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter Radius :");
            int radius = input.nextInt();
            System.out.println(Circumference(radius));
        }
    }
}
