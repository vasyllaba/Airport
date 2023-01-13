package com.solvd.airoport.reflection;

import com.solvd.airoport.entity.people.Pilot;
import org.apache.log4j.Logger;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Example {
    private static final Logger LOGGER = Logger.getLogger(Example.class);

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        LOGGER.debug("get class via reflection...");
        Class<?> clazz = Class.forName("com.solvd.airoport.entity.people.Pilot");
        LOGGER.debug("class was created : " + clazz.getName());
        LOGGER.debug("clazz have next fields : " + Arrays.toString(clazz.getDeclaredFields()));
        LOGGER.debug("clazz parent : " + clazz.getSuperclass());
        LOGGER.debug("clazz implemented interfaces : " + Arrays.toString(clazz.getInterfaces()));
        LOGGER.debug("get info about parent class : " + clazz.getSuperclass());


        Pilot pilot = new Pilot();
        pilot.setFlightHours(22);
        Method method=Class.forName("com.solvd.airoport.entity.people.Pilot").getDeclaredMethod("getFlightHours");
        LOGGER.debug("call method getFlightHours via reflection... (result should be 22)");
        int result = (int) method.invoke(pilot);
        LOGGER.debug("method getFlightHours called via reflection result is : " + result);

        LOGGER.debug("get method modifiers : " + Modifier.toString(method.getModifiers()));
        LOGGER.debug("get method return type : " + method.getReturnType());
        LOGGER.debug("get method parameters : " + Arrays.toString(method.getTypeParameters()));

        LOGGER.debug("get class constructor via reflection...");
        Constructor<?> constructor = Class.forName(clazz.getName())
                .getConstructor(String.class, String.class, Integer.class);

        LOGGER.debug("create class via reflection...");
        Object refClazz = constructor.newInstance("Antonio", "Bandera", 18);
        LOGGER.debug("class via reflection was created :" + refClazz.toString());

        Method myMethod= clazz.getMethod("getSurname");
        LOGGER.debug("call method getSurname via reflection... (result should be Bandera)");
        String myResult = (String) myMethod.invoke(refClazz);
        LOGGER.debug("method getSurname called via reflection result is : " + myResult);

        LOGGER.debug("get all class fields" + Arrays.toString(clazz.getDeclaredFields()));

        LOGGER.debug("get rank field type" + clazz.getDeclaredField("rank").getType());

    }
}
