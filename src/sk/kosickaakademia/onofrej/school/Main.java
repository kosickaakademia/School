package sk.kosickaakademia.onofrej.school;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Grades gradeS1 = new Grades(3,2,1);
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dobS1=null;
        try {

            dobS1 = sdf.parse("2055-15-31");
        } catch (ParseException e) {
            e.printStackTrace();
        }


        System.out.println(sdf.format(dobS1));
        Student s1 = new Student("Marek","Baca",gradeS1,ClassName.N1);
        s1.setDob(dobS1);// 17.1.1995

        Student s2 = new Student("Viliam","Vozar",null, ClassName.N2);

    }
}
