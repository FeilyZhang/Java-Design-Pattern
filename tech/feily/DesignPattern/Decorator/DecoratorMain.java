package tech.feily.DesignPattern.Decorator;

public class DecoratorMain {

    public static void main(String[] args) {
        Display sd = new StringDisplay("Feily Zhang");
        Display dis = new SideBorder(sd);
        Display display = new FullBorder(dis);
        display.show();
    }

}
