package com.solvd.interfaces;

@FunctionalInterface
public interface DoubleBiFunction<T> {
    public T apply(Double a, Double b);
}
