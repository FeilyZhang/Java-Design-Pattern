package tech.feily.FactoryMethod;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactoryMethod extends FactoryMethod {
    private List list = new ArrayList();
    @Override
    public Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    public void registerProduct(Product product) {
        list.add(((IDCard)product).getOwner());
    }
    public List getOwner() {
        return list;
    }
}
