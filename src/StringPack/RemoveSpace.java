package StringPack;

public class RemoveSpace {
    public static void main(String[] args){
        String str = "Java is programming language";
        char[] ch = str.toCharArray();
        String str1 ="";
        for (int i = 0; i <ch.length ; i++) {
            if(ch[i] != ' '){
                str1 = str1 + ch[i];
            }
        }
//        for (int i = 0; i <str1.length() ; i++) {
//            System.out.print(str1.charAt(i));
//
//        }
        System.out.println(str1);
    }
}
