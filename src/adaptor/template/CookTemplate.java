package adaptor.template;

public abstract class CookTemplate {
    public abstract void prepareWork();
    public abstract void doingWork();
    public abstract void finishWork();
    public final void cookProcess(){
        prepareWork();
        doingWork();
        finishWork();
    }
}
