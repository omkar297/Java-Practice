class UpdateBit {
    public static void main(String[] args) {
        int n = 5;
        int pos = 1;
        int operation = 1;
        if(operation == 1){
            int bitmask = 1 << pos;
            int newNumber = bitmask | n;
            System.out.println(newNumber);
        }else{
            int bitmask = 1 << pos;
            int newBitMask = ~(bitmask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }
    }
}
