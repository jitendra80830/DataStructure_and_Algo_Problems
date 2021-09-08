package HeapPack;

public class Heap_Client {
    public static void main(String[] args){
        Heap hp = new Heap();
        hp.add(3);
        hp.add(5);
        hp.add(7);
        hp.add(2);
        hp.add(1);
        hp.add(9);
        hp.add(13);
        hp.add(-2);
        hp.display();
        System.out.println(hp.get());
        System.out.println(hp.delete());
        hp.display();
    }
}
