package com.javasensei.portfolio.particles.math;

/**
 * @author oleksiy sayankin
 */
public interface IRay extends IFigure{
    IVector toVector();
    IPoint startPoint();
    ILine toLine();

}
