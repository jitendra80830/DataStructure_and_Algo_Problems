package HeapPack;

import java.util.ArrayList;

public class Heap {

    ArrayList<Integer> data = new ArrayList<>();

    public void add(int item){
        this.data.add(item);
        upHeapfy(this.data.size()-1);

    }

    private void upHeapfy(int ci) {
        int pi = (ci -1) / 2;
        if(this.data.get(pi)>this.data.get(ci)){
            swap(pi , ci);
        }
    }

    private void swap(int pi, int ci) {
        int pith = this.data.get(pi);
        int cith = this.data.get(ci);
        this.data.set(pi ,cith); //replacing place of pi you set values of ci(cith)
        this.data.set(ci , pith);//replacing place of ci you set values of pi(pith)


    }
}

