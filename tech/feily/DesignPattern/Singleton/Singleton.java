package tech.feily.DesignPattern.Singleton;

public class Singleton {
    private static Singleton singleton = new Singleton();
    public Singleton() {
        System.out.println("������һ��ʵ��");
    }
    public static Singleton getInstance() {
        return singleton;
    }
}
