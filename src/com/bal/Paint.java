package com.bal;

/**
 * Created by localadmin on 7/27/16.
 */
public enum Paint {
    Glossy(4),
    Matte(2);

    private final int cost;
    Paint(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return this.cost;
    }
}
