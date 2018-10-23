package adaptor.builder;

public class MainClass {
    public static void main(String[] args){
        Builder builder = new TextBuilder();
        Director director = new Director(builder);
        director.construct();
    }
}
