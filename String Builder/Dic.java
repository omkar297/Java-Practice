class Dic {
    public static void main(String[] args) {
        //Create
        StringBuilder sb = new StringBuilder("Omkar Rathod");
        System.out.println(sb);
        //charAt
        for(int i = 0;i < sb.length();i++){
            System.out.print(sb.charAt(i)+" ");
        }
        //Set char
        sb.setCharAt(0, 'T');
        System.out.println(sb);
        //Insert
        sb.insert(0, 'R');
        System.out.println(sb);
        //Delete
        sb.delete(0,sb.length());
        System.out.println(sb);
    }
}
