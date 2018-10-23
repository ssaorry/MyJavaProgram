package adaptor.singleTon;

public class SingleTonClass {

    private final static SingleTonClass instance = new SingleTonClass();

    private int index;

    private SingleTonClass(){
        this.index = 0;
    }

    public int getNextIndex(){
        return index++;
    }

    public final static SingleTonClass getInstance(){
        return instance;
    }
}
