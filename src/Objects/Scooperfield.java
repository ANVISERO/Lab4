package Objects;


import Auxiliary.*;
import Exceptions.EmptyLineException;

public class Scooperfield extends StoryCharacters implements Movable, Attackable, Defendable{


    public Scooperfield(String name, Status status, Size size) {

        super(name, status, size);
        try {
            if (name.matches("[ -=/*+]*") || name == null) throw new EmptyLineException("\nИмя не должно быть пустым или содержать \"-=/*+\" \nНа данный момент введённое имя: \"" + name + "\"");
        } catch (EmptyLineException e) {
            System.out.println("\033[0;31m" + e.getMessage() + "\u001B[0m");
            this.name = null;
        }
    }

    public void sit(String action){

        try {
            if (action.matches("[ -=/*+]*") || action == null) throw new EmptyLineException("\nДействие не должно быть пустым или содержать \"-=/*+\" \nНа данный момент введённое действие: \"" + action + "\"");
            System.out.print(getName() + " " + action + " " + TimeInterval.SHORT.getName() + Explanation.BECAUSE.getName());
        } catch (EmptyLineException e) {
            System.out.println("\033[0;31m" + e.getMessage() + "\u001B[0m");
            action = null;
        }
    }

    @Override
    public void attack(String attack, Nest nest){
        try {
            if (attack.matches("[ -=/*+]*") || attack == null) throw new EmptyLineException("\nНазвание атаки не должно быть пустым или содержать \"-=/*+\" \nНа данный момент введённое название атаки: \"" + attack + "\"");
            System.out.print(getName() + ", сам того не подозревая, " + attack + " " + "на их " + nest.getName() + ". ");
        } catch (EmptyLineException e) {
            System.out.println("\033[0;31m" + e.getMessage() + "\u001B[0m");
            attack = null;
        }
    }

    @Override
    public void attack(String attack, Scooperfield whom){}

    @Override
    public void defend(String action, Ants ants, String bywhat){
        try {
            if (action.matches("[ -=/*+]*") || action == null) throw new EmptyLineException("\nДействие не должно быть пустым или содержать \"-=/*+\" \nНа данный момент введённое действие: \"" + action + "\"");
        } catch (EmptyLineException e) {
            System.out.println("\033[0;31m" + e.getMessage() + "\u001B[0m");
            action = null;
        }
        try {
            if (bywhat.matches("[ -=/*+]*") || bywhat == null) throw new EmptyLineException("\nНазвание предмета не должно быть пустым или содержать \"-=/*+\" \nНа данный момент введённое название предмета: \"" + bywhat + "\"");
            System.out.print("Сначала " + getName() + " " + action + " " + ants.getType() + " " + ants.getName() + " " + bywhat + " и ");
        } catch (EmptyLineException e) {
            System.out.println("\033[0;31m" + e.getMessage() + "\u001B[0m");
            bywhat = null;
        }
    }

    @Override
    public void defend(String action, String bywhat){
        try {
            if (action.matches("[ -=/*+]*") || action == null) throw new EmptyLineException("\nДействие не должно быть пустым или содержать \"-=/*+\" \nНа данный момент введённое действие: \"" + action + "\"");
        } catch (EmptyLineException e) {
            System.out.println("\033[0;31m" + e.getMessage() + "\u001B[0m");
            action = null;
        }
        try {
            if (bywhat.matches("[ -=/*+]*") || bywhat == null) throw new EmptyLineException("\nНазвание предмета не должно быть пустым или содержать \"-=/*+\" \nНа данный момент введённое название предмета: \"" + bywhat + "\"");
            System.out.print(action + " " + Whose.MINE.getName() + " " + bywhat + ", \n");
        } catch (EmptyLineException e) {
            System.out.println("\033[0;31m" + e.getMessage() + "\u001B[0m");
            bywhat = null;
        }
    }

    @Override
    public void move(String action, String place){
        try {
            if (action.matches("[ -=/*+]*") || action == null) throw new EmptyLineException("\nДействие не должно быть пустым или содержать \"-=/*+\" \nНа данный момент введённое действие: \"" + action + "\"");
        } catch (EmptyLineException e) {
            System.out.println("\033[0;31m" + e.getMessage() + "\u001B[0m");
            action = null;
        }
        try {
            if (place.matches("[ -=/*+]*") || place == null) throw new EmptyLineException("\nНазвание места не должно быть пустым или содержать \"-=/*+\" \nНа данный момент введённое название места: \"" + place + "\"");
            System.out.println(getName() + " " + TimeInterval.SOON + " " + action + " " + place);
        } catch (EmptyLineException e) {
            System.out.println("\033[0;31m" + e.getMessage() + "\u001B[0m");
            place = null;
        }
    }

