package Opps;

public class StaticVarExClient {
    public static void main(String[] args){
        StaticVarExample ramu = new StaticVarExample("Ramu",12);
        StaticVarExample Ram = new StaticVarExample("Ram",16);
        StaticVarExample Raju = new StaticVarExample("raju",16);
        System.out.println(StaticVarExample.no_of_Students);

    }
}
