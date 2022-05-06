package Auxiliary;

import Objects.Ants;

public interface Defendable {

    public void defend(String action, Ants ants, String bywhat);
    public void defend(String action, String bywhat);

}