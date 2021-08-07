package StackPck;

public class Reverse {
    public static void main(String[] args) throws Exception {
        DynamicStack s = new DynamicStack();
        for(int i=1;i<5;i++){
            s.push(10*i);
        }
        s.display();
        System.out.println();
        reverse(s);
        s.display();
    }
    public static void reverse(DynamicStack s) throws Exception {
        if(s.isEmpty()){
            return;
        }
        int item = s.pop();
        reverse(s);
        insert_Buttom(s,item);
        //s.push(item);
    }

    public static void insert_Buttom(DynamicStack s, int item) throws Exception {
        if(s.isEmpty()){
            s.push(item);
            return;
        }
        int item1 = s.pop();
        insert_Buttom(s,item);
        s.push(item1);
    }
}
