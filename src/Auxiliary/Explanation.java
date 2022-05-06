package Auxiliary;

public enum Explanation {
    BECAUSE(", так как "),
    ON_THE_FACT_THAT("на то, что "),
    THAT(", что "),
    ABOUT_THAT(" о том, что ");

    private final String name;

    Explanation(String name){

        this.name = name;
    }

    public String getName() {

        return name;
    }
}
