class Basic{
    public static void main(String[] args) {
        int n = 5;
        int pos = 2;
        // Bit operation
        int bitmask = 1 << pos;
        if((bitmask & n) == 0){
            System.out.println("Bit was Zero! ");
        }else{
            System.out.println("Bit was non Zero! ");
        }
        // Set Bit
        int newNumber = bitmask | n;
        System.out.println(newNumber);
        // Clear Bit
        int notBitMask = ~(bitmask);
        int cNumber = notBitMask & n;
        System.out.println(cNumber);
    }
}