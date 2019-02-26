package com.vonzhou.learningspring.copyproperties;

import org.springframework.beans.BeanUtils;

/**
 * @author vonzhou
 * @date 2019/2/26
 */
public class CopyPropertiesDemo {

    public static void main(String[] args) {

        Student s = new Student();
        s.setAge(18);
        s.setName("vz");

        Father f = new Father();
        BeanUtils.copyProperties(s, f);
        System.out.println(f);


    }

    static class Student{
        private String name;
        private int age;

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
    }


    static class Father{
        private String name;
        private int age;
        private int salary;

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

        @Override
        public String toString() {
            return "Father{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", salary=" + salary +
                    '}';
        }
    }
}
