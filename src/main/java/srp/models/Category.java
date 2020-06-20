package srp.models;

import srp.models.interfaces.ICategory;
import srp.models.interfaces.IFamily;

public class Category implements ICategory{
    private String id;
    private String name;
    private IFamily family;

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
    public IFamily getFamily() {
        return family;
    }

    @Override
    public void setFamily(IFamily family) {
        this.family = family;
    }
}
