package Auxiliary;

public enum Status {
    FEARFUL("боязливый"),
    TERRIBLE("страшный"),
    NORMAL("нормальный"),
    LIGHT("лёгкий"),
    AGGRESSIVE("агрессивный");

    private final String name;

    Status(String name){

        this.name = name;
    }

    public String getName() {

        return name;
    }
}
//completed