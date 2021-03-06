package net.javacogito.math.unmodifiable;

import net.javacogito.math.IPoint;
import net.javacogito.math.IVector;
import net.javacogito.math.Vector;

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
