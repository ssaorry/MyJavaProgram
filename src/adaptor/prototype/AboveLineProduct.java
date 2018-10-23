package adaptor.prototype;

public class AboveLineProduct extends Product {
    @Override
    public void use(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.println(str);
    }
}
