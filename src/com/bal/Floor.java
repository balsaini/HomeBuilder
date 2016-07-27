package com.bal;

/**
 * Created by localadmin on 7/27/16.
 */
public enum Floor {
    HARDWOOD (5),
    TILE(3),
    CARPET(2),
    LINOLEUM(1),
    BAMBOO(4);

    private final int cost;
    Floor(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return this.cost;
    }
}
