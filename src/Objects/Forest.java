package Objects;


import Auxiliary.Movable;
import Auxiliary.Objects;
import Exceptions.EmptyLineException;

public class Forest extends Objects {
   public Forest(String name) {

      super(name);
      try {
         if (name.matches("[ -=/*+]*") || name == null) throw new EmptyLineException("\nИмя не должно быть пустым или содержать \"-=/*+\" \nНа данный момент введённое имя: \"" + name + "\"");
      } catch (EmptyLineException e) {
         System.out.println("\033[0;31m" + e.getMessage() + "\u001B[0m");
         this.name = null;
      }
   }

   public void action(String action){
      try {
         if (action.matches("[ -=/*+]*") || action == null) throw new EmptyLineException("\nДействие не должно быть пустым или содержать \"-=/*+\" \nНа данный момент введённое действие: \"" + action + "\"");
         System.out.print(getName() + " " + action);
      } catch (EmptyLineException e) {
         System.out.println("\033[0;31m" + e.getMessage() + "\u001B[0m");
         action = null;
      }
   }
   public static class TheEdgeOfTheForest{

      private String name;

      public TheEdgeOfTheForest(String name) {

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
         return "Опушка " + getName();
      }

      @Override
      public boolean equals(Object obj) {
         if (this == obj) return true;
         if (obj == null || getClass() != obj.getClass()) return false;
         TheEdgeOfTheForest b = (TheEdgeOfTheForest) obj;
         return hashCode()==b.hashCode();
      }

      @Override
      public int hashCode() {
         return getName().hashCode();
      }
   }

   @Override
   public String toString() {
      return "Лес " + getName();
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) return true;
      if (obj == null || getClass() != obj.getClass()) return false;
      Forest b = (Forest) obj;
      return hashCode()==b.hashCode();
   }

   @Override
   public int hashCode() {
      return getName().hashCode();
   }
}
