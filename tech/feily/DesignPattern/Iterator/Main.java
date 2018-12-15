package tech.feily.DesignPattern.Iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.appendBook(new Book("Spring MVCѧϰָ��"));
        bookShelf.appendBook(new Book("�������Java�����"));
        bookShelf.appendBook(new Book("JavaWeb�������������Խ̳�"));
        bookShelf.appendBook(new Book("ͼ�����ģʽ"));
        //Iterator iterator = new BookShelfInterator(bookShelf);
        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            System.out.println(((Book)iterator.next()).getName());
        }
    }
}
