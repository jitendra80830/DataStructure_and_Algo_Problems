package Opps;

public class Person {
    private String name = "Motu";
    private int age= 20;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public Person(String name , int age){
        this.name = name;
        this.age = age;
    }
    public Person(){

    }

    public void introYourSelf(){
        System.out.println("My name is "+this.name+" and  My age is "+this.age);
    }
}
