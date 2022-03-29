import java.util.HashSet;

class UniqueSubSequences {
    static void SubSeq(String str,int idx,String newString,HashSet<String> set){
        if(idx == str.length()){
            if(set.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar = str.charAt(idx);
        SubSeq(str, idx + 1, newString+currChar,set);
        SubSeq(str, idx + 1, newString,set);
    }
    public static void main(String[] args) {
        String str = "AAA";
        HashSet<String> set = new HashSet<>();
        SubSeq(str, 0, "",set);
    }
}
