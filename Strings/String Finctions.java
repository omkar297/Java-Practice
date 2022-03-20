class StringFinctions {
    public static void main(String[] args) {
        String fName = "Omkar";
        String lName = "Rathod";
        String fullName = fName + " " + lName;
        System.out.println(fullName);
        // Length of String
        System.out.println("Length : "+fullName.length());
        // charAt
        for(int i = 0;i < fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }
        // compare
        if(fName.compareTo(lName) == 0){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }
        //SubString
        String sName = fullName.substring(6);
        System.out.println(sName);
    }
}
