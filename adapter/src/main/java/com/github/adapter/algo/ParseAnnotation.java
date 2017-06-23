package com.github.adapter.algo;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created by zhiyong.bao on 2017/6/8.
 */
public class ParseAnnotation {
    public static void parseTypeAnnotation() throws ClassNotFoundException {
        Class clazz = Class.forName("com.github.adapter.algo.UserAnnotation");
        Annotation[] annotations = clazz.getAnnotations();
        for (Annotation annotation : annotations) {
            TestA testA = (TestA) annotation;
            System.out.println("id= \""+testA.id()+"\"; name= \""+testA.name()+"\"; gid = "+testA.gid());
        }
    }

    public static void parseMethodAnnotation(){
        Method[] methods = UserAnnotation.class.getDeclaredMethods();
        for (Method method : methods) {
            /*
             * 判断方法中是否有指定注解类型的注解
             */
            boolean hasAnnotation = method.isAnnotationPresent(TestA.class);
            if (hasAnnotation) {
                /*
                 * 根据注解类型返回方法的指定类型注解
                 */
                TestA annotation = method.getAnnotation(TestA.class);
                System.out.println("method = " + method.getName()
                        + " ; id = " + annotation.id() + " ; description = "
                        + annotation.name() + "; gid= "+annotation.gid());
            }
        }
    }

    public static void parseConstructAnnotation(){
        Constructor[] constructors = UserAnnotation.class.getConstructors();
        for (Constructor constructor : constructors) {
        	/*
             * 判断构造方法中是否有指定注解类型的注解
             */
            boolean hasAnnotation = constructor.isAnnotationPresent(TestA.class);
            if (hasAnnotation) {
                /*
                 * 根据注解类型返回方法的指定类型注解
                 */
                TestA annotation =(TestA) constructor.getAnnotation(TestA.class);
                System.out.println("constructor = " + constructor.getName()
                        + " ; id = " + annotation.id() + " ; description = "
                        + annotation.name() + "; gid= "+annotation.gid());
            }
        }
    }

    public static void main(String[] args) {
        try {
            parseTypeAnnotation();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        parseMethodAnnotation();
        parseConstructAnnotation();
    }
}
