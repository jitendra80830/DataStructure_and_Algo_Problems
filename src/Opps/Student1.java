package Opps;

public class Student1 {
    private String name = "Motu";
    private int age = 19;


    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception { //indicate Exception
        System.out.println("Hi Setage");
        if(age<0){
            throw new Exception("-v age"); //Generate Exception
        }
        this.age = age;

    }
    public void setAge1(int age) throws Exception { //indicate Exception
        System.out.println("Hi Setage");
        try {
            if (age < 0) {

                throw new Exception("-v age"); //Generate Exception
            }
            this.age = age;
        }

        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("Hello");
        }
        System.out.println("By SetAge");


    }

}
