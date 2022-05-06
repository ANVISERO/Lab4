package Auxiliary;

import Objects.Forest;

public interface Movable {
    public void move(String action, String place);
    public void move(String action);
    public void move(String action, Forest.TheEdgeOfTheForest the_edge_of_the_forest);

}