package adaptor.obverse;

public class IncrementalNumberGenerator extends NumberGenerator {

    private int startNumber;
    private int endNumber;
    private int step;

    public IncrementalNumberGenerator(int startNumber, int endNumber, int step) {

        try {
            if (endNumber < startNumber) {
                throw new Exception("endNumber 不能小于 startNumber");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.startNumber = startNumber;
        this.endNumber = endNumber;
        this.step = step;
    }

    @Override
    public void excute() {
        int time = (this.endNumber - this.startNumber) / this.step;
        for (int i = 0; i < time; i++) {
            startNumber += step;
            notifyObservers(this);
        }
    }

    @Override
    public int getNumber() {
        return startNumber;
    }
}
