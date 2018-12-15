package tech.feily.DesignPattern.TemplateMethod;

public abstract class TemplateMethod<T> {
    T data;
    public abstract void read(T data);
    public abstract void print(T data);
    public abstract void close();
    public final void disPlay() {
        read(data);
        for (int i = 0; i < 5; i++) {
            print(data);
        }
        close();
    }
}
