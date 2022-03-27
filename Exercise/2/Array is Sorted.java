class ArrayisSorted {
    public static void main(String[] args) {
        int[] arr = {1,5,9,10,15,18};
        boolean isSorted = true;
        for(int i = 0;i < arr.length - 1;i++){
            if(arr[i] >= arr[i + 1]){
                isSorted = false;
            }
        }
        if(isSorted){
            System.out.println("Yes!!");
        }else{
            System.out.println("No!!");
        }
    }
}
