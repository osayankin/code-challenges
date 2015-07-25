package com.javacogito.portfolio.math.unmodifiable;

import com.javacogito.portfolio.math.IPoint;
import com.javacogito.portfolio.math.IVector;
import com.javacogito.portfolio.math.Vector;

/**
 * @author oleksiy sayankin
 */
public final class UnmodifiableVector extends Vector {
    public UnmodifiableVector(IPoint point1, IPoint point2) {
        super(point1, point2);
    }

    public UnmodifiableVector(double aX, double aY) {
        super(aX, aY);
    }

    public UnmodifiableVector(IVector vector) {
        super(vector);
    }


    @Override
    public void setXY(double x, double y) {
        //nothing to do
    }

    @Override
    public void normalize() {
        //nothing to do
    }

    @Override
    public void mult(double a) {
        //nothing to do
    }

    @Override
    public void add(IVector a) {
        //nothing to do
    }
}