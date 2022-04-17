package com.solvd.interfaces;

@FunctionalInterface
public interface ObjDoubleBiConsumer<T> {
    public void accept(T t, Double a, Double b);
}
