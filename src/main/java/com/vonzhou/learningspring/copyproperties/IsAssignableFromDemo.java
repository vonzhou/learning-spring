package com.vonzhou.learningspring.copyproperties;

import org.springframework.util.ClassUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vonzhou
 * @date 2019/2/27
 */
public class IsAssignableFromDemo {
    public static void main(String[] args) {
        System.out.println(Object.class.isAssignableFrom(Object.class)); // true
        System.out.println(Object.class.isAssignableFrom(String.class)); // true
        System.out.println(List.class.isAssignableFrom(ArrayList.class)); // true
        System.out.println(int.class.isAssignableFrom(long.class)); //false
        System.out.println(int.class.isAssignableFrom(int.class));//true
    }
}
