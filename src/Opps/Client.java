package Opps;

public class Client {
    public static void main(String[] args){
        //final int i = 100;
        //i = 99; //changing not allowed

        //Case-1
        P obj = new P();
        //System.out.println(obj.d);//3
        //System.out.println(obj.d1);//30
        //obj.fun();

        //Case2
        P obj1 = new C();
       // System.out.println(obj1.d);
       // System.out.println(((C) obj1).d);
       // System.out.println(obj1.d1);
       // System.out.println(((C) obj1).d2);
        //obj1.fun();

        //Case 3
        //C obj2  =  new P(); //not allowed
        //System.out.println(obj2.d);
        //System.out.println(obj2.d2);//C

        //Case4
        C obj4 = new C();
        System.out.println(obj4.d);//c
        System.out.println(((P) obj4).d);//p
        System.out.println(obj4.d1);
        System.out.println(obj4.d2);
        obj4.fun();
    }
}
