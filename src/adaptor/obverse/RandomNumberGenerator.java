package adaptor.obverse;

import java.util.Random;

// 主题类
public class RandomNumberGenerator extends NumberGenerator {

    private Random random = new Random();

    private int number;

    @Override
    public void excute() {
        for (int i = 0; i < 20; i++) {
            number = random.nextInt(50);
            notifyObservers(this);
        }
    }

    @Override
    public int getNumber() {
        return this.number;
    }
}
