package Opps2;

public class Student {
    String name;
    int masks;

    public Student(String name , int masks){
        this.name = name;
        this.masks = masks;
    }
    @Override
    public String toString(){
        return this.name+" "+this.masks;
    }
}
