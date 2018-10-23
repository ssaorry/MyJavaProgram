package adaptor.obverse;

public class DigitObverser implements Observer {

    @Override
    public void update(NumberGenerator numberGenerator) {
        try {
            System.out.println("DigitObverser: " + numberGenerator.getNumber());
            Thread.sleep(100);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
