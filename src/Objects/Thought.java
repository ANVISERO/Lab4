package Objects;

import Auxiliary.Explanation;
import Auxiliary.Objects;
import Exceptions.EmptyLineException;

public class Thought extends Objects {

    public Thought(String name) {

        super(name);
        try {
            if (name.matches("[ -=/*+]*") || name == null) throw new EmptyLineException("\nИмя не должно быть пустым или содержать \"-=/*+\" \nНа данный момент введённое имя: \"" + name + "\"");
        } catch (EmptyLineException e) {
            System.out.println("\033[0;31m" + e.getMessage() + "\u001B[0m");
            this.name = null;
        }
    }

    public void action(Scooperfield scooperfield, String action, Forest forrest, String action1){
        try {
            if (action.matches("[ -=/*+]*") || action == null) throw new EmptyLineException("\nДействие не должно быть пустым или содержать \"-=/*+\" \nНа данный момент введённое действие: \"" + action + "\"");
        } catch (EmptyLineException e) {
            System.out.println("\033[0;31m" + e.getMessage() + "\u001B[0m");
            action = null;
        }
        try {
            if (action1.matches("[ -=/*+]*") || action1 == null) throw new EmptyLineException("\nДействие не должно быть пустым или содержать \"-=/*+\" \nНа данный момент введённое действие: \"" + action1 + "\"");
            System.out.print(getName() + Explanation.ABOUT_THAT.getName() + scooperfield.getName() + " " + action + " в " + forrest.getName() + " " + action1 + " " + scooperfield.getName() + ". ");
        } catch (EmptyLineException e) {
            System.out.println("\033[0;31m" + e.getMessage() + "\u001B[0m");
            action1 = null;
        }

    }

    @Override
    public String toString() {
        return "Мысль " + getName();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Thought b = (Thought) obj;
        return hashCode()==b.hashCode();
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }
}
