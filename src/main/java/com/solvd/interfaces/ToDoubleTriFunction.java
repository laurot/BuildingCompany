package com.solvd.interfaces;

@FunctionalInterface
public interface ToDoubleTriFunction<A, B, C> {
    public Double applyAsDouble(A a, B b, C c);
}