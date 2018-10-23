package adaptor.builder;

public class MainClass {
    public static void main(String[] args){
        Director director = new Director(BuilderContainer.get(ContainId.htmlBuildId));
        director.construct();
    }
}
