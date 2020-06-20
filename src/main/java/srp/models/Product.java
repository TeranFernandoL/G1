package srp.models;

import srp.models.interfaces.ICategory;
import srp.models.interfaces.IProduct;

public class Product implements IProduct{
    private String id;
    private String name;
    private String address;
    private ICategory category;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getCategoryName() {
        return name;
    }

    @Override
    public void setCategoryName(String name) {
        this.name = name;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public ICategory getCategory() {
        return category;
    }

    @Override
    public void setCategory(ICategory category) {
        this.category = category;
    }
}