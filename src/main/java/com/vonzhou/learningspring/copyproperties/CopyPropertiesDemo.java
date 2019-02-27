package com.vonzhou.learningspring.copyproperties;

import org.springframework.beans.BeanUtils;

/**
 * @author vonzhou
 * @date 2019/2/26
 */
public class CopyPropertiesDemo {

    public static void main(String[] args) {

        Student s = new Student();
        s.setName("vz");
        s.setFoo(1024);
        s.setBar(-1);

        Father f = new Father();
        BeanUtils.copyProperties(s, f);
        System.out.println(f);
    }

    static class Student{
        private String name;
        private int foo;
        private int bar;

        public int getBar() {
            return bar;
        }

        public void setBar(int bar) {
            this.bar = bar;
        }

        public int getFoo() {
            return foo;
        }

        public void setFoo(int foo) {
            this.foo = foo;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }


    static class Father{
        private String name;
        private int age;
        private int salary;
        private double foo;
        private Integer bar;


        public double getFoo() {
            return foo;
        }

        public void setFoo(double foo) {
            this.foo = foo;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public Integer getBar() {
            return bar;
        }

        public void setBar(Integer bar) {
            this.bar = bar;
        }

        @Override
        public String toString() {
            return "Father{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", salary=" + salary +
                    ", foo=" + foo +
                    ", bar=" + bar +
                    '}';
        }
    }
}
