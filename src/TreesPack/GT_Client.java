package TreesPack;

public class GT_Client {
    public static void main(String[] args){
        Generic_Trees gt = new Generic_Trees();
        gt.display();
        System.out.println(gt.size());
        System.out.println(gt.find(30));
        System.out.println(gt.max());
        System.out.println(gt.ht());
        gt.preOrder();
        gt.postOrder();
    }
}
//10 3 20 2 50 0 60 0 30 2 90 0 95 0 40 2 100 0 200 0
