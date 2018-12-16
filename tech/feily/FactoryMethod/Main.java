package tech.feily.FactoryMethod;

public class Main {

    public static void main(String[] args) {
        FactoryMethod factory = new IDCardFactoryMethod();
        Product card1 = factory.create("Feily Zhang");
        Product card2 = factory.create("Haoyue Li");
        Product card3 = factory.create("Xin Chen");
        card1.use();
        card2.use();
        card3.use();
    }

}
