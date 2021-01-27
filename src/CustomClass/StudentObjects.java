package CustomClass;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class StudentObjects {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        String str = new String("Batch 21");

        Student student1 = new Student();
        student1.setInfo("Aaron", 'M', LocalDate.of(2000,11,2), "A01", 3.5);

        System.out.println( list );
        System.out.println( str );

        System.out.println( student1.toString() );
        System.out.println( student1 );

        System.out.println("=====================================================");
        Student student2 = new Student();
        student2.setInfo("Daniel", 'M', LocalDate.of(1990, 10, 25), "B123", 3.2);

        // student2.getInfo();
        System.out.println( student2  );

        System.out.println("=========================================================");

        Student student3 = new Student();
        student3.setInfo("Mary", 'F', LocalDate.of(1995, 9, 5), "C456", 3.8 );

        System.out.println(student3);

        System.out.println("=========================================================");

        ArrayList<Student> studentList = new ArrayList<>( Arrays.asList(student1, student2, student3) );

        System.out.println( studentList );

        System.out.println("==========================================================");

        Student[] students = {student1, student2, student3};

        System.out.println(  Arrays.toString( students ) );

        System.out.println("===========================================================");
        // find the student who has ID of C456

        for (Student each : students){
            if( each.ID.equals("A01") ){
                System.out.println(each);
            }
        }

        System.out.println("===========================================================");
        Student s1 = new Student();
        Student s2 = s1;

        s1.setInfo("Aaron", 'M', LocalDate.of(2000,11,2), "A01", 3.5);
        s2.setInfo("Mary", 'F', LocalDate.of(1995, 9, 5), "C456", 3.8);

        System.out.println(s1);
        System.out.println(s2);





    }

}
