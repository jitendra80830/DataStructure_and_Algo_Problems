package Opps2;

import java.util.Arrays;
import java.util.Comparator;

public class Student_Client{
    public static void main(String[] args){
        Student[] arr = new Student[5];
        arr[0] = new Student("Rahul" , 200);
        arr[1] = new Student("Anuj" , 20);
        arr[2] = new Student("Akash" , 190);
        arr[3] = new Student("Samir" , 400);
        arr[4] = new Student("Monu" , 300);

        Arrays.sort(arr,new Comparator<Student>(){

            @Override
            public int compare(Student o1, Student o2) {
                return o1.masks - o2.masks;
                //return o1.name.compareTo(o2.name);
            }
        });
        for (int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
