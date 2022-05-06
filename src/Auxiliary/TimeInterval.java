package Auxiliary;

public enum TimeInterval {
    LONG("долго"),
    SHORT("недолго"),
    FAST("быстро"),
    AT_THE_SAME_MOMENT("В тот же момент"),
    AT_TIMES("По временам"),
    SOON("вот-вот"),
    IN_A_FEW_MINUTES("через несколько минут");


    private final String name;

    TimeInterval(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }
}
