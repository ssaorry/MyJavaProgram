package adaptor.template;

public class Cook extends CookTemplate{

    @Override
    public void prepareWork() {
        System.out.println("洗菜，准备调料");
    }

    @Override
    public void doingWork() {
        System.out.println("炒菜");
    }

    @Override
    public void finishWork() {
        System.out.println("盛菜");
    }
}
