package Auxiliary;

public enum Size {
    BIG("большой"),
    MIDDLE("средний"),
    SMALL("маленький");

    private final String name;

    Size(String name){

        this.name = name;
    }

    public String getName() {

        return name;
    }
}
//completed