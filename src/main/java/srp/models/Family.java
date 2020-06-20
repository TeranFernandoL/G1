package srp.models;

import srp.models.interfaces.IFamily;

public class Family implements IFamily{
    private String id;
    private String name;

    @Override
    public String getId(){
        return id;
    }

    @Override
    public void setId(String id){
        this.id = id;
    }

    @Override
    public String getNameFamily(){
        return name;
    }

    @Override
    public void setNameFamily(String name){
        this.name = name;
    }
}
