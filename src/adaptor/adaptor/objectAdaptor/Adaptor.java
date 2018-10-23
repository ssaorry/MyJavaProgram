package adaptor.adaptor.objectAdaptor;

public class Adaptor implements Ps2{
    private Usber usber;

    public Adaptor(Usber usber){
        this.usber = usber;
    }

    @Override
    public void isPs2() {
        this.usber.isUsb();
    }
}
