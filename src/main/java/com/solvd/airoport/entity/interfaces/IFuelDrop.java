package com.solvd.airoport.entity.interfaces;

@FunctionalInterface
public interface IFuelDrop<T1, T2, R> {
    R drop(T1 arg1, T2 arg2);
}
