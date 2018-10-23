package adaptor.builder;

public class Director {

    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public void construct(){
        builder.makeTitle("java从入门到放弃");
        builder.makeString("第一章");
        builder.makeItems(new String[]{"第一节", "第二节", "第三节"});
        builder.makeString("第二章");
        builder.makeItems(new String[]{"第一节", "第二节", "第三节"});
        builder.close();
    }
}
