package Auxiliary;

public enum Whose {
    MINE("своя"),
    ALIEN("чужая");

    private final String name;

    Whose(String name){

        this.name = name;
    }

    public String getName() {

        return name;
    }
}
