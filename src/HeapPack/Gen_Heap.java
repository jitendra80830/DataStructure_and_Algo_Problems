package HeapPack;

import java.util.ArrayList;

public class Gen_Heap<T extends Comparable<T>>{

    private ArrayList<T> data = new ArrayList<>();

    public void add(T item){
        this.data.add(item);//add data in linkList
        upHeapfy(this.data.size()-1); // child index means last index

    }

    private void upHeapfy(int ci) {
        int pi = (ci -1) / 2;
        if(isLarger(this.data.get(ci) , this.data.get(pi))>0){ // if pi>ci then swap ,this.data.get(pi)>this.data.get(ci)
            swap(pi , ci);
            upHeapfy(pi); // for checking up to upper for this pass pi as parameter
        }
    }
    public T delete(){
        T rv = this.data.get(0);
        swap(0 , this.data.size() - 1);//swap 0 index and last index
        this.data.remove(this.data.size() -1); //remove last value
        dounHeapfy(0);

        return rv;
    }

    private void dounHeapfy(int pi) {
        int mini = pi;
        int lci = 2*pi+1;
        int rci = 2*pi+2;
        if(lci<this.data.size() && isLarger(this.data.get(lci) , this.data.get(mini))>0){//if lci in range and lci<mini(pi)  lci<this.data.size() && this.data.get(lci)<this.data.get(mini)
            mini = lci;
        }
        if(rci<this.data.size() && isLarger(this.data.get(rci) , this.data.get(mini))>0){ //if rci in range and rci<mini(pi)   this.data.get(rci)<this.data.get(mini)
            mini = rci;
        }
        if(mini!=pi){ //if mini not uqual to pi then swap
            swap(pi , mini);
            dounHeapfy(mini);//again call for next parent

        }

    }

    private void swap(int pi, int ci) { //swapping
        T pith = this.data.get(pi);
        T cith = this.data.get(ci);
        this.data.set(pi ,cith); //replacing place of pi you set values of ci(cith)
        this.data.set(ci , pith);//replacing place of ci you set values of pi(pith)

    }
    public void display(){
        System.out.println(this.data);
    }
    public T get(){
        return this.data.get(0);
    }
    public int size(){
        return this.size();
    }
    public int isLarger(T o1 ,T o2){
        return o1.compareTo(o2); //if o1 if positive
    }
}


