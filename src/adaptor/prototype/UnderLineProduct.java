package adaptor.prototype;

public class UnderLineProduct extends Product {
    @Override
    public void use(String string) {
        System.out.println(string);
        for (int i = 0; i < string.length(); i++) {
            System.out.print("-");
        }
    }
}
