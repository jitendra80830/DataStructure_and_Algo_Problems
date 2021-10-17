public interface Home {
    final int a =10;

    static void he(){
        System.out.println("hii");
    }

}
interface Home2{
    static void he2(){
        System.out.println("hello2");
    }

}
class Friend implements Home ,Home2{

    public void he(){
        System.out.println("Hello world");
    }
    public void he2(){
        System.out.println("Heelo3");

    }
   public static void main(String[] args){
        Home.he();
        Home2.he2();
       Friend f = new Friend();
       f.he();
       f.he2();
   }
}
