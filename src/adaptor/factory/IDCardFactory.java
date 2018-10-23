package adaptor.factory;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory{

    private List<Object> list = new ArrayList<>();

    @Override
    public void registProduct(Product product) {
        list.add(product);
    }

    @Override
    public Product createProduct(String owner) {
        return new IDCard(owner);
    }
}
