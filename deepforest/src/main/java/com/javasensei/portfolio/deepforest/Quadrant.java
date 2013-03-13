package com.javasensei.portfolio.deepforest;

/**
 * @author oleksiy sayankin
 */
public enum Quadrant {
    FIRST, SECOND, THIRD, FORTH, FIFTH, SIXTH, SEVENTH, EIGHT;
    public static boolean isNormal(Quadrant quadrant){
        return quadrant == Quadrant.FIRST || quadrant == Quadrant.SECOND || quadrant == Quadrant.THIRD || quadrant == Quadrant.FORTH;
    }
}
