package Opps;

public class Person_Clients {
    public static void main(String[] args){
        Person p = new Person();
        System.out.println("Hi Say");
        System.out.println("Hi CB");
        //Person p1 = new Person("Patlu",18);
        //p.name = "Kaju";
       // p.age = 19;
        //p1.introYourSelf();

        p.setName("Patlu");
        p.setAge(-19);
        System.out.println(p.getName());
        System.out.println(p.getAge());
    }

}
