package tech.feily.FactoryMethod;

public class IDCard extends Product {
    private String owner;
    public IDCard(String owner) {
        System.out.println("����" + owner + "��ID Card��");
        this.owner = owner;
    }
    public void use() {
        System.out.println("ʹ��" + owner + "��ID Card��");
    }
    public String getOwner() {
        return owner;
    }
}
