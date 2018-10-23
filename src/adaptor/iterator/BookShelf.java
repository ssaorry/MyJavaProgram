package adaptor.iterator;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements Aggregate {

    private List<Book> bookList = new ArrayList<>();

    public int getLength(){
        return bookList.size();
    }

    public Book getBookAt(int index){
        return bookList.get(index);
    }

    public void appendBook(Book book){
        bookList.add(book);
    }

    @Override
    public Iterator iterator(){
        return new BookShelfIterator(this);
    }
}
