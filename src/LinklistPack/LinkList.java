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
    //O(n)
    public void addIndex(int item , int k) throws Exception {
        if(k < 0 || k>this.size){
            throw new Exception("Invalid Index");
        }
        if(k == this.size){
            this.addLast(item);
        }else if(k == 0){
            addFirst(item);
        }else {
            Node newNode = new Node();
            newNode.data = item;

            Node prev = this.getNode(k -1);
            Node prevNext = prev.next;
            prev.next = newNode;
            newNode .next = prevNext;
            this.size++;

            //or
           // Node newNode1 = new Node();
            //Node prev1 = getNode(k -1);
            //Node prevNext1 = prev1.next;
            //newNode1 .next = prevNext1;
            //prevNext1.next = newNode1
            //this.size++;

        }
    }
    //0 based Indexing
    //O(n)
    public Node getNode(int k) throws Exception {
        if(k < 0 || k >= this.size){
            throw new Exception("Invalid Index");
        }else {
            Node temp = this.head;
            for(int i = 1; i <= k; i++){
                temp = temp.next;
            }
            return temp;
        }
    }
    public int getIndex(int k) throws Exception {
        return this.getNode(k).data;
    }
}
