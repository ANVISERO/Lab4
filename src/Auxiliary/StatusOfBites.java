package Auxiliary;

public enum StatusOfBites {
    EXCRUCIATING("мучительный"),
    PAINFUL("болезненный"),
    DEADLY("смертельный"),
    LIGHT("лёгкий");

    private final String name;

    StatusOfBites(String name){

        this.name = name;
    }

    public String getName() {

        return name;
    }
}