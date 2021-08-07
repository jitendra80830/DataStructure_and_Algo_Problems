package Opps;

public class Student2 {
    String name;
    int roll;

    public Student2(){

    }
    public Student2(String name , int roll){
        this.name = name;
        this.roll = roll;
    }
    @Override
    public String toString(){
        return "My Name is "+this.name+" and roll no is "+this.roll;

    }
}