    public void observe(String observe, String action, Ants ants){
        try {
            if (observe.matches("[ -=/*+]*") || observe == null) throw new EmptyLineException("\nДействие не должно быть пустым или содержать \"-=/*+\" \nНа данный момент введённое действие: \"" + observe + "\"");
        } catch (EmptyLineException e) {
            System.out.println("\033[0;31m" + e.getMessage() + "\u001B[0m");
            observe = null;
        }
        try {
            if (action.matches("[ -=/*+]*") || action == null) throw new EmptyLineException("\nДействие не должно быть пустым или содержать \"-=/*+\" \nНа данный момент введённое действие: \"" + action + "\"");
            System.out.print("но, " + observe + Explanation.THAT.getName() + ants.getName() + " " + action + ", ");
        } catch (EmptyLineException e) {
            System.out.println("\033[0;31m" + e.getMessage() + "\u001B[0m");
            action = null;
        }
    }

    public void retreat(String action1, String what, String action2, Ants ants){
        try {
            if (action1.matches("[ -=/*+]*") || action1 == null) throw new EmptyLineException("\nДействие не должно быть пустым или содержать \"-=/*+\" \nНа данный момент введённое действие: \"" + action1 + "\"");
        } catch (EmptyLineException e) {
            System.out.println("\033[0;31m" + e.getMessage() + "\u001B[0m");
            action1 = null;
        }
        try {
            if (what.matches("[ -=/*+]*") || what == null) throw new EmptyLineException("\nНазвание места не должно быть пустым или содержать \"-=/*+\" \nНа данный момент введённое название места: \"" + what + "\"");
        } catch (EmptyLineException e) {
            System.out.println("\033[0;31m" + e.getMessage() + "\u001B[0m");
            what = null;
        }
        try {
            if (action2.matches("[ -=/*+]*") || action2 == null) throw new EmptyLineException("\nДействие не должно быть пустым или содержать \"-=/*+\" \nНа данный момент введённое действие: \"" + action2 + "\"");
            if(ants.getNumber() >= 1000) {
                System.out.print(action1 + " " + what + " и " + action2 + ".\n");
                setStatus(Status.FEARFUL);
            }
            else{
                System.out.println(" Не испугался и продолжил сидеть. ");
            }
        } catch (EmptyLineException e) {
            System.out.println("\033[0;31m" + e.getMessage() + "\u001B[0m");
            action2 = null;
        }
    }

    public void observe(String action){
        try {
            if (action.matches("[ -=/*+]*") || action == null) throw new EmptyLineException("\nДействие не должно быть пустым или содержать \"-=/*+\" \nНа данный момент введённое действие: \"" + action + "\"");
            System.out.print(TimeInterval.AT_THE_SAME_MOMENT.getName() + " " + getName() + " " + action + " " + Explanation.ON_THE_FACT_THAT.getName() +  "вокруг стало темней. ");
        } catch (EmptyLineException e) {
            System.out.println("\033[0;31m" + e.getMessage() + "\u001B[0m");
            action = null;
        }
    }

    @Override
    public void move(String action){
        try {
            if (action.matches("[ -=/*+]*") || action == null) throw new EmptyLineException("\nДействие не должно быть пустым или содержать \"-=/*+\" \nНа данный момент введённое действие: \"" + action + "\"");
            System.out.print("Сообразив" + Explanation.THAT.getName() + "день подошел к концу, " + getName() + " " + action + ". \n");
        } catch (EmptyLineException e) {
            System.out.println("\033[0;31m" + e.getMessage() + "\u001B[0m");
            action = null;
        }
    }

    public void observe(String action, Forest forest, String action1){
        try {
            if (action.matches("[ -=/*+]*") || action == null) throw new EmptyLineException("\nДействие не должно быть пустым или содержать \"-=/*+\" \nНа данный момент введённое действие: \"" + action + "\"");
        } catch (EmptyLineException e) {
            System.out.println("\033[0;31m" + e.getMessage() + "\u001B[0m");
            action = null;
        }
        try {
            if (action1.matches("[ -=/*+]*") || action1 == null) throw new EmptyLineException("\nДействие не должно быть пустым или содержать \"-=/*+\" \nНа данный момент введённое действие: \"" + action1 + "\"");
            System.out.print(TimeInterval.AT_TIMES.getName() + " " + getName() + " " + action + Explanation.THAT.getName() + forest.getName() + " " + action1 + " и\n");
        } catch (EmptyLineException e) {
            System.out.println("\033[0;31m" + e.getMessage() + "\u001B[0m");
            action1 = null;
        }
    }

