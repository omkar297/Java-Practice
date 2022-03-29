class SubSequences {
    static void SubSeq(String str,int idx,String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        SubSeq(str, idx + 1, newString+currChar);
        SubSeq(str, idx + 1, newString);
    }
    public static void main(String[] args) {
        String str = "ABC";
        SubSeq(str, 0, "");
    }
}
