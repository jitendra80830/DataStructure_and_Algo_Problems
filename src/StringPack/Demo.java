package StringPack;

public class Demo {
    public static void main(String[] args){

        String str = "hello";

        String str1 = "hello";//Memory allocation heap in internal pool or string pool

        str = "bye";

        //System.out.println(str);

        String str2 = new String("hello"); //new allocation in Heap
        //System.out.println(str2);
        String str3 = str2;//this is also ne allocation in Heap

        System.out.println(str3);

        System.out.println(str3.length()); //length

        System.out.println(str3.charAt(4)); //at index

        System.out.println(str3.substring(1,4)); //substring finding

    }
}
