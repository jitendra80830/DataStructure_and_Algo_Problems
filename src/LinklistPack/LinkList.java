package LinklistPack;

public class LinkList {

    private class Node{
        int data;
        Node next;
    }
    private Node head;
    private Node tail;
    private int size;

    public void display(){
        Node temp = this.head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println(".");
    }
    public void addFirst(int item){
        Node newNode = new Node(); //create new node
        newNode.data = item; //add data in new node
        if(this.size == 0){
            this.head = newNode;
            this.tail = newNode;
           this.size++;

        }else {
            newNode.next = this.head;
            this.head = newNode;
            this.size++;
        }

    }
    public void addLast(int item){
        if(size == 0){
            addFirst(item);
        }else {
            Node newMode = new Node();
            newMode.data = item;
            this.tail.next = newMode;
            this.tail = newMode;
            size++;
        }
    }
    public int getFirst() throws Exception {
        if(this.head == null){
            throw new Exception("LinkList is Empty");
        }
        return this.head.data;
    }
    public int getLast() throws Exception {
        if(this.head == null){
            throw new Exception("LinkList is Empty");
        }
        return this.tail.data;
    }
}
