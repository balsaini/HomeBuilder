package com.bal;

/**
 * Created by localadmin on 7/27/16.
 */
public enum Paint {
    Glossy(4),
    Matte(2);

    private final float cost;
    Paint(float cost) {
        this.cost = cost;
    }
}
