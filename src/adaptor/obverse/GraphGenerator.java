package adaptor.obverse;

public class GraphGenerator implements Observer {
    @Override
    public void update(NumberGenerator numberGenerator) {
        try {
            int number = numberGenerator.getNumber();
            String str = "GraphGenerator: ";
            for (int i = 0; i < number; i++) {
                str += "*";
            }
            System.out.println(str);
            Thread.sleep(100);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
