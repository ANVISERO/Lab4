package Auxiliary;

public enum Measure {
    VERY("очень");

    private final String name;

    Measure(String name){

        this.name = name;
    }

    public String getName() {

        return name;
    }
}
