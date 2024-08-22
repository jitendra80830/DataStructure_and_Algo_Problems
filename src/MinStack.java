class MinStack{
    int capacity = 1000;
    int mainStack[] = new int[capacity];
    int secondaryStack[] = new int[capacity];
    int mainTopPtr;
    int secondaryTopPtr;
    MinStack(){
        mainTopPtr=-1;
        secondaryTopPtr=-1;
    }
    public void push(int element){
        if(mainTopPtr >= capacity)
            return;
        mainStack[++mainTopPtr] = element;
        if(secondaryTopPtr>=0){
            if(secondaryStack[secondaryTopPtr]>element)
                secondaryStack[++secondaryTopPtr]=element;
            else{
                secondaryStack[secondaryTopPtr+1] = secondaryStack[secondaryTopPtr];
                secondaryTopPtr+=1;
            }
        }
        else
            secondaryStack[++secondaryTopPtr]=element;
    }
    public void pop(){
        if(mainTopPtr<0){
            System.out.println("-1");
            return;
        }
        mainTopPtr-=1;
        secondaryTopPtr-=1;
    }
    public int top(){
        if(mainTopPtr<0)
            return -1;
        return mainStack[mainTopPtr];
    }
    public int getMin(){
        if(secondaryTopPtr<0)
            return -1;
        return secondaryStack[secondaryTopPtr];
    }
}