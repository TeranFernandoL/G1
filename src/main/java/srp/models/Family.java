package srp.models;

import org.eclipse.jetty.io.IdleTimeout;

import srp.models.interfaces.IFamily;

public class Family implements IFamily{
    private String id;
    private String name;

    public String getId(){
        return id;
    }

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
