package LinklistPack;

public class LinkListClient {
    public static void main(String[] args) throws Exception {
        LinkList list = new LinkList();
        list.addFirst(10);
        list.addFirst(20);
        //list.display();
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        //list.display();
        list.addIndex(80,3);
        //list.display();
       // System.out.println(list.getFirst());
        //System.out.println(list.getLast());
        //System.out.println(list.getIndex(3));
        //System.out.println(list.deleteAtMiddle(2));
        list.display();
        System.out.println(list.mid());
        //list.display();
    }

}
