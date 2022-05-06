package Objects;


import Auxiliary.*;
import Exceptions.EmptyLineException;
import Exceptions.MissedNameException;
import Exceptions.NumberOfAntsException;

public class Ants extends StoryCharacters implements Attackable {

    private static int number;
    private static String type;

    public Ants(String name, Status status, Size size, int number, String type) {

        super(name, status, size);
        this.number = number;
        this.type = type;
        try {
            if (name.matches("[ -=/*+]*") || name == null)
                throw new EmptyLineException("\nИмя не должно быть пустым или содержать \"-=/*+\" \nНа данный момент введённое имя: \"" + name + "\"");
        } catch (EmptyLineException e) {
            System.out.println("\033[0;31m" + e.getMessage() + "\u001B[0m");
            this.name = null;
        }
        try {
            if (type.matches("[ -=/*+]*") || type == null)
                throw new EmptyLineException("\nВид не должно быть пустым или содержать \"-=/*+\" \nНа данный момент введённый вид: \"" + type + "\"");
        } catch (EmptyLineException e) {
            System.out.println("\033[0;31m" + e.getMessage() + "\u001B[0m");
            this.type = null;
        }
        try {
            if (number <= 0)
                throw new NumberOfAntsException("\nКоличество муравьёв не должно быть меньше или равно нулю\nНа данный момент введённое количество муравьёв: \"" + number + "\"");
        } catch (NumberOfAntsException e) {
            System.out.println("\033[0;31m" + e.getMessage() + "\u001B[0m");
        }
    }


    public int getNumber() {
        return this.number;
    }

    public String getType() {
        return this.type;
    }

    public Dangerous getDangerous() {
        class AntsDangerous implements Dangerous {
            final int number = Ants.this.number;
            final String type = Ants.this.type;

            @Override
            public int getNumber() {
                return this.number;
            }

            @Override
            public String getType() {
                return this.type;
            }
        }
        return new AntsDangerous();
    }

    @Override
    public void attack(String attack, Scooperfield whom) {
        try {
            if (attack.matches("[ -=/*+]*") || attack == null)
                throw new EmptyLineException("\nНазвание атаки не должно быть пустым или содержать \"-=/*+\" \nНа данный момент введённое название атаки: \"" + attack + "\"");
            System.out.print("на " + whom.getName() + " " + attack + " " + getType() + " " + getName() + ", ");
        } catch (EmptyLineException e) {
            System.out.println("\033[0;31m" + e.getMessage() + "\u001B[0m");
            attack = null;
        }
    }

    public void rubbingPaws(String[] names) throws MissedNameException {
        if (names.length != number)
            throw new MissedNameException("Количество имен муравьёв не совпадает с количеством муравь\nТекущее количество имён: \"" + names.length + "\"");
        for (String name : names) {
            try {
                if (name.matches("[ -=/*+]*"))
                    throw new EmptyLineException("\n Имена не должны быть пустыми или содержать \"-=/*+\" \n");
                System.out.println(new Ant(name).name + " потирает лапки");
            } catch (EmptyLineException e) {
                System.out.println("\033[0;31m" + e.getMessage() + "\u001B[0m");
                break;
            }

        }
    }

    @Override
    public void attack(String action, Nest nest) {
    }

    @Override
    public String toString() {
        return "Муравьи " + getName() + ":" +
                " состояние = " + getStatusName() +
                ", размер = " + getSizeName() +
                ", вид = " + getType();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Ants b = (Ants) obj;
        return hashCode() == b.hashCode() && getSize() == b.getSize();
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }

    class Ant {
        private String name;

        Ant(String name) {
            this.name = name;
            try {
                if (name.matches("[ -=/*+]*") || name == null)
                    throw new EmptyLineException("\nИмя не должно быть пустым или содержать \"-=/*+\" \nНа данный момент введённое имя: \"" + name + "\"");
            } catch (EmptyLineException e) {
                System.out.println("\033[0;31m" + e.getMessage() + "\u001B[0m");
                this.name = null;
                //System.exit(0);
            }
        }
    }
}
