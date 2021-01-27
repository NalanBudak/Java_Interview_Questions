package Encapsulation;

import java.time.LocalDate;

public class PersonObject {

    public static void main(String[] args) {

        Person p1= new Person("Nalan",39,'F', LocalDate.of(1981,02,10));
        System.out.println(p1.getName());

        p1.setName("Ali");
        p1.setAge(10);
        p1.setGender('M');

        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        System.out.println(p1.getGender());
    }
}
