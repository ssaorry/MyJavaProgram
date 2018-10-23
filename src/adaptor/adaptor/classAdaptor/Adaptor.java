package adaptor.adaptor.classAdaptor;

public class Adaptor extends Usber implements Ps2 {
    @Override
    public void isPs2() {
        isUsb();
    }
}
