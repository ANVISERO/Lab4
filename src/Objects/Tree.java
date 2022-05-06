package Objects;

import Auxiliary.Objects;
import Exceptions.EmptyLineException;

public class Tree extends Objects {

    public Tree(String name) {

        super(name);
        try {
            if (name.matches("[ -=/*+]*") || name == null) throw new EmptyLineException("\nИмя не должно быть пустым или содержать \"-=/*+\" \nНа данный момент введённое имя: \"" + name + "\"");
        } catch (EmptyLineException e) {
            System.out.println("\033[0;31m" + e.getMessage() + "\u001B[0m");
            this.name = null;
        }
    }

    public class Hollow {
        String name;

        public Hollow(String name) {

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

        @Override
        public String toString() {
            return "Гнездо " + getName();
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Hollow b = (Hollow) obj;
            return hashCode()==b.hashCode();
        }

        @Override
        public int hashCode() {
            return getName().hashCode();
        }
    }

    @Override
    public String toString() {
        return "Дерево " + getName();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Tree b = (Tree) obj;
        return hashCode()==b.hashCode();
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }
}
