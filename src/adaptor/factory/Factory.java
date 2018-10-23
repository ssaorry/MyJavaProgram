package adaptor.factory;

public abstract class Factory {
    public final Product create(String owner){
        Product product = createProduct(owner);
        registProduct(product);
        return product;
    }
    public abstract void registProduct(Product product);
    public abstract Product createProduct(String owner);
}
