package tech.feily.DesignPattern.Iterator;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements Aggregate {
    private List<Book> books = new ArrayList<Book>();
    public Book getBookAt(int index) {
        if (index < books.size()) {
            return books.get(index);
        } else {
            throw new IndexOutOfBoundsException("下标越界！");
        }
    }
    public boolean appendBook(Book book) {
        return books.add(book);
    }
    public int getShelfSize() {
        return books.size();
    }
    @Override
    public Iterator iterator() {
        return new BookShelfInterator(this);
    }

}
