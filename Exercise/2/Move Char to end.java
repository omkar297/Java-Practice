class MoveChartoend {
    static void MoveChar(String string,char element,int index,int cout,String newString){
        if(index == string.length()){
            for(int i = 0;i <cout;i++){
                newString += element;
            }
            System.out.println(newString);
            return;
        }
        char search = string.charAt(index);
        if(search == element){
            cout++;
            MoveChar(string, element, index + 1, cout, newString);
        }else{
            newString += search;
            MoveChar(string, element, index + 1, cout, newString);
        }
    }
    public static void main(String[] args) {
        String string = "axbcxxd";
        char ele = 'x';
        MoveChar(string, ele, 0, 0, "");
    }
}
