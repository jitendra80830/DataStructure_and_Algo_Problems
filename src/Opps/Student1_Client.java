package Opps;

public class Student1_Client {
    public static void main(String[] args){

        Student1 s = new Student1();
        System.out.println("Hello");
        try {
            s.setAge1(-19);
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println("By");
    }
}
