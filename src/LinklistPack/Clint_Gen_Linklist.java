package LinklistPack;

import Opps2.Cars;

public class Clint_Gen_Linklist {
    public static void main(String[] args){
        Gen_LinkList<Cars> ll = new Gen_LinkList<>();
        ll.addLast(new Cars(100,40,"raj"));
        ll.addLast(new Cars(30,20,"Aman"));
        ll.addLast(new Cars(90,50,"guddu"));
        ll.addFirst(new Cars(190,100,"manish"));
        ll.display();
    }

}
