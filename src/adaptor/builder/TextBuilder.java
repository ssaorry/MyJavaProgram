package adaptor.builder;

public class TextBuilder implements Builder {

    private StringBuffer stringBuffer = new StringBuffer();

    public TextBuilder(){
        BuilderContainer.put(ContainId.textBuildId, this);
    }

    @Override
    public void makeTitle(String title) {
        stringBuffer.append("**********************************\n");
        stringBuffer.append("<<" + title + ">>");
        stringBuffer.append("\n");
    }

    @Override
    public void makeString(String str) {
        stringBuffer.append("\n" + str + "\n");
    }

    @Override
    public void makeItems(String[] items) {
        for(String item : items){
            stringBuffer.append("   ·" + item + "\n");
        }
    }

    @Override
    public void close() {
        stringBuffer.append("**********************************\n");
    }
}
