package tech.feily.DesignPattern.TemplateMethod;

public class Realize<T> extends TemplateMethod<T> {
    @Override
    public void read(T data) {
        this.data = data;
    }
    @Override
    public void close() {
        System.out.println("�����ϣ��ر����");
    }
    @Override
    public void print(T data) {
        System.out.println(data.toString());
    }
}
