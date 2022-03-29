class Keypad {
    static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    static void printcom(String str,int idx,String combination){
        if(idx == str.length()){
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(idx);
        String maping = keypad[currChar - '0'];
        for(int i = 0; i < maping.length();i++){
            printcom(str, idx + 1, combination + maping.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str = "23";
        printcom(str, 0, "");
    }
}
