package LinklistPack;

public class QpsClient {
    public static void main(String[] args) throws Exception {
        LinkList list = new LinkList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.addLast(7);
        list.addLast(8);
        list.addLast(9);
        list.addLast(10);
        //System.out.println(list.kthFromLast(3));
        list.createCycle();
        //list.display();
        System.out.println(list.isCycle());
        list.removeCycle2();
        System.out.println(list.isCycle());
        list.display();
    }

}
