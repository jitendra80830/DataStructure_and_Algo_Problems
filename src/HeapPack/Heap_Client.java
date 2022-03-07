package HeapPack;

import java.util.Scanner;

public class Heap_Client {
    public static void main(String[] args){
        Heap hp = new Heap();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int item = arr[i];
            hp.add(item);
        }
//        hp.add(3);
//        hp.add(5);
//        hp.add(7);
//        hp.add(2);
//        hp.add(1);
//        hp.add(9);
//        hp.add(13);
//        hp.add(-2);
        hp.display();
        System.out.println();
        System.out.println("Deleting min heap");

        for (int i = 0; i <n;i++) {
            System.out.print(hp.delete()+" ");
        }

//        System.out.println(hp.get());
//        System.out.println(hp.delete());
//        hp.display();
    }
}
