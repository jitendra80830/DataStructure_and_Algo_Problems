package StringPack;

public class StringBuilder_Demo {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("hello");
        StringBuilder sb1 = new StringBuilder();


        sb1.append('i');
        sb1.append('j');

        System.out.println(sb1.capacity());
        System.out.println(sb1.length());

        String s = sb1.toString();

        System.out.println(sb);
        System.out.println(sb1);
        System.out.println(s);

        StringBuilder ans = new StringBuilder();
        for(int i=0;i<100000;i++){
            ans.append(i);
        }
        //System.out.println(ans);
    }
}
