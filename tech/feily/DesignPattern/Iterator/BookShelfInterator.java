package tech.feily.DesignPattern.Iterator;

public class BookShelfInterator implements Iterator {
    private BookShelf bookShelf;
    private int index;
    private int bookShelfSize;
    public BookShelfInterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
        this.bookShelfSize = bookShelf.getShelfSize();
    }
    @Override
    public boolean hasNext() {
        if (index < bookShelfSize) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public Object next() {
        return bookShelf.getBookAt(index++);
    }
}
