package LinklistPack;

public class QpsClient {
    public static void main(String[] args) throws Exception {
        LinkList list = new LinkList();
        list.addLast(1);
        list.addLast(22);
        list.addLast(33);
        list.addLast(40);
        list.addLast(55);
        list.addLast(60);
        list.addLast(77);
        list.addLast(80);
        list.addLast(90);
        list.addLast(92);

        LinkList list1 = new LinkList();
        list1.addLast(10);
        list1.addLast(20);
        list1.addLast(30);
        list1.addLast(43);
        list1.addLast(50);
        list1.addLast(62);
        list1.addLast(70);
        list1.addLast(83);
        list1.addLast(85);
        list1.addLast(95);

        //System.out.println(list.kthFromLast(3));
       // list.createCycle();
        //list.display();
        //System.out.println(list.isCycle());
       // System.out.println(list.getIntersectionNode());
        //System.out.println(list.isCycle());
        list.display();
        list1.display();
        list.mergeTwoLinkList(list1);
        list.display();
    }

}
