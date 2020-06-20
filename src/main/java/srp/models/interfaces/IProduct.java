package srp.models.interfaces;

import srp.models.Category;
import srp.models.Family;

public interface IProduct {

    Family family = null;
    Category category = null;
    
    void setId(String id);

    String getId();

    void setCategoryName(String name);

    String getCategoryName();

    void setAddress(String address);

    String getAddress();

    void setCategory(ICategory category);

    ICategory getCategory();

}