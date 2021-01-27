package CustomClass;

import java.time.LocalDate;

public class Student {

    public String name, ID;
    public LocalDate DOfB;
    public int age;
    public char gender;
    public double gpa;

    // ==

    public void setInfo(String name, char gender, LocalDate DOfB, String ID, double gpa){
        this.name  = name;
        this.gender =gender;
        this.DOfB = DOfB;
        age = LocalDate.now().getYear() - DOfB.getYear();
        this.ID = ID;
        this.gpa = gpa;
    }


    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", DOfB=" + DOfB +
                ", age=" + age +
                ", gender=" + gender +
                ", gpa=" + gpa +
                '}';
    }


}
/*
1. Student:
            Attributes:
                    name, age, gender, ID
            Actions:
                setInfo
                getInfo
                study
    toString methods: gets executed auotomatically when you pass the object in print statement
				  instance return method, String
				  No argument
 */