package com.bal;

/**
 * Created by localadmin on 7/27/16.
 */
public enum Floor {
    HARDOOD (5),
    TILE(3),
    CARPET(2),
    LINOLEUM(1),
    BAMBOO(4);

    private final float cost;
    Floor(float cost) {
        this.cost = cost;
    }
}
