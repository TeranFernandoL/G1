package srp.models.interfaces;

public interface ICategory {

    void setId(String id);

    String getId();

    void setCategoryName(String name);

    String getCategoryName();

    void setFamily(IFamily family);

    IFamily getFamily();

}