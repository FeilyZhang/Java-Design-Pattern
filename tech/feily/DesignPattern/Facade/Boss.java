package tech.feily.DesignPattern.Facade;

public class Boss {
    private Assistant assistant = new Assistant();
    public void treat() {
        assistant.prepareDinner();
        speak();
        assistant.endDinner();
    }
    public void speak() {
        System.out.println("我是boss，正在发言中...");
    }

}
