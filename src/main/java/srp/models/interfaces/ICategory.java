package srp.models.interfaces;

public interface ICategory {

    void setCategoryName(String name);

    String getCategoryName();

    void setFamily(IFamily family);

    IFamily getFamily();

}