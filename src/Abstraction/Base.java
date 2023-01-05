package Abstraction;

public abstract class Base {
    protected String name;

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    
    public String toString (){
        return name +" " +
                "is trying to sleep and recover";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
