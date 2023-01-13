package com.solvd.airoport.streams;

import com.solvd.airoport.entity.people.Pilot;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask {

    private static final Logger LOGGER = Logger.getLogger(StreamTask.class);


    //filter
    //count
    public static long filter(List<Pilot> list, int age) {
        return list.stream().filter(e -> e.getAge() >= age).count();
    }

    //foreach
    public static void printNames(List<Pilot> p){
        p.forEach(person -> LOGGER.debug(person.getName()));
    }

    //map
    public static List getNamesList(List<Pilot> p){
        return p.stream().map(person -> person.getName()).collect(Collectors.toList());
    }

    //reduce
    public static String getNamesString(List<Pilot> p){
        return p.stream().map(pilot -> pilot.getName()).reduce((a, e) -> a + " " + e).get();
    }

    //match
    public static boolean checkAge(List<Pilot> people, int age){
        return people.stream().allMatch(person -> person.getAge() >= age);
    }

    public static void main(String[] args) {
        long count = IntStream.of(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5).filter(w -> w > 0).count();
        LOGGER.debug("" + count);

        Pilot p1 = new Pilot();
        p1.setAge(18);
        p1.setName("Alejandro");
        Pilot p2 = new Pilot();
        p2.setAge(22);
        p2.setName("Vasyl");
        Pilot p3 = new Pilot();
        p3.setAge(41);
        p3.setName("Igor");

        ArrayList<Pilot> pilots = new ArrayList<>();
        pilots.add(p1);
        pilots.add(p2);
        pilots.add(p3);

        LOGGER.debug(filter(pilots, 26));
        printNames(pilots);
        LOGGER.debug(checkAge(pilots, 18));
        LOGGER.debug(getNamesList(pilots));
        LOGGER.debug(getNamesString(pilots));



    }
}
