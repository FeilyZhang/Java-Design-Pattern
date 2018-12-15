package tech.feily.DesignPattern.Iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.appendBook(new Book("Spring MVC学习指南"));
        bookShelf.appendBook(new Book("深入理解Java虚拟机"));
        bookShelf.appendBook(new Book("JavaWeb轻量级开发面试教程"));
        bookShelf.appendBook(new Book("图解设计模式"));
        //Iterator iterator = new BookShelfInterator(bookShelf);
        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            System.out.println(((Book)iterator.next()).getName());
        }
    }
}
