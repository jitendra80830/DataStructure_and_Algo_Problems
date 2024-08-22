package QueuePack;

public class DynamicQueue extends Queue{
    @Override
    public void enQueue(int item) throws Exception {
        if(this.isFull()){
            int [] temp = new int[2*this.data.length];
            for(int i=0;i<this.size();i++){
                int idx = (this.front+i) % this.data.length;
                temp[i] = this.data[idx];

            }
            this.data = temp;
            this.front =0;
        }
        super.enQueue(item);

    }

}
