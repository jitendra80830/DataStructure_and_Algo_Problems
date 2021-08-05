package Opps;

import java.sql.Struct;

public class StaticBlockClient {
    public static void main(String[] args){
        System.out.println("Hello main");

        StaticBlockEx b = new StaticBlockEx("Ram",21);
    }
    static {
        System.out.println("Hello main static");
    }
}
