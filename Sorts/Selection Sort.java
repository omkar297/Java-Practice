class SelectionSort{
    public static void main(String[] args) {
        int arr[] = {7, 8, 3, 1, 2};
        for(int i = 0;i < arr.length - 1;i++){
            int smallet = i;
            for(int j = i + 1; j < arr.length;j++){
                if(arr[smallet] > arr[j]){
                    smallet = j;
                }
            }
            int temp = arr[smallet];
            arr[smallet] = arr[i];
            arr[i] = temp;
        }
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}