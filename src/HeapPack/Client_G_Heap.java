package HeapPack;

import Opps2.Cars;

public class Client_G_Heap {
    public static void main(String[] args){
        Gen_Heap<Cars> ghp = new Gen_Heap();
        ghp.add(new Cars(200,40,"Ram"));
        ghp.add(new Cars(543, 58, "black"));
        ghp.add(new Cars(430, 48, "red"));
        ghp.add(new Cars(900, 98, "white"));
        ghp.add(new Cars(600, 68, "green"));

//        ghp.add(3);
//        ghp.add(5);
//        ghp.add(7);
//        ghp.add(2);
//        ghp.add(1);
//        ghp.add(9);
//        ghp.add(13);
//        ghp.add(-2);
        ghp.display();
        //System.out.println(ghp.get());
        System.out.println(ghp.delete());
        ghp.display();
    }


}
