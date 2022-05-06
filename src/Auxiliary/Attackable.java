package Auxiliary;

import Objects.Scooperfield;
import Objects.Nest;

public interface Attackable {

    public void attack(String attack, Scooperfield whom);
    public void attack(String attack, Nest nest);
}
