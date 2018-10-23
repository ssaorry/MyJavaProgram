package adaptor.iterator;

public class MainClass {
    public static void main(String[] args){
        BookShelf bookShelf = new BookShelf();
        bookShelf.appendBook(new Book("中国历史"));
        bookShelf.appendBook(new Book("西方历史"));
        bookShelf.appendBook(new Book("美国历史"));
        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()){
            Book book = ( Book) iterator.next();
            System.out.println(book.getName());
        }
    }
}