    @Override
    public void move(String action, Forest.TheEdgeOfTheForest the_edge_of_the_forest){
        try {
            if (action.matches("[ -=/*+]*") || action == null) throw new EmptyLineException("\nДействие не должно быть пустым или содержать \"-=/*+\" \nНа данный момент введённое действие: \"" + action + "\"");
            System.out.print(getName() + " вот-вот " + action + " на " + the_edge_of_the_forest.getName());
        } catch (EmptyLineException e) {
            System.out.println("\033[0;31m" + e.getMessage() + "\u001B[0m");
            action = null;
        }
    }

    public void  undrerstand(String action){
        try {
            if (action.matches("[ -=/*+]*") || action == null) throw new EmptyLineException("\nДействие не должно быть пустым или содержать \"-=/*+\" \nНа данный момент введённое действие: \"" + action + "\"");
            System.out.print(getName() + " " + action + Explanation.THAT.getName() + TimeInterval.IN_A_FEW_MINUTES.getName());
        } catch (EmptyLineException e) {
            System.out.println("\033[0;31m" + e.getMessage() + "\u001B[0m");
            action = null;
        }
    }

    public void search(String action, String what){
        try {
            if (action.matches("[ -=/*+]*") || action == null) throw new EmptyLineException("\nДействие не должно быть пустым или содержать \"-=/*+\" \nНа данный момент введённое действие: \"" + action + "\"");
        } catch (EmptyLineException e) {
            System.out.println("\033[0;31m" + e.getMessage() + "\u001B[0m");
            action = null;
        }
        try {
            if (what.matches("[ -=/*+]*") || what == null) throw new EmptyLineException("\nНазвание места не должно быть пустым или содержать \"-=/*+\" \nНа данный момент введённое название места: \"" + what + "\"");
            System.out.println(", и " + action + " " + what +  ".");
        } catch (EmptyLineException e) {
            System.out.println("\033[0;31m" + e.getMessage() + "\u001B[0m");
            what = null;
        }
    }

    public void notice(Tree tree, String action, String where, Tree.Hollow hollow){
        try {
            if (action.matches("[ -=/*+]*") || action == null) throw new EmptyLineException("\nДействие не должно быть пустым или содержать \"-=/*+\" \nНа данный момент введённое действие: \"" + action + "\"");
        } catch (EmptyLineException e) {
            System.out.println("\033[0;31m" + e.getMessage() + "\u001B[0m");
            action = null;
        }
        try {
            if (where.matches("[ -=/*+]*") || where == null) throw new EmptyLineException("\nНазвание места не должно быть пустым или содержать \"-=/*+\" \nНа данный момент введённое название места: \"" + where + "\"");
            System.out.print("В " + tree.getName() + " " + getName() + " " + action + " " + where + " " + Size.BIG.getName() + " " + hollow.getName() + ".");
        } catch (EmptyLineException e) {
            System.out.println("\033[0;31m" + e.getMessage() + "\u001B[0m");
            where = null;
        }
    }

    public void overnight(String action1, String action2, Tree.Hollow hollow){
        try {
            if (action1.matches("[ -=/*+]*") || action1 == null) throw new EmptyLineException("\nДействие не должно быть пустым или содержать \"-=/*+\" \nНа данный момент введённое действие: \"" + action1 + "\"");
        } catch (EmptyLineException e) {
            System.out.println("\033[0;31m" + e.getMessage() + "\u001B[0m");
            action1 = null;
        }
        try {
            if (action2.matches("[ -=/*+]*") || action2 == null) throw new EmptyLineException("\nДействие не должно быть пустым или содержать \"-=/*+\" \nНа данный момент введённое действие: \"" + action2 + "\"");
            System.out.println(" Решив" + Explanation.THAT.getName() + "более удобного места для ночлега теперь уже не найти,\n" + getName() + " " + action1 + " в это " + hollow.getName() + " и " + action2 + ".");
        } catch (EmptyLineException e) {
            System.out.println("\033[0;31m" + e.getMessage() + "\u001B[0m");
            action2 = null;
        }

    }

    @Override
    public String toString() {
        return "Скуперфильд " + getName() +":"+
                " состояние = " + getStatusName() +
                ", размер = " + getSizeName();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Scooperfield b = (Scooperfield) obj;
        return hashCode()==b.hashCode() && getSize() == b.getSize();
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }
}
