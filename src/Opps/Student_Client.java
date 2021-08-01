package Opps;

public class Student_Client {
    public static void main(String[] args){

        Student s = new Student();
        System.out.println(s.name);//null
        System.out.println(s.age); //0
        s.name = "hardik";
        s.age = 20;
        System.out.println(s.name);
        System.out.println(s.age);

        Student s1 = new Student();
        System.out.println(s1.name);//null
        System.out.println(s1.age);//0
    }
}
