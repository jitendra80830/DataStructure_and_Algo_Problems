class Student {

    int a = 10;
    int b =10;
    public Student(int a ,int b ,int e){
        System.out.println(a);
        System.out.println(b);
        System.out.println(e);

        System.out.println("Student");
    }

    public Student(int c){
        this(20,30 ,40);
    }

    public static void Hello(){
        System.out.println("Hello");

    }
}
class Student2 extends Student{
    int c =2;
    int d =3;

    public static void Hello(){
        System.out.println("Hello world");


    }

    public Student2(int c , int d) {

        super(2);
        this.c = c;
        this.d = d;
        Hello();


    }
    public static void main(String[] args){
        Student2 s = new Student2(12,19);

    }


}
