public class Polly {

    public int car(int speed){
        return speed;
    }
    public int car(int speed, int gairs){
        return speed + gairs;

    }
    public static void main(String[] args){
        Polly p = new Polly();
       int s =  p.car(40);
        System.out.println(s);

        System.out.println(p.car(50 , 4));


    }
}
