package adaptor.adaptor.objectAdaptor;

public class MainClass {
    public static void main(String[] args){
        Ps2 ps2 = new Adaptor(new Usber());
        ps2.isPs2();
    }
}
