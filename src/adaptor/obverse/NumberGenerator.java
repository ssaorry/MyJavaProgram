package adaptor.obverse;

import java.util.Enumeration;
import java.util.Vector;

public abstract class NumberGenerator {

    private Vector<Observer> observerList = new Vector<>();

    public void addObserver(Observer observer){
        observerList.add(observer);
    }

    public void deleteObserver(Observer observer){
        observerList.remove(observer);
    }

    public void notifyObservers(NumberGenerator numberGenerator){
        Enumeration enumeration = observerList.elements();
        while(enumeration.hasMoreElements()){
            Observer observer = (Observer) enumeration.nextElement();
            observer.update(numberGenerator);
        }
    }

    public abstract void excute(); // 生成数值

    public abstract int getNumber(); // 获取数值
}
