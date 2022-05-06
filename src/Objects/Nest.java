package Objects;


import Auxiliary.Objects;
import Exceptions.EmptyLineException;

public class Nest extends Objects {

    public Nest(String name) {

        super(name);
        try {
            if (name.matches("[ -=/*+]*") || name == null) throw new EmptyLineException("\nИмя не должно быть пустым или содержать \"-=/*+\" \nНа данный момент введённое имя: \"" + name + "\"");
        } catch (EmptyLineException e) {
            System.out.println("\033[0;31m" + e.getMessage() + "\u001B[0m");
            this.name = null;
        }
    }

    @Override
    public String toString() {
        return "Гнездо " + getName();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Nest b = (Nest) obj;
        return hashCode()==b.hashCode();
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }

}
