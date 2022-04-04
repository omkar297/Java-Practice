import java.util.ArrayList;

class SubsetsofFirtsNNumber {
    static void printSubset(ArrayList<Integer> subset){
        for(int i = 0; i<subset.size();i++){
            System.out.println(subset.get(i)+" ");
        }
        System.out.println();
    }
    static void findSubset(int n, ArrayList<Integer> subset){
        if(n <= 0){
            printSubset(subset);
        }
        subset.add(n);
        findSubset(n - 1, subset);
        subset.remove(subset.size() - 1);
        findSubset(n - 1, subset);
    }
    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubset(n, subset);
    }
}