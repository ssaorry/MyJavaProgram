package adaptor.listener;

import java.util.ArrayList;
import java.util.List;

public class DateResource {

    private List<Listener> listenerList = new ArrayList<>();

    public void addListener(Listener listener){
        listenerList.add(listener);
    }

    public void notifyListeners(){
        for(Listener listener : listenerList){

        }
    }
}
