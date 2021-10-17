public class Book {
     int a = 10;
    static int b =20;

    public void helo(){

        System.out.println("Hello");

    }
    public static void helo2(){
        System.out.println(b);
    }
    public static void main(String[] args){
        Book b = new Book();
        b.helo();
        Book.helo2();

    }

}
