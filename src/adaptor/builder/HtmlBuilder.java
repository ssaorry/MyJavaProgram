package adaptor.builder;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class HtmlBuilder implements Builder {

    private String fileName;
    private PrintWriter printWriter;

    public HtmlBuilder(){
        BuilderContainer.put(ContainId.htmlBuildId, this);
    }

    @Override
    public void makeTitle(String title) {
        fileName = title + ".html";
        try {
            printWriter = new PrintWriter(new OutputStreamWriter(new FileOutputStream(fileName),"UTF-8"));
        } catch (Exception e){
            e.printStackTrace();
        }
        printWriter.println("<html><head><title>" + title + "</title></head><body>");
        printWriter.println("<h1>" + title + "</h1>");
    }

    @Override
    public void makeString(String str) {
        printWriter.println("<p>" + str + "</p>");
    }

    @Override
    public void makeItems(String[] items) {
        printWriter.println("<ul>");
        for(String item : items){
            printWriter.println("<li>" + item + "</li>");
        }
        printWriter.println("</ul>");
    }

    @Override
    public void close() {
        printWriter.println("</body></html>");
        printWriter.close();
    }
}
