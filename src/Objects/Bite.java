package Objects;

import Auxiliary.Measure;
import Auxiliary.StatusOfBites;
import Exceptions.EmptyLineException;

public class Bite {
    private String name;

    public Bite(String name) {

        this.name = name;
        try {
            if (name.matches("[ -=/*+]*") || name == null) throw new EmptyLineException("\nИмя не должно быть пустым или содержать \"-=/*+\" \nНа данный момент введённое имя: \"" + name + "\"");
        } catch (EmptyLineException e) {
            System.out.println("\033[0;31m" + e.getMessage() + "\u001B[0m");
            this.name = null;
        }
    }

    public String getName() {

        return name;
    }

    public void bite(Ants ants){
        System.out.print(getName() + " " + ants.getName() + " " + Measure.VERY.getName() + " " + StatusOfBites.EXCRUCIATING.getName() + ".\n");
    }

    @Override
    public String toString() {
        return "Укус " + getName();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Bite b = (Bite) obj;
        return hashCode()==b.hashCode();
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }
}
