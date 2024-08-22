package HeapPack;

import java.util.ArrayList;

public class Heap {

    ArrayList<Integer> data = new ArrayList<>();

    public void add(int item){
        this.data.add(item);//add data in linkList
        upHeapfy(this.data.size()-1); // child index means last index

    }

    private void upHeapfy(int ci) {
        int pi = (ci -1) / 2;
        if(this.data.get(pi)>this.data.get(ci)){ // if pi>ci then swap
            swap(pi , ci);
            upHeapfy(pi); // for checking up to upper for this pass pi as parameter
        }
    }
    public int delete(){
        int rv = this.data.get(0);
        swap(0 , this.data.size() - 1);//swap 0 index and last index
        this.data.remove(this.data.size() -1); //remove last value
        dounHeapfy(0);

        return rv;
    }

    private void dounHeapfy(int pi) {
        int mini = pi;
        int lci = 2*pi+1;
        int rci = 2*pi+2;
        if(lci<this.data.size() && this.data.get(lci)<this.data.get(mini)){//if lci in range and lci<mini(pi)
            mini = lci;
        }
        if(rci<this.data.size() && this.data.get(rci)<this.data.get(mini)){ //if rci in range and rci<mini(pi)
            mini = rci;
        }
        if(mini!=pi){ //if mini not uqual to pi then swap
            swap(pi , mini);
            dounHeapfy(mini);//again call for next parent

        }

    }

    private void swap(int pi, int ci) { //swapping
        int pith = this.data.get(pi);
        int cith = this.data.get(ci);
        this.data.set(pi ,cith); //replacing place of pi you set values of ci(cith)
        this.data.set(ci , pith);//replacing place of ci you set values of pi(pith)

    }
    public void display(){
        for (int i = 0; i <data.size(); i++) {
            System.out.print(data.get(i)+" ");
        }
        //System.out.println(this.data);
    }
    public int get(){
        return this.data.get(0);
    }
    public int size(){
        return this.size();
    }
}

