package tech.feily.DesignPattern.TemplateMethod;

public class Main {

    public static void main(String[] args) {
        System.out.println("ѭ������ַ�\n");
        Realize<Character> realizeChar = new Realize<Character>();
        realizeChar.read('H');
        realizeChar.disPlay();
        System.out.println("\nѭ������ַ���\n");
        Realize<String> realizeString = new Realize<String>();
        realizeString.read("Hello, World");
        realizeString.disPlay();
    }

}
