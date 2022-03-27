class RemoveDuplicates {
    static boolean[] map = new boolean[26];
    static void RD(String str, int idx,String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char cuch = str.charAt(idx);
        if(map[cuch - 'a'] == true){
            RD(str, idx + 1, newString);
        }else{
            newString += cuch;
            map[cuch - 'a'] = true;
            RD(str, idx + 1, newString);
        }
    }
    public static void main(String[] args) {
        String str = "abbccda";
        RD(str, 0, "");
    }
}