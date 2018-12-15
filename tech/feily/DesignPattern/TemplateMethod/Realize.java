package tech.feily.DesignPattern.TemplateMethod;

public class Realize<T> extends TemplateMethod<T> {
    @Override
    public void read(T data) {
        this.data = data;
    }
    @Override
    public void close() {
        System.out.println("输出完毕，关闭输出");
    }
    @Override
    public void print(T data) {
        System.out.println(data.toString());
    }
}
