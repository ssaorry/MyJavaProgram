package adaptor.factory;

public class IDCard extends Product{

    private String owner;

    IDCard(String owner){
        this.owner = owner;
        System.out.println("制作" + owner + "的卡片");
    }

    @Override
    public void use() {
        System.out.println("使用" + owner + "的ID卡");
    }
}
