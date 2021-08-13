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
    public int deleteFirst() throws Exception {
        if(this.size==0){
            throw new Exception("LinkList is Empty");
        }
        Node temp = this.head;
        this.head = this.head.next;
        temp.next = null;
        this.size--;
        return temp.data;
    }
    public int deleteLast() throws Exception {
        if(this.size==0){
            throw new Exception("LinkList is Empty");
        }
        if(this.size==1){
            return deleteFirst();
        }else {
            Node second_last = this.getNode(this.size - 2);
            int rv = this.tail.data;
            this.tail = second_last;
            this.tail.next= null;
            this.size--;
            return rv;
        }
    }
    public int deleteAtMiddle(int k) throws Exception {
        if(this.size==0){
            throw new Exception("LinkList is Empty");
        }
        if(k == 0){
            return deleteFirst();
        }else if(k == this.size){
            return deleteLast();
        }else {
            Node ith_1 = getNode(k - 1);//ith-1 index
            Node ith = ith_1.next; //ith index
            ith_1.next = ith_1.next.next;
            ith.next = null;
            return ith.data;
        }

    }
    public int size(){
        return this.size;
    }
    public void reverseData() throws Exception {
        int i = 0;
        int j = this.size-1;
        while (i < j){
            Node ith = getNode(i);
            Node jth = getNode(j);
            int temp = ith.data;
            ith.data = jth.data;
            jth.data = temp;
            i++;
            j--;

        }
    }
    public void reverseLink(){
        Node prev = null;
        Node curr = this.head;
        while (curr!=null){
            Node ahead = curr.next; //2k
            curr.next = prev; //null
            prev = curr;
            curr = ahead;
        }
        Node temp = this.head;
        this.head = this.tail;
        this.tail = temp;
    }
    private void reverseRecursive(Node curr , Node prev){
        if(curr== null){
            return;
        }

        reverseRecursive(curr . next , curr);
        curr.next = prev;
    }
    public void reverseRecursive(){
        reverseRecursive(this.head , null);

        Node temp = this.head;
        this.head = this.tail;
        this.tail = temp;
    }
    public void dataReverseRecursion(){
        HeapMover heapMover = new HeapMover();
        heapMover.mover = this.head;
        dataReverseRecursion(this.head ,heapMover , 0 );

    }
    private class HeapMover{
        Node mover;
    }
    private void dataReverseRecursion(Node curr , HeapMover prev , int counter){
        if(curr == null){
            return;
        }
        dataReverseRecursion(curr.next , prev , counter + 1);
        if(counter >= this.size/2) {
            int temp = prev.mover.data;
            prev.mover.data = curr.data;
            curr.data = temp;
            prev.mover= prev.mover.next;
        }
    }
}
