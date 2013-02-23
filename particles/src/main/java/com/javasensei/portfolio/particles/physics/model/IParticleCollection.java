package com.javasensei.portfolio.particles.physics.model;

import com.javasensei.portfolio.math.IPoint;
import com.javasensei.portfolio.math.IVector;

/**
 * @author oleksiy sayankin
 */
public interface IParticleCollection<E extends IParticleModel> extends Iterable<E> {
    void stretch(IPoint stretchPoint, IVector direction);
    public void addParticles(int count);
    void moveAll();

}
