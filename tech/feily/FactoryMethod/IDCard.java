package tech.feily.FactoryMethod;

public class IDCard extends Product {
    private String owner;
    public IDCard(String owner) {
        System.out.println("制作" + owner + "的ID Card。");
        this.owner = owner;
    }
    public void use() {
        System.out.println("使用" + owner + "的ID Card。");
    }
    public String getOwner() {
        return owner;
    }
}
