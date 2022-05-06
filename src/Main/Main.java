package Main;

import Auxiliary.*;
import Exceptions.EmptyLineException;
import Objects.Scooperfield;
import Objects.Ants;
import Objects.Bite;
import Objects.Nest;
import Objects.Thought;
import Objects.Forest;
import Objects.Forest.TheEdgeOfTheForest;
import Objects.Tree;
import Objects.Tree.Hollow;


public class Main {

    public static void main(String[] args) {

        Scooperfield scooperfield = new Scooperfield("Скуперфильд", Status.NORMAL, Size.MIDDLE);
        scooperfield.sit("сидел");
        Ants ants = new Ants("муравьи", Status.AGGRESSIVE, Size.SMALL, 2000, "рыжие болотные");
        ants.attack("напали", scooperfield);
        Bite bites = new Bite("укусы");
        bites.bite(ants);
        Nest nest = new Nest("гнездо");
        scooperfield.attack("уселся", nest);
        scooperfield.defend("топтал", ants, "ногами");
        scooperfield.defend("колотил", "палкой");
        scooperfield.observe("видя", "не становится от этого меньше", ants);
        scooperfield.retreat("решил оставить", "поле боя", "отступил", ants);
        scooperfield.observe("обратил внимание");
        scooperfield.move("прибавил шаг");
        Thought thought = new Thought("Мысль");
        Forest forest = new Forest("Лес");
        thought.action(scooperfield, "придется заночевать", forest, "приводила в содрогание");
        scooperfield.observe("казалось", forest, "начинает редеть");
        Forest.TheEdgeOfTheForest theEdgeOfTheForest = new Forest.TheEdgeOfTheForest("опушка");
        scooperfield.move("очутится", theEdgeOfTheForest);
        Impression impression = new Impression() {
            @Override
            public void make_impresssion() {
                System.out.print(", но это было обманчивое впечатление. ");
            }
        };
        impression.make_impresssion();
        forest.action("не кончался");
        Darkness darkness = new Darkness() {
            @Override
            public void action(String action) {
                System.out.println(", а мрак " +  action + " все больше.");
            }
        };
        darkness.action("сгущался");
        scooperfield.undrerstand("понимал");
        Darkness darkness1 = new Darkness() {
            @Override
            public void action(String action) {
                System.out.print(" " + action + " полная темнота");
            }
        };
        darkness1.action("наступит");
        scooperfield.search("стал искать", "где бы заночевать");
        Tree tree = new Tree("дерево");
        Tree.Hollow hollow = tree.new Hollow("дупло");
        scooperfield.notice(tree, "заметил", "на высоте своего роста", hollow);
        scooperfield.overnight("залез", "начал располагаться на ночь", hollow);


    }
}
