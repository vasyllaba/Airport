package com.solvd.airoport.entity.interfaces;

import com.solvd.airoport.entity.people.Person;

@FunctionalInterface
public interface ISearch {
    boolean search(Person p);
}
